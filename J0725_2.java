import java.util.Scanner;
class J0725_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Welcome to calculator!");
        while (true) {
            System.out.println("Choose your operation: 1. Addition 2. Subtraction 3. Multiplication 4. Division 0. Exit");
            choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Quitting...");
                break;
            }
            System.out.print("Enter first number (x): ");
            double x = scanner.nextDouble();
            System.out.print("Enter second number (y): ");
            double y = scanner.nextDouble();
            switch (choice) {
                case 1:
                    System.out.println("Result: " + (x + y));
                    break;
                case 2:
                    System.out.println("Result: " + (x - y));
                    break;
                case 3:
                    System.out.println("Result: " + (x * y));
                    break;
                case 4:
                    if (y != 0) {
                        System.out.println("Result: " + (x / y));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("INVALID INPUT");
            }
        }
        scanner.close();
    }
}
