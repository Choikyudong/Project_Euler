package file01;

/* 10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다. */

/* 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요? */

public class Problem01 {
    public static void main(String[] args) {
        Solution01 solution01 = new Solution01();
        int result = solution01.solution(10);
        System.out.println(result); // -> 23
    }
}

class Solution01 {
    public int solution(int number) {
        int result = 0;

        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
}