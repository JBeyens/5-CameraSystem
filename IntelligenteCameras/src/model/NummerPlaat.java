package model;


/**
 * 	@Author Ben Vandevorst & Jef Beyens
	@Datum 17/11/2017
	@Project Intelligente Cameras
	@Doel Model => holds Nummerplaat + Boolean ( is deze geseind? )
 */

public class NummerPlaat {
	private boolean geseind;
    private String nummerPlaat;

    /**
     * Constructor for objects of class NummerPlaat
     */
    public NummerPlaat(String nummerPlaat)
    {
        this.nummerPlaat = nummerPlaat;
        this.geseind = false;
    }

    /** 
     * Getter & setter voor 'geseind'
     * 
     * Enkel geseinde voertuigen/nummerplaten worden weerhouden door ge�nteresseerden.
     * Er kunnen verschillende redenen zijn waarom een voertuig geseind staat
     **/
    public void setGeseind(boolean geseind){
	    this.geseind = geseind; }    
    public boolean getGeseind(){
    		return geseind;	}
    
    /* Getter & setter voor de String van de nummerplaat */
	public String getNummerPlaat() {
		return nummerPlaat;	}
	public void setNummerPlaat(String nummerPlaat) {
		this.nummerPlaat = nummerPlaat;	}
	
	/* ToString methode voor nummerplaat */
    public String toString(){
    	return getNummerPlaat(); }

}
