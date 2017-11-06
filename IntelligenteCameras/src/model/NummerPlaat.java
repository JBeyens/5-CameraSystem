package model;

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
	
    public void setGeseind(boolean geseind){
	    this.geseind = geseind;
	   }
    
    public boolean isGeseind(){
    		//enkel geseinde voertuigen/nummerplaten worden weerhouden door geïnteresseerden
    		//Er kunnen verschillende redenen zijn waarom een voertuig geseind staat
    		return geseind;
    	}
    @Override
    public String toString(){
    	return getNummerPlaat();
    }
	public String getNummerPlaat() {
		return nummerPlaat;
	}
	public void setNummerPlaat(String nummerPlaat) {
		this.nummerPlaat = nummerPlaat;
	}

}
