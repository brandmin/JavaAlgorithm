package chap1;

import java.util.Scanner;

public class JudgeABC1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("정수를 입력해주세요: ");
        int number = input.nextInt();

        if(number == 1) {
            System.out.println("A");
        } else if(number == 2) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
