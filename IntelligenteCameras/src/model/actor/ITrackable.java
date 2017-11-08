package model.actor;

import model.Locatie;


public interface ITrackable {
	public void setGeseind(Boolean isGeseind);
	public Locatie getLocatie();
}
