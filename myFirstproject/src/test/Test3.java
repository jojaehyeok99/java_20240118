package test;

import java.util.Scanner;

public class Test3 {

	public int solution(int number) {
        if (number <= 0 || number > 2000000000) {
            return 0;
        }

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	Test3 solution = new Test3();

        System.out.print("정수를 입력하세요: ");
        int userInput = scanner.nextInt();

        int result = solution.solution(userInput);
        System.out.println("자리 수의 합: " + result);
    }

}
