package model.actor;

import model.Locatie;


public interface IVoertuig {
	public void setMerk(String merk);
	public void setGeseind(Boolean isGeseind);
	public Locatie getLocatie();
}
