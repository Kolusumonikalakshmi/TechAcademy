package day11;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_writer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedWriter br=new BufferedWriter(new FileWriter("C:/Users/varsh/OneDrive/Documents/Exceptional.xml",true));
		br.write("hello world everyone ");
		br.newLine();
		br.close();
		System.out.println(" Done successfully");

	}

}
