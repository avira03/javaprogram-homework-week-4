package javaprogrammes;
/**
 * Display left angle triangle of * using nested for loops
 */
public class Programme_15_LeftAngleTriangle {
    public static void main(String[] args) {
        int n = 5;// Number of rows

        for (int i =1; i <= n; i++){
            for (int j = 1; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

