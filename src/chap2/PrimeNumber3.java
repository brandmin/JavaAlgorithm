package chap2;
// 1000 이하의 소수를 나눈 버전2
class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0; // 나눗셈 횟수
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2; // 2는 소수
        prime[ptr++] = 3; // 3는 소수


        for (int n = 5; n <= 1000; n += 2) { // 조사 대상 : 홀수
            boolean flag = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;
                if (n % prime[i] == 0) // 나누어 떨어지면 소수가 아니고 합성수임.
                    flag = true;
                break;
            }


        if (!flag) {
            prime[ptr++] = n;
            counter++;

        }
    }

        for(int i=0; i<ptr; i++)
            System.out.println(prime[i]);

        System.out.println("곱셈과 나눗셈을 수행한 횟수: " + counter);
    }
}
