package model;

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
