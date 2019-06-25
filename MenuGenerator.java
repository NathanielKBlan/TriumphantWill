
public class MenuGenerator{

	private int optionsNum;

	private String[] menu;

	public MenuGenerator(int optionsNum){

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