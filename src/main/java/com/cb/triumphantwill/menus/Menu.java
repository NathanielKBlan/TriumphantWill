package com.cb.triumphantwill.menus;


public class Menu{

	private int optionsNum;

	private String[] menu;

	public Menu(int optionsNum){

		this.optionsNum = optionsNum;
		menu = new String[optionsNum];

		generate();

	}

	private void generate(){

		for(int i = 0; i <= optionsNum - 1; i++){

			menu[i] = (i + 1) + ". ";

		}

	}

	public String[] getMenu(){

		return menu;

	}
}