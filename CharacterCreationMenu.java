
public class CharacterCreationMenu extends Menu{


	private String[][] classMenu = {{"|-----------------|----------------------|-----------------------------|"},
									{"|    Egineer:     |    ","Field Soldier:    |  ", " Young Adult (Deprived):   |"},
									{"|-----------------|----------------------|-----------------------------|"},
									{"|    Repair: 8    |    ","Repair: 2  ","       |   Repair: 0                 |"},
									{"|    Charisma: 2  |    ","Charisma: 3  ","     |   Charisma: 2               |"},
									{"|    Health: 15   |    ","Health: 20  ","      |   Health: 10                |"},
									{"|    Stamina: 10  |    ","Stamina: 20  ","     |   Stamina: 5                |"},
									{"|    Flying: 5    |    ","Flying: 1 ","        |   Flying: 0                 |"},
									{"|    Strength: 2  |    ","Strength: 7  ","     |   Strength: 2               |"},
									{"|    Science: 5   |    ","Science: 1  ","      |   Science: 0                |"},
									{"|-----------------|----------------------|-----------------------------|"},
									{"|    Mechanic:    |    ", "Politician:       | ", "  WWI Vet:                  |"},
									{"|-----------------|----------------------|-----------------------------|"},
									{"|    Repair: 6    |    ","Repair: 1  ","       |   Repair: 3                 |"},
									{"|    Charisma: 3  |    ","Charisma: 7  ","     |   Charisma: 2               |"},
									{"|    Health: 15   |    ","Health: 10  ","      |   Health: 20                |"},
									{"|    Stamina: 12  |    ","Stamina: 15  ","     |   Stamina: 20               |"},
									{"|    Flying: 2    |    ","Flying: 0 ","        |   Flying: 3                 |"},
									{"|    Strength: 5  |    ","Strength: 3  ","     |   Strength: 10              |"},
									{"|    Science: 2   |    ","Science: 1  ","      |   Science: 2                |"},
									{"|-----------------|----------------------|-----------------------------|"}};

	public CharacterCreationMenu(){

		super(6);

		System.out.println("--------------PRELUDE--------------");
		System.out.println("It's 1937, fascism is on the rise, and the Rhineland has been remilitarized. \n Germany has started to defy the treaty of Versailles");
		System.out.println("--------------CHARACTER CREATION--------------");
		System.out.println("You are a citizen of the world, unaware of te war that is to come. You are a ...");
		printClasses();

	}

	private void printClasses(){


		
		System.out.println("CHOOSE A CLASS:");
		for(int i = 0; i < classMenu.length; i++){

			for(int j = 0; j < classMenu[i].length; j++){

				System.out.print(classMenu[i][j]);

			}

			System.out.println();

		}


	}

}