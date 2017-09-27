package euler.tools.algebra;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Created by JAJAJAJJAJAJAJ on 10/04/17.
 */
public class divisors {
    primegenerator pg = new primegenerator();
    public boolean is_divisor(long p, long d){
        return (p % d == 0);
    }
    public long number_of_divisors(long p){
        int count = 2;
        if (this.pg.max()< Math.sqrt(p)){
            this.pg.GeneratePrimes((long) (Math.sqrt(p)));
        }
        Iterator<Long> iter = this.pg.PrimSieve.iterator();
        while (iter.hasNext()){
            long d = iter.next();
            if (is_divisor(p,d)){
                count +=2;
            }
        }
        return count;
    }

}

