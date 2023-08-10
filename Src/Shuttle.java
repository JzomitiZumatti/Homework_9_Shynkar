import java.util.ArrayList;

public class Shuttle {
    final static int a = 4; //forbidden number
    final static int b = 9; //forbidden number
    final static int numOfShuttles = 100; //general number of shuttles
    public static void main(String[] args) {
        int counter = 1;
        int endFor = 101; // because counter value is equal to 1, endFor - counter must be equal to numOfShuttles
        ArrayList<Integer> numbers = new ArrayList<>();
        do {
            for (int i = 1; i < endFor; i++) {
                if (i / 100 == a || i / 10 % 10 == a || i % 10 == a ||
                        i / 100 == b || i / 10 % 10 == b || i % 10 == b) {
                    endFor++;
                } else {
                    numbers.add(i);
                    System.out.print(i + " ");
                    counter++;
                }
            }
        } while (counter < numOfShuttles);
        //you can display shuttle numbers in 10 lines with 10 numbers in each, just uncomment the code below
        System.out.println();
        counter = 0;
        for (Integer num : numbers) {
            if (counter < 10) {
                System.out.print(num + " ");
                counter++;
            } else {
                System.out.print("\n" + num + " ");
                counter = 1;
            }
        }
    }
}
