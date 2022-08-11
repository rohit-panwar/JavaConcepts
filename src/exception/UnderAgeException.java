package exception;

public class UnderAgeException extends RuntimeException{

	UnderAgeException(){
		super("You are under age < 18");
	}
	
	UnderAgeException(String msg){
		super(msg);
	}
}
