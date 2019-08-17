package com.cb.triumphantwill.menus;

import java.util.Scanner;

public class MainMenu extends Menu{
	
	//Get user input
	private Scanner scanner = new Scanner(System.in);
	
	//Menu options are stored here
	private String[] mainMenu;
	
	//Constructor for MainMenu class
	public MainMenu(){

		//Determines the amount of options within the menu and passes it to the Menu constructor
		super(4);

		//Generates menu options and stores them in the mainMenu array
		this.mainMenu = generateMainMenu();

	}

	//Generates the menu options
	private String[] generateMainMenu(){

		//Get default menu and store it in mainMenu
		String[] mainMenu = getMenu();
		
		//Create options in array to be merged with mainMenu
		String[] options = {"New Game","Load Game","Credits","Exit Game"};

		for(int i = 0; i <= mainMenu.length - 1; i++){

			//Merge the default menu with the options to create the main menu
			mainMenu[i] = mainMenu[i] + options[i]; 

		}

		return mainMenu;
	}

	//Prints the menu
	public void printMenu(){

		System.out.println("--------------TRIUMPHANT WILL--------------");

		for(int i = 0; i <= mainMenu.length - 1; i++){

			System.out.println(mainMenu[i]);

		}

		System.out.println("-------------------------------------------");
		System.out.println();
		
		//Gets user input for the menu
		getInput(mainMenu, scanner);
	}

	//Starts new game
	private void startNewGame(){

		//Takes player to the character creation menu
		CharacterCreationMenu charCreationMenu = new CharacterCreationMenu();
		charCreationMenu.printClasses();
		
	}

	//Quits the game
	private void quit(String[] mainMenu, Scanner scanner){

		System.out.print("Are you sure? Your game might not have been saved. Type yes or no: ");

		//Assures player wants to quit
		getQuitInput(mainMenu, scanner);

	}

	//Assures player wants to quit
	private void getQuitInput(String[] mainMenu, Scanner scanner){

		// Line 84 and 98-103 make sure that player enters a valid option and that the game doesn't crash
	
		String input = scanner.next().toUpperCase();

		//Quits the game
		if(input.equals("YES") || input.equals("Y")){

			System.exit(0);

		}

		//Doesn't quit the game and takes player back to main menu
		else if(input.equals("NO") || input.equals("N")){

			printMenu();

		}else{

			System.out.print("Please enter a valid option: ");
			getQuitInput(mainMenu, scanner);

		}

	}

	//Gets input for which main menu option the player selects
	private void getInput(String[] mainMenu, Scanner scanner){

		System.out.print("Select an option: ");

		//Gets player input
		String input = scanner.next();

		//Starts new game if player chose the New Game option or option 1
		if(input.equals("1") || input.toUpperCase().replaceAll("\\s+", "").equals("NEWGAME")){

			startNewGame();

		}

		//Starts new game if player chose the Load Game option or option 2
		else if(input.equals("2") || input.toUpperCase().replaceAll("\\s+", "").equals("LOADGAME")){

			printMenu();

		}

		//Starts new game if player chose the Credits option or option 3
		else if(input.equals("3") || input.toUpperCase().replaceAll("\\s+", "").equals("CREDITS")){

			System.out.println("This program was made by Nathaniel K. Blanquel as an open source project. Feel free to edit.");
			printMenu();

		}

		//Starts new game if player chose the Exit Game option or option 4
		else if(input.equals("4") || input.toUpperCase().replaceAll("\\s+", "").equals("EXITGAME")){

			quit(mainMenu, scanner);

		//Gets input once more if the player choose an invalid option
		}else{

			getInput(mainMenu, scanner);

		}

	}

}