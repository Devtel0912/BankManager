import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {



        //-------------Login---------------------
        String Password = "deepadeep";
        System.out.println("Enter your password: ");
        String inputPassword = scanner.nextLine();


        if (!inputPassword.equals(Password)) {
            System.out.println("Wrong");
            return;
        }
        //------------------------------------------



        System.out.println("Enter Your Amount: ");
        double balance = scanner.nextDouble();
        boolean running = true;
        int choice;
        while (running) {

            System.out.println("********************************");
            System.out.println("Welcome to Dev's Banking Program");
            System.out.println("********************************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("********************************");


            //--------------Choice---------------------
            System.out.print("Please enter your choice (1-4): ");
            choice = scanner.nextInt();


            switch (choice) {
                case 1 -> showbalance(balance);
                case 2 -> {
                    balance += deposit();
                    showbalance(balance);
                }
                case 3 -> {
                        balance -= withdraw(balance);
                        showbalance(balance);
                }

                case 4 -> running = false;
                default -> System.out.println("Invalid choice");
            }


        }







        scanner.close();
    }
    static void showbalance(double balance) {
        System.out.println("******************");
        System.out.printf("$%.2f\n", balance);
        System.out.println("*******************");
    }
    static double deposit(){

        double amount;

        System.out.println ("How Much Are U Depositing?");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }


    }
    static double withdraw(double balance) {

        double amount;

        System.out.println("How Much Are U Withdrawing?");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.print("Insufficient funds");
        } else if (amount < 0) {
            System.out.println("No Negatives");
        }
        else {
            return amount;
            }
        return amount;
    }
}
