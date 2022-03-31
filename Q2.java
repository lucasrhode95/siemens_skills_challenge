public class Q2 {
    public static void main(String args[]) {
        for (int i = 1; i <= 100; i++) {
            boolean multiple_5 = i % 5 == 0;
            boolean multiple_3 = i % 3 == 0;

            if (multiple_3 && multiple_5) {
                System.out.println("FooBaa");
            } else if (multiple_3) {
                System.out.println("Foo");
            } else if (multiple_5) {
                System.out.println("Baa");
            } else {
                System.out.println(i);
            }
        }
    }
}
