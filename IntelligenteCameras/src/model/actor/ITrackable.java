package model.actor;

import model.Locatie;


public interface ITrackable {
	void setGeseind(Boolean isGeseind);
	Boolean getGeseind();
	
	Locatie getLocatie();
}
