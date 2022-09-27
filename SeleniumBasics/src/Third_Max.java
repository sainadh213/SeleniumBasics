
public class Third_Max {

	public static void max(int[] args) {
		int max=args[0],secmax=args[0],thirdmax=args[0];
		for(int i=0;i<args.length;i++)
		{
			if(args[i]<max)
			{
				thirdmax=secmax;
				secmax=max;
				max=args[i];
			}
			 else if(args[i]<secmax)
			{
				thirdmax=secmax;
				secmax=args[i];
			}
			 else if(args[i]<thirdmax)
			 {
				 thirdmax=args[i];
			 }
		}
		System.out.println(thirdmax);
		}
		public static void main(String args[])
		{
			int a[]= {5000,2000,3000,4000,7000};
			max(a);
		}
	
		

}