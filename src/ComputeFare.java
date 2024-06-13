
import java.util.Scanner;

public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Coloque sua idade \n");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        int fare;

        keyboard.close();
        if (age < 11) // comapara diversas idades para a aplicacao de uma tarifa
        {
            fare = 3;
        }
        else if (age > 11 && age <65)
        {
            fare = 5;
        }
        else
        {
            fare = 3;
        }
        System.out.println("Tarifa: " + "US$" + fare);
    }
}
