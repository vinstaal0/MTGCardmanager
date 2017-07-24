package me.Vinstaal0.MTGManager.Utility;

public enum Group {
	
	// Guilds Ally
	AZORIUS(Color.WHITE, Color.BLUE),
	DIMIR(Color.BLUE, Color.BLACK),
	RAKDOS(Color.BLACK, Color.RED),
	GRUUL(Color.RED, Color.GREEN),
	SELESNYA(Color.GREEN, Color.WHITE),
	
	// Guilds Enemy
	ORZHOV(Color.WHITE, Color.BLACK),
	IZZET(Color.BLUE, Color.RED),
	GOLGARI(Color.BLACK, Color.GREEN),
	BOROS(Color.RED, Color.WHITE),
	SIMIC(Color.GREEN, Color.BLUE),
	
	// Shards
	BANT(Color.GREEN, Color.WHITE, Color.BLUE),
	ESPER(Color.WHITE, Color.BLUE, Color.BLACK),
	GRIXIS(Color.BLUE, Color.BLACK, Color.RED),
	JUND(Color.BLACK, Color.RED, Color.GREEN),
	NAYA(Color.RED, Color.GREEN, Color.WHITE),
	
	// Wedges
	ABZAN(Color.WHITE, Color.BLACK, Color.GREEN),
	JESKAI(Color.BLUE, Color.RED, Color.WHITE),
	SULTAI(Color.BLACK, Color.GREEN, Color.BLUE),
	MARDU(Color.RED, Color.WHITE, Color.BLACK),
	TEMUR(Color.GREEN, Color.BLUE, Color.RED),
	
	// 4 Color
	ARTIFICE(Color.WHITE, Color.BLUE, Color.BLACK, Color.RED),
	CHAOS(Color.BLUE, Color.BLACK, Color.RED, Color.GREEN),
	AGGRESSION(Color.BLACK, Color.RED, Color.GREEN, Color.WHITE),
	ALTRUISM(Color.RED, Color.GREEN, Color.WHITE, Color.BLUE),
	GROWTH(Color.GREEN, Color.WHITE, Color.BLUE, Color.BLACK),
	
	// 5 Color
	ALL(Color.WHITE, Color.RED, Color.BLUE, Color.BLACK, Color.GREEN);
	
	private Color[] color;
	
	public Group(Color.. color) {
		this.color = color;
	}
	
	public Color[] getColor() {
		return this.color;
	}

}
