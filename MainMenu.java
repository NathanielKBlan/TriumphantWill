import java.util.Scanner;

public class MainMenu extends Menu{

	public MainMenu(){

		super(4);

		Scanner scanner = new Scanner(System.in);

		String[] mainMenu = generateMainMenu();

		printMenu(mainMenu, scanner);

	}

	public String[] generateMainMenu(){

		String[] mainMenu = getMenu();
		String[] options = {"New Game","Load Game","Credits","Exit Game"};

		for(int i = 0; i <= mainMenu.length - 1; i++){

			mainMenu[i] = mainMenu[i] + options[i]; 

		}

		return mainMenu;
	}

	public void printMenu(String[] mainMenu, Scanner scanner){

		System.out.println("--------------TRIUMPHANT WILL--------------");

		for(int i = 0; i <= mainMenu.length - 1; i++){

			System.out.println(mainMenu[i]);

		}

		System.out.println("-------------------------------------------");

		getInput(mainMenu, scanner);
	}

	public void startNewGame(){

		CharacterCreationMenu charCreationMenu = new CharacterCreationMenu();

	}

	public void quit(String[] mainMenu, Scanner scanner){

		System.out.print("Are you sure? Your game might not have been saved. Type yes or no: ");

		getQuitInput(mainMenu, scanner);

	}

	public void getQuitInput(String[] mainMenu, Scanner scanner){

		String input = scanner.next().toUpperCase();

		if(input.equals("YES") || input.equals("Y")){

			System.exit(0);

		}

		else if(input.equals("NO") || input.equals("N")){

			printMenu(mainMenu, scanner);

		}else{

			System.out.print("Please enter a valid option: ");
			getQuitInput(mainMenu, scanner);

		}

	}

	public void getInput(String[] mainMenu, Scanner scanner){

		System.out.print("Select an option: ");

		String input = scanner.next();

		if(input.equals("1") || input.toUpperCase().replaceAll("\\s+", "").equals("NEWGAME")){

			startNewGame();

		}

		else if(input.equals("2") || input.toUpperCase().replaceAll("\\s+", "").equals("LOADGAME")){

			printMenu(mainMenu, scanner);

		}

		else if(input.equals("3") || input.toUpperCase().replaceAll("\\s+", "").equals("CREDITS")){

			System.out.println("This program was made by Nathaniel K. Blanquel as an open source project. Feel free to edit.");
			printMenu(mainMenu, scanner);

		}

		else if(input.equals("4") || input.toUpperCase().replaceAll("\\s+", "").equals("EXITGAME")){

			quit(mainMenu, scanner);

		}else{

			getInput(mainMenu, scanner);

		}

	}

}