package chap3;

class GenericClassTester {
    static class GenericClass<T> {
        private T xyz;
        GenericClass(T t) { // 생성자
            this.xyz = t;
        }
        T getXyz() {
            return xyz;
        }
    }

    public static void main(String[] args) {
        // 다음과 같이 매개변수에 String을 넘길수도 있고 Integer로 넘길 수 있음
        GenericClass<String> s = new GenericClass<>("ABC");
        GenericClass<Integer> n = new GenericClass<>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}
