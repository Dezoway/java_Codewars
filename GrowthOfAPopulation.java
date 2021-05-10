public class GrowthOfAPopulation {

    public static int Population(double a, double b, double c, double d){
        int year = 0;
        while ( a < d ){
            a = a + (a *(b/100)) + c;
            year ++;

        }
        return year;
    }

    public static void main(String[] args){
        System.out.println(Population(1500000, 0.25, 1000, 2000000));
    }
}
