public class Euler1 {

	public static void main(String[] args) {
  
		System.out.println(sum(1000,3)+sum(1000,5)-sum(1000,15));
	
	}
  
	static int sum (int b,int step) {
  
		int i;
		int summ = 0;
		for(i=step; i<b; i += step) {
			summ += i;
		}
    
		return summ;
	}

}
