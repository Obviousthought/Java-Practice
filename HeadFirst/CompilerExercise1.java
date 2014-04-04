public class CompilerExercise1 {
	public static void main(String [] args) {
		int x = 5;
		while (x > 1) {
			x = x - 1;
			if (x < 3) {
				System.out.println("small x");
			}
		}
		Exercise1b ex = new Exercise1b();
		ex.methodOne();
		ex.methodTwo();

	}
}

public class Exercise1b {
	public Exercise1b() {
		// constructor
	}

	public void methodOne(String [] args) {
		int x = 5;
		while (x > 1) {
			x = x - 1;
			if (x < 3) {
				System.out.println("Method 1: small x");
			}
		}
	}

	public void methodTwo(String [] args) {
		int x = 1;
		while (x < 10) {
			if (x > 3) {
				System.out.println("big x");
				x = x + 1;
			}
		}
	}
}