import Device.Laptop;
import Device.Macbook;
import Device.Toshiba;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptop laptop;

        System.out.println("Select a laptop:");
        System.out.println("1. Macbook");
        System.out.println("2. Toshiba");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                laptop = new Macbook();
                break;
            case 2:
                laptop = new Toshiba();
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        laptop.on();
        laptop.volumeUp();
        laptop.volumeDown();
        laptop.off();

        scanner.close();
    }
}
