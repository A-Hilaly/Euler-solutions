package euler.tools.algebra;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Created by JAJAJAJJAJAJAJ on 24/03/17.
 */
public class prime {
    private int LargestKnownPrime;
    private ArrayList<Long> PrimSieve = new ArrayList<Long>();
    Iterator<Long> iter = this.PrimSieve.iterator();
    public static boolean isprime(long p)
    {
        int i;
        if (p%2==0 || p==1 || p==0 || p%3==0 ) {
            return false;
        }
        for (i=1;i<Math.sqrt(p)+1;i+=6){
            if (p%(i+1)==0 && p%(i-1)==0){
                return false;
            }
        }
        return true;
    }
    public void GeneratePrimes(long p){
        if this.PrimSieve.isEmpty():
    }
    public static long next_prime(long p){

        return p;
    }

}
