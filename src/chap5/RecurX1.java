package chap5;

import java.util.Scanner;

class RecurX1 {
    //꼬리 재귀를 제거
    static void recur(int n) {
        while(n>0) {
            recur(n-1);
            System.out.println(n);
            n = n-2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요:");
        int x = scanner.nextInt();

        recur(x);
    }
}
