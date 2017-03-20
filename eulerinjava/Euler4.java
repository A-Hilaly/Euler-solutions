import java.math.*;

public class Euler4 {

	public static void main(String[] args) 
	{
		
        System.out.println(solution()); 
        System.out.println(836*836); 
		
		
		
	}
	
	public static int solution(){
		int i;
		int j;
		int max=0;
		int k=0;
		for(i=999;i>0 ;i--){
			for(j=999;j>0 ;j--){
				k=i*j;
				if (isPalindrom((Integer.toString(k)).toCharArray()) && k>max){
					max=k;
				}
			}
		}
		return max;
		
	}
	
	
	public static boolean isPalindrom(char[] word){
	    int i1 = 0;
	    int i2 = word.length - 1;
	    while (i2 > i1) {
	        if (word[i1] != word[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}

}
