package game.fleet;

public abstract class AbstractSpaceShip {
	
	protected int attack = 0;	// attack rating
	protected int defense = 0;	// defense rating
	protected int health = 0;	// healthpoints
	protected int speed = 0;	// speed
	protected int capacity = 0;	// loading capacity
	// Idea
	protected int level = 0; // Maybe leveling up system? though fights or research?
	
	
	public AbstractSpaceShip(int attack, int defense, int health, int speed, int capacity) {
		this.attack = attack;
		this.defense = defense;
		this.health = health;
		this.speed = speed;
		this.capacity = capacity;
	}


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
	
}
