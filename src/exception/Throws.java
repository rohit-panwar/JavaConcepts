package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Throws {

	public static void main(String[] args) {

		/*
		 * main is calling method here, hence it has to handle the exception shared by
		 * called method
		 */
		Throws t = new Throws();
		try {
			// t.readFile();
			t.saveFile();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void readFile() throws Exception, FileNotFoundException, ArithmeticException  {
		FileInputStream fis = new FileInputStream("C:\test.txt");
		/*
		 * This method just inform that it may cause FileNotFoundException, hence the
		 * calling method has to handle it in there own way.
		 */
	}

	public void saveFile() throws FileNotFoundException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("C:\\save.txt");
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	}

}
