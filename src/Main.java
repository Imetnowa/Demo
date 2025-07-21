
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Principal: ");
        int principal = myScanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualInterest = myScanner.nextFloat();
        float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Period (Years):" );
        byte years = myScanner.nextByte();
        int numberOfPayments = years*MONTHS_IN_YEAR;

        double mortgage = principal
                *(monthlyInterest*Math.pow(1+monthlyInterest, numberOfPayments )  )/
                (Math.pow(1+monthlyInterest, numberOfPayments)-1);;

        System.out.println("Mortgage: "  + mortgage);; ;



    }
}