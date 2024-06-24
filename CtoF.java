import java.util.Scanner;

public class CtoF
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double celsiusTemp = 0.0;
        double fahrenheitTemperature;
        String trash;

        System.out.println("Please enter the temperature in celcius");
        if (in.hasNextDouble())
        {
            celsiusTemp = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("  pls run the program again you have entered an incorrect input: " + trash);
            System.exit(0);
        }
        fahrenheitTemperature = celsiusTemp *(9.0/5.0) + 32;
        System.out.println("The temperature in fahrenheit is "+ fahrenheitTemperature);


    }

}
