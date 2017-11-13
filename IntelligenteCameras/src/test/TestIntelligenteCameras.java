package test;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.log4j.xml.Log4jEntityResolver;

import factory.ActorFactory;
import model.ITrackable;
import model.actor.Camera;
import model.actor.Dispatch;
import model.actor.Patrouille;
import utilities.Randomizer;

public class TestIntelligenteCameras {
	public static Logger log = Logger.getLogger(TestIntelligenteCameras.class.getName());
	public static LinkedList<ITrackable> voertuigen = Randomizer.getVoertuigen();
	public static LinkedList<Patrouille> patrouilles = Randomizer.getPatrouilles();
	public static LinkedList<ITrackable> gedetecteerd = new LinkedList<>();
	public static LinkedList<ITrackable> geseind = new LinkedList<>();
	public static Dispatch dispatch = (Dispatch) ActorFactory.createActor(ActorFactory.DISPATCH,Randomizer.getLocatie());


	public static void main(String[] args) {
		
		log.setLevel(Level.ALL);
		configureerData();
		printBasicData();
		simuleerAchtervolging();
	}

	/**
	 * 	 achtervolging simuleren
	 */
	private static void simuleerAchtervolging() {
		log.info("\n\nDe achtervolging wordt ingezet: ");
		registreerPatrouilles(patrouilles);
		detecteerVoertuigen(dispatch.getCameras(), voertuigen);
		achtervolgingVoertuigen();
		log.info(String.format("\n\nDe volgende Voertuigen werden achtervolgd: %s",	dispatch.getGesignaleerd()));
	}

	/**
	 * 	configureren van basic data
	 */
	private static void configureerData() {
		dispatch.setCameras(Randomizer.getCameras());
		for (int i = 0; i < 10; i++) {
			geseind.add(Randomizer.seinGestolenVoertuig(voertuigen));
			geseind.add(Randomizer.seinNietVerzekerdVoertuig(voertuigen));
			geseind.add(Randomizer.seinReedTeSnelVoertuig(voertuigen));
		}
		dispatch.setGeseind(geseind);
	}

	/**
	 * 	Afprinten gegevens
	 */
	private static void printBasicData() {
		log.info(String.format("De volgende Dispatch werd gegenereerd: %s", dispatch) + "\n\n");
		log.info(String.format("De volgende Voertuigen werden gegenereerd: %s",	voertuigen) + "\n\n");
		log.info(String.format("De volgende Patrouilles werden gegenereerd: %s", patrouilles) + "\n\n");
		log.info(String.format("De volgende Cameras werden gegenereerd: %s", dispatch.getCamerasAsString()) + "\n\n");
		log.info(String.format("De volgende Voertuigen werden geseind: %s", dispatch.getGeseind()));
	}

	/**
	 * Welke voertuigen werden door een camera opgemerkt
	 * @param cameras
	 * @param voertuigen
	 */
	private static void detecteerVoertuigen(LinkedList<Camera> cameras, LinkedList<ITrackable> voertuigen) {
		ListIterator<ITrackable> listVoertuigen = voertuigen.listIterator();
		ListIterator<Camera> listCameras = cameras.listIterator();
		ITrackable voertuig;
		Camera camera;
		while (listCameras.hasNext()) {
			camera = listCameras.next();
			while (listVoertuigen.hasNext()) {
				voertuig = listVoertuigen.next();
				if (camera.getLocatie().equals(voertuig.getLocatie())) {
					gedetecteerd.add(voertuig);
					dispatch.signaleer(voertuig);
				}
			}
		}
	}


	/**
	 * Welke patrouilles een achtervolging uitvoeren
	 */
	private static void achtervolgingVoertuigen() {
		boolean patrouilleInAchtervolging = false;		
		for(Patrouille patrouille : patrouilles)
		{
			if (patrouille.getGesignaleerd().size() == 0)
				continue;
			patrouilleInAchtervolging = true;	
			log.info(String.format("%s zet achtervolging in voor %s\n", patrouille, patrouille.getGesignaleerdString()));
		}
		
		if (!patrouilleInAchtervolging)
			log.info("\tEr is geen enkele patrouille in achtervolging!");
		
		log.info(String.format("\n\nDe volgende Voertuigen werden door cameras gedetecteerd: %s", gedetecteerd));
	}

	/**
	 * Enkel beschikbare patrouilles kunnen worden ingezet voor een achtervolging
	 * @param patrouilles
	 */
	private static void registreerPatrouilles(LinkedList<Patrouille> patrouilles) {
		CopyOnWriteArrayList<Patrouille> copyList = new CopyOnWriteArrayList<Patrouille>(patrouilles);
		// CopyOnWriteArrayList wordt gebruikt ter vervanging van LinkedList 
		// om de onderliggende elementen te kunnen wijzigen.
		ListIterator<Patrouille> list = copyList.listIterator();
		Patrouille patrouille;
		int i = 0;
		while (list.hasNext()) {
			patrouille = list.next();
			if (i++ % 3 == 0) {
				dispatch.addObserver(patrouille); //registreert elke 3de patrouille
			}
		}
	}

}
