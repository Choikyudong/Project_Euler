package file01;


/*어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.*/

/*예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.*/

/*600851475143의 소인수 중에서 가장 큰 수를 구하세요.*/
/* https://mathbang.net/200 사이트를 참고했습니다. */
public class Problem03 {

    public static void main(String[] args) {
        System.out.println(solution(13195));
    }

    static int solution(long number) {
        int max = 0;
        int count = 2;
        while (number > 1) {
            if (number % count == 0) {
                number /= count;
                max = count;
            } else {
                count++;
            }
        }
        return max;
    }

}

