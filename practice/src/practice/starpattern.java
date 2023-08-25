package practice;

class starpattern {
	public static void main(String[] args) {
		int i, j, k;

		System.out.println("star1");
		for (i = 0; i < 5; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}


class star {
	public static void main(String[] args) {

		int i, j, k;
		System.out.println("star2");
		System.out.println();
		int row = 6;
		for (i = 0; i < row; i++) {
			for (j = 2 * (row - 1); j >= 0; j--) {
				System.out.println(" ");
			}
			for (j = 0; j <= 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
