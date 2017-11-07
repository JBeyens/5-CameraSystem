package model.actor;

import model.Locatie;


public interface ITrackable {
	public void setGeseind(Boolean isGeseind);
	public Locatie getLocatie();
	public void setMerk(String merk);
}
