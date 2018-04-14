package otherJavaConcepts;

public class P19_FinalChild extends P19_FinalParent{

	public void start() {
		System.out.println("Child- Start");
		a=a+100;
		System.out.println(a);
	}
	
	public void stop() {
		System.out.println("Child- Stop");
		System.out.println(a);
	}
	
	public static void main(String []args) {
		P19_FinalChild p= new P19_FinalChild();
		p.start();
		p.stop();
	}
}
