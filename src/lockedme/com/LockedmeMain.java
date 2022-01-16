package lockedme.com;

public class LockedmeMain {

	public static void main(String[] args) {
		
		
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", "Rohith Molumuri");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}
