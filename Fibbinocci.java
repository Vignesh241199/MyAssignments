package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int firstNum = 0, secNum = 1, sum = 0, i;
		System.out.print(firstNum + " " + secNum);

		for (i = 0; i < 10; i++) {
			sum = firstNum + secNum;
			System.out.print(" " + sum);
			firstNum = secNum;
			secNum = sum;

		}

	}
}
