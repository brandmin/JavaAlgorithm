package chap3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class PhysExamSearch {
    // 신체검사 데이터 정의
    static class PhysData {
        private String name;
        private int height;
        private double vision;

        public PhysData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhysData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        // 키의 오름차순으로 정렬하기 위한 Comparator
        public static final Comparator<PhysData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhysData> {
            public int compare(PhysData d1, PhysData d2) {
                return Integer.compare(d1.height, d2.height);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhysData[] x = {
                new PhysData("강민하", 162,0.3),
                new PhysData("이수연", 168, 0.4),
                new PhysData("황지안", 169, 0.8),
                new PhysData("유서범", 171,1.5),
                new PhysData("김찬우", 173,0.7),
                new PhysData("장경오", 174, 1.2),
                new PhysData("박준서", 175,2.0)
        };
        System.out.print("키가 몇 cm인 사람을 찾고 있나요?: ");
        int height = scanner.nextInt();
        int idx = Arrays.binarySearch(
                x, // 배열 x에서
                new PhysData("", height, 0.0), // 키가 height 요소를
                PhysData.HEIGHT_ORDER // HEIGHT_ORDER에 의해 검색
        );

        if(idx < 0)
            System.out.println("그 값의 요소가 없습니다.");
        else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터: " + x[idx]);
        }
    }

}
