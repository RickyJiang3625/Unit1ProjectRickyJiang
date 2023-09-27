import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Bill amount: ");
        String billConvert=s.nextLine();
        double bill=Double.parseDouble(billConvert);

        System.out.print("Tip %: ");
        String tipConvert=s.nextLine();
        double tipPercent=Double.parseDouble(tipConvert);

        System.out.print("Number of People: ");
        String numberOfPeopleConvert=s.nextLine();
        int numberOfPeople=Integer.parseInt(numberOfPeopleConvert);
        //Calculations
        double tipAmountInMoney=(tipPercent/100)*bill;
        double billAfterTips=bill+tipAmountInMoney;
        double tipPerPerson=tipAmountInMoney/numberOfPeople;
        double totalPerPerson=billAfterTips/numberOfPeople;
        //Print
        System.out.println("Your total bill is: "+billAfterTips);
        System.out.println("Your total tip amount is: "+tipAmountInMoney);
        System.out.println("Your tip amount per person is: "+tipPerPerson);
        System.out.println("Your total per person is: "+totalPerPerson);
        s.close();











    }
}