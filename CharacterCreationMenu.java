
public class CharacterCreationMenu extends Menu{

	private String[][] classMenu = {{"Egineer:    ", "Field Soldier:    ", "Young Adult (Deprived):    "},
									{Engineer.getRepair().toString(),FieldSoilder.getRepair().toString(),YoungAdult.getRepair().toString()},
									{Engineer.getCharisma().toString(),FieldSoilder.getCharisma().toString(),YoungAdult.getCharisma().toString()},
									{Engineer.getHealth().toString(),FieldSoilder.getHealth().toString(),YoungAdult.getHealth().toString()},
									{Engineer.getStamina().toString(),FieldSoilder.getStamina().toString(),YoungAdult.getStamina().toString()},
									{Engineer.getFlying().toString(),FieldSoilder.getFlying().toString(),YoungAdult.getFlying().toString()},
									{Engineer.getStrength().toString(),FieldSoilder.getStrength().toString(),YoungAdult.getStrength().toString()},
									{Engineer.getScience().toString(),FieldSoilder.getScience().toString(),YoungAdult.getScience().toString()},
									{"Mechanic:    ","Politician:    ","WWI Vet:    "}
									{Mechanic.getRepair().toString(),Politician.getRepair().toString(),WWIVet.getRepair().toString()},
									{Mechanic.getCharisma().toString(),Politician.getCharisma().toString(),WWIVet.getCharisma().toString()},
									{Mechanic.getHealth().toString(),Politician.getHealth().toString(),WWIVet.getHealth().toString()},
									{Mechanic.getStamina().toString(),Politician.getStamina().toString(),WWIVet.getStamina().toString()},
									{Mechanic.getFlying().toString(),Politician.getFlying().toString(),WWIVet.getFlying().toString()},
									{Mechanic.getStrength().toString(),Politician.getStrength().toString(),WWIVet.getStrength().toString()},
									{Mechanic.getScience().toString(),Politician.getScience().toString(),WWIVet.getScience().toString()}};

	public CharacterCreationMenu(){

		super(6);

		System.out.println("--------------PRELUDE--------------");
		System.out.println("It's 1937, fascism is on the rise, and the Rhineland has been remilitarized. \n Germany has started to defy the treaty of Versailles");
		System.out.println("--------------CHARACTER CREATION--------------");
		System.out.println("You are a citizen of the world, unaware of te war that is to come. You are a ...");
		printClasses();

	}

	private printClasses(){


		
		System.out.println("CHOOSE A CLASS:");
		for(int i = 0; i < classMenu.length; i++){
			System.out.println(classMenu[i]);
		}


	}

}