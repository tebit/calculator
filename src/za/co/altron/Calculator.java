package za.co.altron;

public class Calculator {

	public static void main(String[] args) {

		int numbers[] = { 3, 6, 8, 5, 14, 30 };
		int sum = addEven(numbers);
		System.out.println(sum);
	}

	private static int addEven(int[] numbers) {
		int answer = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				answer += numbers[i];
			}
		}

		return answer;

	}

}
