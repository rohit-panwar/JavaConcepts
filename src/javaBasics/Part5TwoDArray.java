package javaBasics;

public class Part5TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String t="Data";
		String s[][]=new String[5][10];
		
		for(int i=0; i<s.length;i++) {
			for(int j=0; j<s[0].length; j++)
				s[i][j]=t+"_"+i+j;
		}
		
		for(int i=0; i<s.length;i++) {
			System.out.println();
			for(int j=0; j<s[0].length; j++)
				System.out.print(" "+s[i][j]);
		}
		
	}

}
