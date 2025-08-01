package day11;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new FileReader("C:/Users/varsh/OneDrive/Documents/Exceptional.xml"));
        String line;
        while((line=br.readLine())!= null) {
        System.out.println(line);}
        br.close();
        System.out.println("this is bufferedreader process ");
        
        
	}

}
