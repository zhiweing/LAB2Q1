package l2q1;
import java.util.Scanner;
public class L2Q1 {   
    public static void main(String[] args) {
        Scanner x=new Scanner (System.in);
        double Fahrenheit,Celcius;
        System.out.println("Enter the temperature in degree Fahrenheit.");
        Fahrenheit=x.nextDouble();
        Celcius=(Fahrenheit-32)/1.8;
        System.out.printf("The degree Celcius is %.2f",Celcius);
        
    }
    
}
