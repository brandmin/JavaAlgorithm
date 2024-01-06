package chap2;

import java.util.Scanner;

class CardConv {
    // 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수 반환
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지 저장
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) { // 역순정렬
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수: ");
                no = scanner.nextInt();
            } while (no < 0);
            do {
                System.out.print("어떤 진수로 변환할까요?(2~36):");
                cd = scanner.nextInt();
            } while (cd < 2 || cd > 32);

            dno = cardConv(no, cd, cno);

            System.out.print(cd + "진수로 ");
            for (int i = 0; i < dno; i++) // 순서대로 출력
                System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.print("한 번 더 할까요? (1.예/0. 아니오):");
            retry = scanner.nextInt();
        } while (retry == 1);
    }
}
