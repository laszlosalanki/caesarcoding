import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class CaesarCoding {

    public static void main(String[] args) throws IOException {
    	
        String fileName = args[0];
        OutputStream outputStream = fileName == null ? System.out : new FileOutputStream(fileName);
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
        
        new Code(inputStream, outputStream).init();
    }
}
