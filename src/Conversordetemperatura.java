import java.util.Scanner;
public class Conversordetemperatura {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Qual a temperatura em Fahrenheit? : ");
        double Fahrenheit = input.nextDouble();
        double Celsius = (Fahrenheit- 32)*5/9;
        System.out.println("A temperatura em Celsius é:"+Celsius );

    }
}
