package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeStudent {

	public static void main(String[] args) {

		try {

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("s.ser"));
			Student ss = (Student) in.readObject();

			System.out.println("Object has been deserialized ");
			System.out.println(ss.id + " " + ss.name);
			in.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
