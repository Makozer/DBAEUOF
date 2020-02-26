package game.planet.ressource;

public abstract class AbstractRessource {
	
	protected int ressourcevalue = 0;

	public AbstractRessource(int ressourcevalue) {
		this.ressourcevalue = ressourcevalue;
	}

	public int getVal() {
		return ressourcevalue;
	}

	public void setVal(int ressourcevalue) {
		this.ressourcevalue = ressourcevalue;
	}
	
	
	

}
