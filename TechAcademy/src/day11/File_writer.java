package day11;

import java.io.FileWriter;
import java.io.IOException;

public class File_writer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String cont ="monika";
		FileWriter fw = new FileWriter("C:/Users/varsh/OneDrive/Documents/Exceptional.xml");
		fw.write("this is java class\n"+ cont +"\n");
		fw.write("this is wipro preskilling");
		fw.close();
		System.out.println("This is filewriter process");
	}

}
