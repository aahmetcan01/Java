import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int factorial =1;
        int num= scanner.nextInt();


        for (int i=1;i<=num;i++){
            factorial*=i;

        }
        System.out.println("factorial= " + factorial);
    }
}
