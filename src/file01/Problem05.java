package file01;

/*1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.*/

/*그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?*/
public class Problem05 {

    public static void main(String[] args) {
        System.out.println(Problem05.findBigNumber());
    }
    
    static long findBigNumber() { // long을 선택한 이유는 어떤값이 나올지 몰라서
        long number = 1; // 1은 모든 수와 떨어지기 때문에 제외했다.
        boolean process = true; // while문을 설정하기 위한 용도
        while (process) { // 어떤수까지 정해져있지 않으니 무한으로 돌린다.
            ++number; // 2부터 시작하니 값을 올리고 시작한다.
            for (int i = 2; i <= 20; i++) { // 20까지 수를 올리면서 나눈다.
                if (number % i == 0) {
                    if (i == 20) { // i를 20까지 연산이 완료가 되면 목표완료
                        process = false; // 그대로 while문을 종료시킨다.
                    }
                } else {
                    break; // 나눗셈이 실패하면 바로 for문을 종료시키고 다시 값을 올린다.
                }
            }
        }
        return number; // 받은값을 돌려준다.
    }

}
