import java.util.*;
public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;

	private void setUpGame() {
		// first make some dot coms and give them locations
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");

		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);

		System.out.println("Goal: sink 3 dot coms (\"Pets.com, eToys.com, Go2.com\") in the fewest number of guesses.");

		for (DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}

	private void startPlaying() {
		while(!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess: ");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";

		for (DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess);
			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}

	private void finishGame() {
		System.out.println("Game Over! All dot coms are dead!");
		if (numOfGuesses <= 18) {
			System.out.println("Guesses: " + numOfGuesses + "\nCongrats!");
		} else {
			System.out.println("Guesses: " + numOfGuesses + "\nTook ya awhile...");
		}
	}

	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}