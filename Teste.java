import java.lang.ProcessBuilder;
import java.io.*;
public class Teste {
   public static void main(String []args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("python","teste.py", "10", "20");
        Process p = pb.start();
        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
        int ret = Integer.parseInt(in.readLine());
        System.out.println("value is : "+ret);
   }
}