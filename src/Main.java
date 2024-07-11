import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        nestedLoops();
        futureTuition();

    }
// multiplication table
    public static void nestedLoops(){

        for(int i = 0; i <= 12; i++){
            for(int j = 0; j <= 12; j++){
                System.out.print((i * j) + "\t");
            }

            System.out.println();
        }
    }


// greatest common divisor

    public static void greatestCommonDivisor() {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        ArrayList<Integer> divisors = new ArrayList<Integer>();

        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                divisors.add(i);
            }
            System.out.println(divisors.get(divisors.size() - 1));
        }
    }
         public static void futureTuition(){
             double tuition = 10000.00;
             double finalTuition = tuition * 2;

             double currentAmount = 10000.00;

             for(int i = 1; currentAmount < finalTuition; i++){
                 currentAmount += currentAmount * 7/100;
                 if(currentAmount > finalTuition){
                     System.out.printf("The amount of years it would take is %d to be %.2f", i, currentAmount);
                 }
             }
        }


}