import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ab {
	public void m1() throws IOException {
		  FileOutputStream out=new FileOutputStream("objectStore.ser");
	      ObjectOutputStream os = new ObjectOutputStream(out);
	      os.writeObject("Object on the fly!");
	}
}


