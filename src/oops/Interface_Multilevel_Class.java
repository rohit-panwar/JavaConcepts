package oops;

public class Interface_Multilevel_Class implements Interface_Multilevel1, Interface_Multilevel2{

	// We can achieve multilevel interitancec using interface bcoz here method defination is not implement in interface.
	// hence compliler does not have any confusion that which method should I refer.
	@Override
	public void execute() {
		System.out.println("Execute Interface- Common method");
	}

	@Override
	public void display1() {
		System.out.println("Display 1st Interface");
	}

	@Override
	public void display2() {
		System.out.println("Display 2nd Interface");
	}
	
	public static void main(String[] args) {
		Interface_Multilevel_Class c= new Interface_Multilevel_Class();
		
		c.execute();
		c.display1();
		c.display2();
	}

	
}

