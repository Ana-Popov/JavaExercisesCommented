public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("before the loop");
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 1) {
            System.out.print("Do");
        }
    }
}