package euler;
import euler.tools.algebra.divisors;
/**
 * Created by JAJAJAJJAJAJAJ on 10/04/17.
 */
public class Euler12 {
    public long solution(){
        int i;
        long n;
        divisors div = new divisors();
        for(i=5;;i++){
            n = i*(i+1)/2;
            if (div.number_of_divisors(n)==5000){
                return n;
            }
        }

    }
}
