package practice;
abstract class Cal
{
	abstract public void add(int i,int j);
	abstract public void sub(int i,int j);
	
	}
class Normal extends Cal
{
	public  void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public void sub(int i,int j)
	{
		System.out.println(i-j);
	}
	}

public class Calsi extends Normal{

	public static void main(String[] args) {
		Normal  n=new Normal();
		n.add(10,52);
		n.sub(50,20);

	}

}
