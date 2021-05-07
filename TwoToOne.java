import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class TwoToOne {
    public  static int  squares(int[] a) {
        int sum = 0;
        for (int b : a){
            sum += Math.pow(b,2);
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] z = new int[]{1,2,3,4};
        System.out.println(squares(z));
    }
}
