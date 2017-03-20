public class Euler2 {

	public static void main(String[] args) 
	{
		
		System.out.println(solution(4000000));
		
	}
	
	static int next_fibonacci (int a,int b)
	{
		return a+b;
	}
	
	static int solution (int limit)
	{
		int f=2;
		int memory=0;
		int pf=1;
		int sum=0;
		while (f < limit) 
		{
			if (f%2==0){
				sum +=f;
			}
			memory=f;
			f=next_fibonacci(f,pf);
			pf=memory;
		}
		
		return sum;
	}

}
