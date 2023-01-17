package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeStudent {

	public static void main(String[] args) {

		Student s = new Student(101, "Roh");

		try {
			FileOutputStream fout = new FileOutputStream("s.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);

			out.writeObject(s);
			out.flush();
			out.close();
			System.out.println("Object has been serialized");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
