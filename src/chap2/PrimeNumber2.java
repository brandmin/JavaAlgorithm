package chap2;
// 1000 이하의 소수를 나눈 버전2
class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0; // 나눗셈 횟수
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2; // 2는 소수

        for(int n=3; n<=1000; n+=2) { // 조사 대상 : 홀수
            int i;
            for(i=1; i<ptr; i++) { // 이미 찾은 소수로 나눈다.
                counter++;
                if(n % prime[i] == 0)
                    break;
            }
            if(ptr == i) // 마지막까지 나누어지지 않음. 소수로 배열에 저장
                prime[ptr++] = n;
        }

        for(int i=0; i<ptr; i++)
            System.out.println(prime[i]);

        System.out.println("나눗셈을 수행한 횟수: " + counter);
    }
}
