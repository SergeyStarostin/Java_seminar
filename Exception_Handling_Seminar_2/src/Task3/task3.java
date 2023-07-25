package Task3;

public class task3 {
    public static double calculateSquareRoot(double sqare) {
        if (sqare<0){
            throw new NegativeSquareRootException("Number<0!");
        }
        return Math.sqrt(sqare);
        
    }
    public static void main(String[] args) {
        System.out.println(calculateSquareRoot(25));
        System.out.println(calculateSquareRoot(-25));
    }
}