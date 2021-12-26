package file01;

import java.util.Scanner;

/*1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다 (제곱의 합).*/

/*1(2) + 2(2) + ... + 10(2) = 385 (괄호가 제곱표시)*/
/*1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다 (합의 제곱).*/

/*(1 + 2 + ... + 10)(2) = 55(2) = 3025 (괄호가 제곱표시)*/
/*따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합" 의 차이는 3025 - 385 = 2640 이 됩니다.*/

/*그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까?*/
public class Problem06 {

    // 합의 제곱
    static int squareOfSum(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i * i;
        }
        return result;
    }

    // 제곱의 합
    static int sumOfSquare(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum * sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("제곱의 합과 합의 제곱의 차 구해보기");
        System.out.print("제곱의 합 : ");
        int squareOfSum = scanner.nextInt();
        System.out.print("합의 제곱 : ");
        int sumOfSquare = scanner.nextInt();
        System.out.println(sumOfSquare(sumOfSquare) - squareOfSum(squareOfSum));
    }

}
