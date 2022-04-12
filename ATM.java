import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance= 1000;
        String proceses= "1.Proces: Learn to balance\n"
                        +"2.Proces: Withdrawal\n"
                        +"3.Proces: Investment\n"
                        +"If you want to quit press q";
        System.out.println("*******************************");
        System.out.println(proceses);
        System.out.println("*******************************");

        while (true) {

            System.out.println("Please choose the proces");
            String Proces=scanner.nextLine();

            if (Proces.equals("q")) {
                System.out.println("Quit");
                break;
            }
            else if (Proces.equals("1")) {
                System.out.println("Your balance is " + balance);

            }
            else if (Proces.equals("2")) {
                System.out.println("Please enter the amount");
                int amount = scanner.nextInt();
                scanner.nextLine();
                balance-=amount;


            }
            else if (Proces.equals("3")){
                System.out.println("Please enter the amount");
                int amountt=scanner.nextInt();
                scanner.nextLine();
                balance+=amountt;


            }
            else
                System.out.println("Wrong process");




        }
    }
}
