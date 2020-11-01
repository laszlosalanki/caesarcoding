import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;

public class Code {
	
	private OutputStream outputStream;
	private BufferedReader inputStream;
	
	private static final byte[] NEW_LINE = "\n".getBytes();
	
	public Code(BufferedReader inputStream, OutputStream outputStream) {
		
		this.inputStream = inputStream;
		this.outputStream = outputStream;
	}
	
	public void init() throws IOException {
		
		String line;
		while (!(line = inputStream.readLine()).equals("") ) {
			String translated = translate(line, 'C');
			write(translated.getBytes());
			write(NEW_LINE);
		}
	}

	public String translate(String to_translate, char offset) {
		
        char[] out = to_translate.toUpperCase().toCharArray();
        for (int i = 0; i < out.length; i++) {
			out[i] += offset - 'A';
			if (out[i] > 'Z')
				out[i] -= 'Z' - 'A' + 1;
        }
        return new String(out);
    }
	
	public void write(byte[] to_write) throws IOException {
		
		outputStream.write(to_write);
	}
}
