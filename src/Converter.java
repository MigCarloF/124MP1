import java.util.Scanner;

public class Converter {

    public Converter() {
        start();
    }

    private void start() {
        prompt();

        //gets input
        Scanner sc = new Scanner(System.in);
        double temp_f = sc.nextDouble();

        double temp_c = convert(temp_f);
        System.out.println(temp_f + "F in Celcius is " + temp_c + "C");
    }

    private void prompt() {
        System.out.println("Converting temperature from Farenheit to Celcius\n\nInput Temperature in Farenheit: ");
    }

    private double convert(double temp_f) {
        double ret = (temp_f - 32.0) * (5.0 / 9.0);
        return ret;
    }
}