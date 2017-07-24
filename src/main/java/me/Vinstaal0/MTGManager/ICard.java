package me.Vinstaal0.MTGManager;

public interface ICard {
	
	int cmc;
	ManaCost manaCost;
	Color[] cardColorID;
	Location location;
	
	default void setCmc(int cmc) {
		this.cmc = cmc;
	}
	
	default void setManaCost(ManaCost manaCost) {
		this.manaCost = manaCost;	
	}
	
	default void setCarColorID(Color... cardColorID) {
		this.cardColorID = cardColorID;	
	}
	
	default void setLocation(Location location) {
		this.location = location;	
	}
	
	default int getCmc() {
		return this.cmc;
	}
	
	default ManaCost getManaCost() {
		return this.manaCost;	
	}
	
	default Color[] getCardColorID() {
		return this.cardColorID;	
	}
	
	default Location getLocation() {
		return this.location;
	}
	
}
