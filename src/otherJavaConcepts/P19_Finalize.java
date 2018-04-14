package otherJavaConcepts;

public class P19_Finalize {
	
	public void finalize() {
		System.out.println("In Finalize");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P19_Finalize f1= new P19_Finalize();
		f1=null;
		
		System.gc();
	}

}
