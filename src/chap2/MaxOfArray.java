package chap2;

import java.util.Scanner;

class MaxOfArray {
    // 배열 a의 최댓값을 구하여 반환
    static int maxOf(int[] a) {
        int max = a[0];
        for(int i=0; i<a.length; i++)
            if(a[i] > max) max = a[i];
            return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수: ");
        int num = scanner.nextInt(); // 배열의 요솟수를 입력

        int[] height = new int[num];

        for(int i=0; i<num; i++) {
            System.out.print("height[" + i + "]:");
            height[i] = scanner.nextInt();
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
