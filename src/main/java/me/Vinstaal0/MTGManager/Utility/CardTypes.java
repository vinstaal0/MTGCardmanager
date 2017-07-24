package me.Vinstaal0.MTGManager.Utility;

public enum CardTypes {

	CREATURE(Creature.class),
	PLANESWALKER(Planeswalker.class),
	ENCHANTMENT(Enchantment.class),
	LAND(Land.class),
	INSTANT(Instant.class),
	SORCERY(Sorcery.class),
	TRIBAL(Tribal.class),
	ARTIFACT(Artifact.class);

	private final Class class;
	
	Cardtype(Class class) {
		this.class = class;
	}
	
	public Class getClass() {
		return this.class;
	}

}
