package oopsConceptsPart1;

public class Part12_CallByValueAndCallByRef {

	int p;
	int q;
	
	public static void main(String[] args) {
		 
		int x=10;
		int y=20;
		
		Part12_CallByValueAndCallByRef obj= new Part12_CallByValueAndCallByRef();
		System.out.println("*** Call By Value ***");
		System.out.println("*** Before Swaping ***");
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		obj.swapValue(x, y);
		
		obj.p=10;
		obj.q=20;
		
		System.out.println("*** Call By Reference ***");
		System.out.println("*** Before Swaping ***");
		System.out.println("Value of p: "+obj.p);
		System.out.println("Value of q: "+obj.q);
		obj.swapRef(obj);
		
		System.out.println("*** After Swaping ***");
		System.out.println("Value of p: "+obj.p);
		System.out.println("Value of q: "+obj.q);

	}
	
	public void swapValue(int a, int b) {
		a=a+b; // a=30
		b=a-b; // b=10
		a=a-b; // a=20
		System.out.println("*** After Swaping ***");
		System.out.println("Value of x: "+a);
		System.out.println("Value of y: "+b);	
	}
	
	public void swapRef(Part12_CallByValueAndCallByRef a) {
		a.p=a.p+a.q;
		a.q=a.p-a.q;
		a.p=a.p-a.q;
		/*int t=a.p; // t=10
		a.p=a.q; //p=20
		a.q=t;//q=10
*/		
		
	}

}
