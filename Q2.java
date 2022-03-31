public class Q2 {
    public static void main(String args[]) {
        for (int i = 1; i <= 100; i++) {
            boolean multiple5 = i % 5 == 0;
            boolean multiple3 = i % 3 == 0;

            if (multiple3 && multiple5) {
                System.out.println("FooBaa");
            } else if (multiple3) {
                System.out.println("Foo");
            } else if (multiple5) {
                System.out.println("Baa");
            } else {
                System.out.println(i);
            }
        }
    }
}
