package euler;
import euler.tools.algebra.primegenerator;
/**
 * Created by JAJAJAJJAJAJAJ on 08/04/17.
 */
public class Euler10 {
    public long solution(){
        primegenerator PG= new primegenerator();
        while (PG.max()<2000000){
            PG.next_prime();
        }
        return PG.sumsieve()-PG.max();
    }
}
