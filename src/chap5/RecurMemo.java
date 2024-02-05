package chap5;

import java.util.Scanner;

class RecurMemo {
    static String[] memo;

    // 메모화를 도입한 recur 메서드
    static void recur(int n) {
        if(memo[n+1] != null)
            System.out.println(memo[n+1]); // 메모 출력
        else {
            if (n>0) {
                recur(n-1);
                System.out.println(n);
                recur(n-2);
                memo[n+1] = memo[n] + n + "\n" + memo[n-1]; // 메모화
            } else {
                memo[n+1] = "";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력해주세요:");

        int x = scanner.nextInt();

        memo = new String[x + 2];
        recur(x);
    }
}
