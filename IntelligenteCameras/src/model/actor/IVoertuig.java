package model.actor;

import model.Locatie;
import model.NummerPlaat;

public interface IVoertuig {
	public void setNummerPlaat(NummerPlaat nummerPlaat);
	public void setMerk(String merk);
	public void setGeseind(Boolean isGeseind);
	public Locatie getLocatie();
}
