
public class YoungAdult{
	
	private int repair;
	private int charisma;
	private int health;
	private int stamina;
	private int flying;
	private int strength;
	private int science;

	public YoungAdult(int repair, int charisma, int health, int stamina, int flying, int strength, int science){

		this.repair = repair;
		this.charisma = charisma;
		this.health = health;
		this.stamina = stamina;
		this.flying = flying;
		this.strength = strength;
		this.science = science;

	}

	public YoungAdult(){

		this.repair = 0;
		this.charisma = 2;
		this.health = 10;
		this.stamina = 5;
		this.flying = 0;
		this.strength = 2;
		this.science = 0;

	}

	public int getRepair(){

		return repair;

	}

	public int getCharisma(){

		return charisma;

	}

	public int getHealth(){

		return health;

	}

	public int getStamina(){

		return stamina;

	}

	public int getFlying(){

		return flying;

	}

	public int getStrength(){

		return strength;

	}

	public int getScience(){

		return science;

	}
}