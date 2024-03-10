public class Main {

    public static void main(String[] args) {
        int n1 = 16;
        printValues(n1);

        int n2 = 10;
        printValues(n2);

        int n3 = 25;
        printValues(n3);

        int n4 = 5;
        printValues(n4);
    }

    static void printValues(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        printValues(n - 5);
        System.out.print(n + " ");
    }
}