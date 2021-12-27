package file01;

/*위의 1000자리 수에서 연속한 13개 숫자의 곱이 가장 큰 값은 얼마입니까?*/

    /*예를들면 7 3 1 6 7 1 7 6 5 3 1 3 3 을 곱하면 5000940입니다.*/
    /*그리고 3 1 6 7 1 7 6 5 3 1 3 3 0 를 곱하면 0입니다.*/

/*이렇게 한자리씩 늘려가면서 13자리를 곱해서 가장 큰 값을 구하면 됩니다.*/
public class Problem08 {

    public static void main(String[] args) {
        System.out.println(findMaxMulti());
    }

    static long findMaxMulti() {
        // 주어진 1000자리 수 50자리씩 잘라 놓음
        String problem = (
                "73167176531330624919225119674426574742355349194934" +
                "96983520312774506326239578318016984801869478851843" +
                "85861560789112949495459501737958331952853208805511" +
                "12540698747158523863050715693290963295227443043557" +
                "66896648950445244523161731856403098711121722383113" +
                "62229893423380308135336276614282806444486645238749" +
                "30358907296290491560440772390713810515859307960866" +
                "70172427121883998797908792274921901699720888093776" +
                "65727333001053367881220235421809751254540594752243" +
                "52584907711670556013604839586446706324415722155397" +
                "53697817977846174064955149290862569321978468622482" +
                "83972241375657056057490261407972968652414535100474" +
                "82166370484403199890008895243450658541227588666881" +
                "16427171479924442928230863465674813919123162824586" +
                "17866458359124566529476545682848912883142607690042" +
                "24219022671055626321111109370544217506941658960408" +
                "07198403850962455444362981230987879927244284909188" +
                "84580156166097919133875499200524063689912560717606" +
                "05886116467109405077541002256983155200055935729725" +
                "71636269561882670428252483600823257530420752963450"
        );

        long max = 0; // 반환값
        long number; // 선언만 해둠
        for (int i = 0; i < 987; i++) {
            number = 1; // 이렇게 해두는 이유는 매번 연산시 1로 다시 리셋을 하기 위해서이다.
            for (int j = i; j < i + 13; j++) { // 13자리까지의 수를 곱해야하니 + 13으로 범위를 정해준다.
                int value = Integer.parseInt(String.valueOf(problem.charAt(j))); // 수를 추출해서 사용한다.
                number *= value;
            }
            if (number > 0) { // 값이 0이 나올경우 비교를 무시하고 넘어간다.
                if (number > max) { // 값이 크다면 교체한다.
                    max = number;
                }
            }
        }
        return max;
    }

}
