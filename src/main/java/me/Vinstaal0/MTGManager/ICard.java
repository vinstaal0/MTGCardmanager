package me.Vinstaal0.MTGManager;

public interface ICard {
	
	ManaCost manaCost;
	Color[] cardColorID;
	Location location;
	
	default void setManaCost(ManaCost manaCost) {
		this.manaCost = manaCost;	
	}
	
	default void setCarColorID(Color... cardColorID) {
		this.cardColorID = cardColorID;	
	}
	
	default void setLocation(Location location) {
		this.location = location;	
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
