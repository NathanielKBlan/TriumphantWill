package com.cb.triumphantwill.classes;

public class YoungAdult{
	
	//The stats that every class has:
	private int repair;
	private int charisma;
	private int health;
	private int stamina;
	private int flying;
	private int strength;
	private int science;

	//Constructor for the Young Adult class (assisns custom value to stats)
	public YoungAdult(int repair, int charisma, int health, int stamina, int flying, int strength, int science){

		//Assigns value to each of the stats
		this.repair = repair;
		this.charisma = charisma;
		this.health = health;
		this.stamina = stamina;
		this.flying = flying;
		this.strength = strength;
		this.science = science;

	}

	//Default constructor for the Young Adult class
	public YoungAdult(){

		//Assigns the default value to each of the stats
		this.repair = 0;
		this.charisma = 2;
		this.health = 10;
		this.stamina = 5;
		this.flying = 0;
		this.strength = 2;
		this.science = 0;

	}

	//Getter for repair
	public int getRepair(){

		return repair;

	}

	//Getter for charisma
	public int getCharisma(){

		return charisma;

	}

	//Getter for health
	public int getHealth(){

		return health;

	}

	//Getter for stamina
	public int getStamina(){

		return stamina;

	}

	//Getter for flying
	public int getFlying(){

		return flying;

	}

	//Getter for strength
	public int getStrength(){

		return strength;

	}

	//Getter for science
	public int getScience(){

		return science;

	}
}