package euler;

/**
 * Created by JAJAJAJJAJAJAJ on 08/04/17.
 $*
 *
 *
 *
 # Pygore triplet bruteforce
 */



public class Euler9 {
    public int solution(){
        int i,j,k,p;
        for (i=1;i<1000;i++){
            for (j=i+1;j<1000;j++){

                if (i*i+j*j==(1000-j-i)*(1000-j-i)){
                    return i*j*(1000-j-i);
                }

            }
        }
    return 0;

    }

}
