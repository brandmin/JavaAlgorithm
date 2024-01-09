package chap2;

import java.util.Scanner;

class PhysicalExamination {
    static final int VMAX = 21; // 시력 분포(0.0~0.1 단위로 21개)

    static class PhyscData {
        String name;
        int height;
        double vision;

        //생성자
        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    // 키의 평균값을 구함
    static double averageHeight(PhyscData[] data) {
        double sum = 0;

        for(int i=0; i<data.length; i++) {
            sum += data[i].height;
        }
        return sum/data.length;
    }

    // 시력 분포를 구함
    static void distVision(PhyscData[] data, int[] dist) {
        int i=0;
        dist[i] = 0;
        for(i=0; i<data.length; i++)
            if(data[i].vision >=0.0 && data[i].vision <= VMAX / 10.0)
                dist[(int)(data[i].vision * 10)]++;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("강민하", 162,0.3),
                new PhyscData("김찬우", 173,0.7),
                new PhyscData("박준서", 175,2.0),
                new PhyscData("유서범", 171,1.5),
                new PhyscData("이수연", 168,0.4),
                new PhyscData("장경오", 174,1.2),
                new PhyscData("황지민", 169,0.8),
        };
        int[] vdist = new int[VMAX]; // 시력 분포

        System.out.println("■ 신체검사 리스트 ■");
        System.out.println("이름      키    시력");
        System.out.println("------------------");
        for(int i=0; i<x.length; i++)
            // %-8s%3d%5.1f
            // %-8s: 문자열을 왼쪽으로 정렬하고 최대 8자리 표시
            // %3d: 정수를 오른쪽으로 정렬하고 최소 3자리 표시
            // %5.1f: 부동소수점 수를 오른쪽으로 정렬하고 전체 5자리 중 소수점 아래 1자리까지 표시
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height,x[i].vision);
        System.out.printf("\n평균 키: %5.1fcm\n", averageHeight(x));
        distVision(x, vdist); // 시력 분포를 구함

        System.out.println("\n시력분포");
        for(int i=0; i<VMAX; i++)
            System.out.printf("%3.1f~: %2d명\n", i/10.0, vdist[i]);
    }
}

