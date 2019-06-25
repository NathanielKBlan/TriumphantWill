
public class Startup{
	
	public static void main(String[] args){

		MenuGenerator mG = new MenuGenerator(4);
		String[] mainMenu = generateMainMenu(mG);

		printMenu(mainMenu);	

	}

	public static String[] generateMainMenu(MenuGenerator mG){

		String[] mainMenu = mG.getMenu();
		String[] options = {"New Game","Load Game","Credits","Exit Game"};

		for(int i = 0; i <= mainMenu.length - 1; i++){

			mainMenu[i] = mainMenu[i] + options[i]; 

		}

		return mainMenu;
	}

	public static void printMenu(String[] mainMenu){

		System.out.println("--------------TRIUMPHANT WILL--------------");

		for(int i = 0; i <= mainMenu.length - 1; i++){

			System.out.println(mainMenu[i]);

		}

		System.out.println("-------------------------------------------");

	}

}