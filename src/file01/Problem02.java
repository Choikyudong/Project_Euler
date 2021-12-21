package file01;

/* 피보나치(Fibonacci) 수열의 각 항은 바로 앞의 항 두 개를 더한 것입니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다. */

        /* 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... */

/* 4백만 이하의 짝수 값을 갖는 모든 피보나치 항을 더하면 얼마가 됩니까? */

public class Problem02 {
    public static void main(String[] args) {
        Solution02 solution02 = new Solution02();
        int result = solution02.solution(4000000);
        System.out.println(result);
    }
}

// for 문을 사용한 이유는 인자값이 정해져있기 떄문이였다.
class Solution02 {
    int solution(int fibonacci) {
        int sum = 0; // 연산용도
        int remember = 0; // 전에 있던 수를 기억하는 용도
        int result = 0; // 결과값
        for (int i = 1; i <= fibonacci;) {
            sum = i + remember; // 현재 i의 값과 전에 있떤 수를 더한다.
            remember = i; // 현재 i의 값을 전에 수로 저장한다.
            i = sum; // i의 값은 현재 더한값이 된다.
            if (sum % 2 == 0) {
                result += sum; // 요구사항에 맞춰서 짝수만 더한다.
            }
        }
        return result;
    }
}
