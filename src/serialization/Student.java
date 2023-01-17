package serialization;

import java.io.Serializable;

/*
 * Serialization in simple terms means converting an object into a sequence of bytes, 
 * deserialization is exactly the opposite. In deserialization, an object is reconstructed back from the sequence of bytes. 
 * In Java, Serialization and deserialization play a great role in the transfer of data and saving it to a database or disk.
 */
public class Student implements Serializable {

	int id;
	String name;

	public Student(int id, String name) {
		// super();
		this.id = id;
		this.name = name;
	}

}
