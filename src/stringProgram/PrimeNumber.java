package stringProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max=100;
		boolean flag=false;
		//System.out.println(max);
		
		for(int i=3; i<max; i++) {
			flag=false;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
				else
					flag=true;
					
				
					
			}
			if(flag)
				System.out.println("Prime: "+ i);
			
			
		}
		

	}

}
