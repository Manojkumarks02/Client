package ClientInterview;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	int id;
	String name;
	transient int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}
}

public class TransientKeyword {
	public static void main(String[] args) throws Exception  {
		Student s1 = new Student(1, "manoj", 23);
		System.out.println("object created");
		
		FileOutputStream fw = new FileOutputStream("abcd,txt");
		ObjectOutputStream ow = new ObjectOutputStream(fw);
		
		ow.writeObject(s1);
		ow.flush();
		ow.close();
		System.out.println("success");
		

	}

}
