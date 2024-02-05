package chap5;

import java.util.Scanner;

class RecurX2 {
    //재귀를 제거
    static void recur(int n) {
        IntStack s = new IntStack(n);

        while(true) {
            if (n > 0) {
                s.push(n);
                n = n - 1; // n값을 줄임
                continue; // continue로 인해 while문 맨앞으로 돌아감
            }
            if (s.isEmpty() != true) { // 스택이 비어있지 않으면
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요:");
        int x = scanner.nextInt();

        recur(x);


    }
}
