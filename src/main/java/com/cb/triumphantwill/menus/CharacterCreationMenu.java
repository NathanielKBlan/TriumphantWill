package com.cb.triumphantwill.menus;

public class CharacterCreationMenu extends Menu{

	//Default playable classes and all their statistics
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

	//Constructor for the character creation menu
	public CharacterCreationMenu(){

		//Determines the amount of options within the menu and passes it to the Menu constructor
		super(6);
		
		//Prints the prelude
		System.out.println();
		System.out.println("--------------PRELUDE--------------");
		System.out.println("It's 1937, fascism is on the rise, and the Rhineland has been remilitarized. \nGermany has started to defy the treaty of Versailles");
		System.out.println("-----------------------------------");
		System.out.println();

	}

	//Prints the class options
	public void printClasses(){

		System.out.println("--------------CHARACTER CREATION--------------");
		System.out.println("You are a citizen of the world, unaware of te war that is to come. You are a ...");
		System.out.println();
		
		System.out.println("CHOOSE A CLASS:");
		
		//Print the class menu in a readable format by printing out row of text one by one
		for(int i = 0; i < classMenu.length; i++){

			for(int j = 0; j < classMenu[i].length; j++){

				System.out.print(classMenu[i][j]);

			}

			System.out.println();

		}


	}

}