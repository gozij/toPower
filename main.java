/**
 * main
 */
import java.lang.Math;
import java.util.Arrays;

public class main {

    public static double[] toPower(int size, int power){
        double[] result = new double[size];
        for(double i = 0; i < size; i ++){
            result[(int) i] = Math.pow(Double.valueOf(i), Double.valueOf(power));
        }
        return result;
    }



    public static void main(String[] args) {
        int size = 4;
        int power = 2;
        double[] result = toPower(size, power);

        System.out.print(Arrays.toString(result));

    }
}


    

