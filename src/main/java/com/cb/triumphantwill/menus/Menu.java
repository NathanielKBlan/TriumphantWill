package com.cb.triumphantwill.menus;


public class Menu{

	//Number of options in menu
	private int optionsNum;

	//Stores the menu options
	private String[] menu;

	//Constructor for Menu, takes in the amount of options as a parameter
	public Menu(int optionsNum){

		//Sets the amount of options
		this.optionsNum = optionsNum;
		
		//Initializes the menu array (sets the array length)
		menu = new String[optionsNum];

		//Generates the menu
		generate();

	}

	//Generates and formats the menu into a list
	private void generate(){

		for(int i = 0; i <= optionsNum - 1; i++){

			//Loops trough numbers 1 to x where x is the number of options and stores the number in the array like so: "1. "
			menu[i] = (i + 1) + ". ";

		}

	}

	//Getter for the empty menu
	public String[] getMenu(){

		return menu;

	}
}