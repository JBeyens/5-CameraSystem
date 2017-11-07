package factory;

import model.Camera;
import model.Locatie;
import model.actor.Actor;
import model.actor.Dispatch;
import model.actor.Patrouille;
import model.actor.Vehicle;
import randomizer.Randomizer;

public class ActorFactory {
	public static final int DISPATCH = 1;
    public static final int PATROUILLE = 2;
    public static final int CAMERA = 3;
    public static final int VOERTUIG = 4;
    public static Actor createActor(int type, Locatie locatie){
        Actor actor = null;
        switch(type){
            case DISPATCH:
            	actor = new Dispatch(locatie); 
                break;
            
            case PATROUILLE: 
            	actor = new Patrouille(locatie);
                break;
                
            case CAMERA: 
            	actor = new Camera(locatie);   
                break;
                
            case VOERTUIG:
            	actor = new Vehicle(locatie);
                 ((Vehicle)actor).setNummerPlaat(Randomizer.getNummerPlaat());
                 ((Vehicle)actor).setMerk(Randomizer.getMerk());
                break;
                
        }
        return actor;
    }

}
