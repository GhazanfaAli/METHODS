public class Average {
    public static double average(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
    public static void main(String args[]){
       System.out.println( average(2.5, 3.8, 4.2, 1.9));
    }

}
