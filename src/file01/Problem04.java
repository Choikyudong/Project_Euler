package file01;


import java.util.Arrays;

/*앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.*/
/*두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.*/
/*세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?*/
public class Problem04 {

    public static void main(String[] args) {
        solution();
    }

    static void solution() {
        int max = 0; // 가장 큰 대칭수를 담기위한 용도
        String numberToString; // String타입으로 해결을 해본다.
        for (int i = 100; i < 1000; i++) { // 조건에 맞게 3자리에서 곱하도록 하고 범위를 3자리안으로 잡는다.
            for (int j = 100; j < 1000; j++) {
                numberToString = String.valueOf(i * j); // valueOf함수로 int를 String으로 변환
                if (checkString(numberToString)) {
                    if (max < (i * j)) { // 요구사항에 맞춰서 가장 큰 대칭수를 구한다.
                        max = Integer.parseInt(numberToString);
                    }
                }
            }
        }
    }

    // 변형한 String타입을 가져와서 charAt()메서드로 비교를 한다.
    // 여기서 배열길이를 2로 나누는 이유는 반정도만 각각 비교해보면 값을 알 수 있기에 그렇게 설정했다.
    // for문을 통해서 값들이 모두 같다면 무사히 통과하여 true값을 넘겨주고 아니라면 false로 돌아간다.
    static boolean checkString(String numberToString) {
        for (int i = 0; i < numberToString.length() / 2; i++) {
            if (!(numberToString.charAt(i) == numberToString.charAt(numberToString.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }

}
