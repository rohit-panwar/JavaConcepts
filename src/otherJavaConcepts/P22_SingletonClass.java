package otherJavaConcepts;

public class P22_SingletonClass {

	public static P22_SingletonClass singleton_instance=null;
	public String str;
	
	private P22_SingletonClass() {
		str="I am in Constructor";
	}
	
	public static P22_SingletonClass getInstance() {
		if(singleton_instance==null)
			singleton_instance= new P22_SingletonClass();
		return singleton_instance;
	}
	
	public static void main(String[] args) {
		P22_SingletonClass x= P22_SingletonClass.getInstance();
		P22_SingletonClass y= P22_SingletonClass.getInstance();
		P22_SingletonClass z= P22_SingletonClass.getInstance();

		x.str=x.str.toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		y.str=x.str.toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
