package euler.tools.algebra;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Created by JAJAJAJJAJAJAJ on 24/03/17.
 */
public class primegen {
    private int LargestKnownPrime;
    private int private_index=0;
    private int secret_side;
    ArrayList<Long> PrimSieve = new ArrayList<Long>();


    Iterator<Long> iter = PrimSieve.iterator();

    public boolean isprime(long p)
    {
        if (this.PrimSieve.isEmpty()) {
            GeneratePrimes(p);
        }
        Iterator<Long> iter = this.PrimSieve.iterator();
        while (iter.hasNext()){
            long div=iter.next();
            if (p%div==0){
                return false;
            }
        }
        return true;
    }

    public void GeneratePrimes(long p){
        int n;
        if (this.PrimSieve.isEmpty()) {
            GeneratePrimesBase(p);
        }
        while (this.LargestKnownPrime<Math.sqrt(p)){
            next_prime();
        }
    }

    public boolean primitivity_test(long p){
        Iterator<Long> iter = this.PrimSieve.iterator();
        while (iter.hasNext()) {
            long d = iter.next();
            if (d > Math.sqrt(p)) {
                return true;
            }
            if (p % d == 0) {
                return false;
            }

        }
        return true;
    }
    public void GeneratePrimesBase(long p){
        this.PrimSieve.add(2L);
        this.PrimSieve.add(3L);

    }

    public long next_prime() {


        long i=max(this.PrimSieve)+this.secret_side;
        int k;
        while (true){
            k = this.private_index + this.secret_side
            if (primitivity_test(k)==false);
            i+=6;
        }
        return i;
    }

    public long max(ArrayList<Long> tab){

        return this.PrimSieve.get(this.PrimSieve.size());
    }
}

