package practice;

  class Atm {
	private int pin;
	public void setpin(int pin)
	{
		this.pin=pin;
	}
     public int getpin()
     {
    	 if(pin==1234)
    	 {
    		 System.out.println("pin is valid");
    	 return pin;
    	 }
    	 else
    	 {
    		 System.out.println("pin is invalid");
    		 return 0;
    		 
    	 }
     }
     
		
  }
  public class Encapsulation
  {
	  public static void main(String[] args) {
		Atm a=new Atm();
		a.setpin(12345);
		a.getpin();
	}
  }

