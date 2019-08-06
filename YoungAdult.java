
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

	public static void getRepair(){

		return repair;

	}

	public static void getCharisma(){

		return charisma;

	}

	public static void getHealth(){

		return health;

	}

	public static void getStamina(){

		return stamina;

	}

	public static void getFlying(){

		return flying;

	}

	public static void getStrength(){

		return strength;

	}

	public static void getScience(){

		return science;

	}
}