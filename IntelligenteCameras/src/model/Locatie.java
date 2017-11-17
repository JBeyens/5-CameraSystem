package model;


/**
 * 	@Author Ben Vandevorst & Jef Beyens
	@Datum 17/11/2017
	@Project Intelligente Cameras
	@Doel Holds a location to localise an object
 */

public class Locatie {
	private String locatie;

    /**
     * Constructor for objects of class Locatie
     */
    public Locatie(String locatie)
    {
        // initialize instance variables
        setLocatie(locatie);
    }
    public void setLocatie(String locatie){
        this.locatie = locatie;
    }
    public String getLocatie(){
        return locatie;
    }

    public boolean equals(Locatie locatie){
    	return this.locatie.equals(locatie.getLocatie());
    }
    
    @Override
    public String toString(){
    	return getLocatie();
    }

}
