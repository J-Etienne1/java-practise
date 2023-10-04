package ifElseIf;

public class ifElseIf {
    public static void main(String[] args) {

        int x = 8;
        int y = 7;
        int z = 9;

        if (x > y && x > z) {
            System.out.println("The maximum value is x: " + x);
        } else if (y > z) {
            System.out.println("The maximum value is y: " + y);
        } else {
            System.out.println("The maximum value is z: " + z);
        }
    }
}