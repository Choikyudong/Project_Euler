package file01;

/*소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.*/

/*이 때 10,001번째의 소수를 구하세요.*/
public class Problem07 {

    public static void main(String[] args) {
        System.out.println(findPrimeNumber());
    }

    static int findPrimeNumber() {
        int count = 1; // 몇번째 소수인지 확인하는 용도
        int number = 2; // 소수를 계산하기 위한 숫자
        boolean check = true; // 값이 소수인지 확인하는 용도
        while (count < 10001) { // 요구사항이 10001번째니까 해당 순서가 되면 멈추게한다.
            ++number; // 여기서는 3부터 소수를 체크하는걸로 시작한다.
            for (int i = 2; i < number; i++) { // 해당 숫자 전까지 연산을 한다.
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) { // 위의 연산에서 소수라는것이 확인이 되면 check값은 true를 유지한다.
                count++;
            }
            check = true; // 다시 원상태로 돌려서 확인하게 한다.
        }
        return number;
    }

}
