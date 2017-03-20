package problems;


public class Euler5 {
	
	public static long solution(){
		long i;
		long k=0;
		for(i=2*3*5*7*11*13*19; ;i++){
			if (i%20==0 && i%19==0 && i%18==0 && i%17==0 && i%16==0 && i%14==0 && i%13==0 && i%11==0){
				k=i;
				break;
			}
		}
		return k;
	}
}	
