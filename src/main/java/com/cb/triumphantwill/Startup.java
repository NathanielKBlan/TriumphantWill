package com.cb.triumphantwill;

import com.cb.triumphantwill.menus.MainMenu;

public class Startup{
	
	//Main method, everything starts here.
	public static void main(String[] args){

		//Creates main menu and displays it on the screen/console
		MainMenu mainMenu = new MainMenu();
		mainMenu.printMenu();
		
	}
	
}