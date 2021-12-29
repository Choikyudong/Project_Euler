package file01;

/*10 이하의 소수를 모두 더하면 2 + 3 + 5 + 7 = 17 이 됩니다.*/

/*이백만(2,000,000) 이하 소수의 합은 얼마입니까?*/
public class Problem10 {

    public static void main(String[] args) {
        // int값 이상이 나올걸로 예상하고 long타입으로 한다.
        long Sum = 0;

        // 시작값을 1로 시작한다.
        int number = 3;

        // 최대범위인 이백만을 설정한다.
        while (number < 2000000) {

            // 소수를 확인한다.
            if (isPrime(number)) {
                Sum += number;
            }

            // 2씩 더하는 이유는 소수가 짝수일 확률일리가 없다.
            number += 2;
        }

        // 2를 제외하고 시작했으니 끝에 2를 더한다.
        System.out.println(Sum + 2);
    }

    static boolean isPrime(int number) {
        // Math.sqrt는 제곱근(루트)를 구하는 합수이다.
        int k = (int) Math.sqrt(number);

        // 해당 연산에서 나눠 떨어지면 소수가 아니다.
        for (int i = 2; i <= k; i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

}
