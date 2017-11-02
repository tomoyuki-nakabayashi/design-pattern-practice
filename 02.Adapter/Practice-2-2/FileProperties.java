import java.io.*;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
  private final String header = "#written by FileProperties";

  public void readFromFile(String filename) throws IOException{
    InputStream is = new FileInputStream(filename);
    load(is);
    is.close();
  }

  public void writeToFile(String filename) throws IOException{
    OutputStream os = new FileOutputStream(filename);
    store(os, header);
    os.close();
  }

  public void setValue(String key, String value){
    setProperty(key, value);
  }

  public String getValue(String key){
    return getProperty(key);
  }
}