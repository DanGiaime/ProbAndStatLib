
import java.util.HashSet;

/*
 * @author Dan Giaime
 */
public class ProbAndStatMath {


    /*
     *  Takes an array and conforms it to the minimal set it is equivalent to
     */
    private static void toSet(double[] array) {
        //Set to load into
        HashSet<Double> set = new HashSet();

        //Make a set from the array
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        //Reset array size
        array = new double[set.size()];

        //Load that set back into the array
        for (int i = 0; i < set.size(); i++) {
            array[i] = set.iterator().next();
        }
    }
    
    /*
     *  Returns n choose r
     */
    public static int numCombinations(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    
    /*
    *   Returns factorial of number given   
    */
    public static int factorial(int n){
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
    }
}
