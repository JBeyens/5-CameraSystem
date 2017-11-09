package model.actor;

import factory.ActorFactory;
import model.Foto;
import model.Locatie;

public class Camera extends Actor
{//triviale properties en methods van een Camera
    private static int count = 0;
    /**
     * Constructor for objects of class Camera
     */
    public Camera(Locatie locatie)
    {
        // initialise instance variables
        super(locatie);
        setCounter(++count);
    }
    public double getSnelheid(Voertuig voertuig){ 
    //snelheidsherkenning in km/u
        return 0.0;//dummy waarde
    }
    public Voertuig getVoertuig(Foto foto){
    //herken voertuig op basis van foto (buiten scope)
        return (Voertuig)ActorFactory.createActor(ActorFactory.VOERTUIG, getLocatie());
    }
    
    public Foto getFoto(){
        // fotograferen van een voertuig (buiten scope)
            return new Foto();
    }
}
