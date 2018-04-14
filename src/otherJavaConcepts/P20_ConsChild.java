package otherJavaConcepts;

public class P20_ConsChild extends P20_ConsParent {

	public P20_ConsChild() {
		super();
		//super(10);
		System.out.println("In Child Constructor");
	}

	public static void main(String args[]) {

		P20_ConsChild c= new P20_ConsChild();
	}

}
