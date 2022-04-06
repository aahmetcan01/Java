import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the process");
        String proces= "1. addition \n"
                                   +"2.extraction\n"
                                   +"3.multiplication\n"
                                   +"4.division\n";
        System.out.println(proces);
        String process = scanner.nextLine();
        switch (process){
            case "1":
                System.out.println("Number1: ");
                int num1= scanner.nextInt();
                System.out.println("Number2: ");
                int num2 = scanner.nextInt();
                System.out.println("Addition is : " + (num1+num2));
            case "2":
                System.out.println("Number1: ");
                int num3= scanner.nextInt();
                System.out.println("Number2: ");
                int num4 = scanner.nextInt();
                System.out.println("Extraction is : " + (num3-num4));
            case "3":
                System.out.println("Number1: ");
                int num5= scanner.nextInt();
                System.out.println("Number2: ");
                int num6 = scanner.nextInt();
                System.out.println("Multiplication is : " + (num5*num6));
            case "4":
                System.out.println("Number1: ");
                int num7= scanner.nextInt();
                System.out.println("Number2: ");
                int num8= scanner.nextInt();
                System.out.println("Addition is : " + ((double)num7/num8));
                break;

        }

    }
}
