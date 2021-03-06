package file01;

/*세 자연수 a, b, c가 피타고라스 정리 a^2 + b^2 = c^2를 만족하면 피타고라스 수라고 부릅니다(여기서 a < b < c ). ^는 제곱을 표시*/

    /*예를 들면 32 + 42 = 9 + 16 = 25 = 52이므로 3, 4, 5는 피타고라스 수입니다.*/

/*a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 이 때, a × b × c 는 얼마입니까?*/
public class Problem09 {

    public static void main(String[] args) {
        pythagoreanTriple();
    }

    static void pythagoreanTriple() {
        int a, b, c;
        int result;
        // 3개의 숫자의 합이 1000이니 최대 연산 숫자를 1000까지로 제한한다.
        for (a = 1; a < 1000; a++) {
            for (b = 1; b < 1000; b++) {
                for (c = 1; c < 1000; c++) {
                    if ( ((a < b) && (b < c)) && ((a * a) + (b * b) == (c * c)) && a + b + c == 1000) {
                        result = a * b * c;
                        System.out.println(result); // 확인용
                    }
                }
            }
        }
    }

}
