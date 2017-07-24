package me.Vinstaal0.MTGManager.Utility;

public class ManaCost {
	
	private int WHITE_MANA = 0;
	private int RED_MANA = 0;
	private int BLUE_MANA = 0;
	private int BLACK_MANA = 0;
	private int GREEN_MANA = 0;
	private int COLORLESS_MANA = 0;
	
	public ManaCost(Tuple<Color,Integer>... cost) {
	
		for (Tuple<Color,Integer> t : cost) {
		
			switch (t.getValue0()) {
				case Color.WHITE :
					this.WHITE_MANA += t.getValue1();
				case Color.RED :
					this.RED_MANA += t.getValue1();
				case Color.BLUE :
					this.BLUE_MANA += t.getValue1();
				case Color.GREEN :
					this.GREEN_MANA += t.getValue1();
				case Color.COLORLESS_MANA :
					this.COLORLESS_MANA += t.getValue1();
				default : continue;
			}
		}
	}
	
	public int getCmc() {
		int t = 0;
		
		t += this.WHITE_MANA;
		t += this.RED_MANA;
		t += this.BLUE_MANA;
		t += this.BLACK_MANA;
		t += this.GREEN_MANA;
		t += this.COLORLESS_MANA;
		
		return t;
	}
	
	
}
