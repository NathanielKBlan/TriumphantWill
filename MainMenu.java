
public class MainMenu extends Menu{

	public MainMenu(){

		super(4);

		String[] mainMenu = generateMainMenu();

		printMenu(mainMenu);

	}

	public static String[] generateMainMenu(){

		String[] mainMenu = getMenu();
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