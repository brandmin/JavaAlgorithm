package chap3;

import java.util.Scanner;

class SeqSearchSen {
    static int seqSearch(int[] a, int n, int key) {
        int i=0;

        a[n] = key; // 보초를 추가

        while(true) {
            if(a[i] == key)
                break;
            i++;
        }
        return i == n ? -1:i; // 변수 i값이 n이면 값이 보초임.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num + 1]; // 요솟수가 num + 1인 배열

        for(int i=0; i<num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = scanner.nextInt();

        int idx = seqSearch(x, num, ky);
        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}
