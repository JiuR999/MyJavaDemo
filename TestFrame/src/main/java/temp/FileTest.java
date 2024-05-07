package temp;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        InputStream in;
        OutputStream out;

        {
            try {
                in = new FileInputStream(new File("C:\\Users\\–Ò–Ò±¶±¶\\Pictures\\IO.jpg"));
                out = new FileOutputStream(new File("D:\\IDEA\\TestFrame\\test1.jpg"));
                byte[] bytes = new byte[1024];
                int len;
                while((len = in.read(bytes))!= -1){
                    out.write(bytes,0,len);
                }
                out.flush();
                System.out.println("∂¡–¥ÕÍ±œ!");
                out.close();
                in.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
