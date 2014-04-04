public class SimpleDotComTestCode {
	public static void main(String [] args) {
		SimpleDotComTestCode dot = new SimpleDotComTestCode();
		int[] locations = {2, 3, 4};
		dot.setLocationCells(locations);
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		String testResult = "failed";
		if (result.equals("hit")) {
			testResult = "passed";
		}
		System.out.println(testResult);
	}
	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}

