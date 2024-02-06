package chap5;

import java.util.Scanner;

class Hanoi {
    // no개의 원반을 x번 기둥(시작기둥)에서 y번 기둥(목표 기둥)으로 옮김
    static void move(int no, int x, int y) {
        if(no > 1)
            move(no - 1, x, 6-x-y); // 바닥의 원반을 제외한 그룹(시작 --> 중간)

            System.out.printf("원반[%d]을(를) %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);

            if(no > 1)
                move(no - 1, 6-x-y, y); // 바닥의 원반을 제외한 그룹 (중간 --> 목표)
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수:");
        int no = scanner.nextInt();

        move(no, 1, 3);
    }
}


