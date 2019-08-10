import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileIO f = new FileProperties();
	f.readFromFile("file.txt");
	try {
	    f.readFromFile("file.txt");
	    f.setValue("year","2004");
	    f.setValue("month","4");
	    f.setValue("day","21");
	    f.writeToFile("newfile.txt");
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}