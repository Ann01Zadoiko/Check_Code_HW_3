import java.util.Scanner;

public class Input {

    private final Box box = new Box();
    private static final Scanner scanner = new Scanner(System.in);

    public byte inputBox() {
        while (true) {
            byte input = scanner.nextByte();
            if (input > 0 && input < 10) {
                if (!box.isEmptyBox((byte) (input - 1)))
                    System.out.println("That one is already in use. Enter another.");
                else {
                    return input;
                }
            } else
                System.out.println("Invalid input. Enter again.");
        }
    }
}
