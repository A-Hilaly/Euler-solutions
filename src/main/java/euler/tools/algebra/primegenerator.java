package euler.tools.algebra;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Hilaly Mohammed-Amine on 24/03/17.
 */

/* Generating primes using a known list of primes eliminates all unecessary calculation
* Until we will need to extend our prime list using the fact that the IP\{2,3} are all included
* in {6k+1, 6k-1 / for k in N\{0}}
*
*/


public class primegenerator {
    /** 
    6K+1 / 6k-1 <==> private_index*6 + (secret_side)^m
    */
    int private_index=1;
    int secret_side=-1;
    public ArrayList<Long> PrimSieve = new ArrayList<Long>();
    
    public void GeneratePrimesBase(){
        this.PrimSieve.add(2L);
        this.PrimSieve.add(3L);

    }
    
    /*  p primitivity test is done by checking divisibility by all primes < sqrt p
    */
    public boolean isprime(long p)
    {
        
        GeneratePrimes(p);
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
            GeneratePrimesBase();
        }
        while (max(this.PrimSieve)<Math.sqrt(p)){
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

    public void next_prime() {
        boolean found=false;
        while (true) {
            long p = this.private_index * 6 + this.secret_side;
            if (primitivity_test(p)) {
                this.PrimSieve.add(p);
                found=true;
            }
            if (this.secret_side == 1) {
                this.private_index += 1;
            }
            this.secret_side = this.secret_side * -1;
            if (found){
                break;
            }
        }
    }


    public long max(ArrayList<Long> tab){
        return this.PrimSieve.get(this.PrimSieve.size()-1);
    }
}

