import java.io.*;
import java.net.*;
import java.util.*;
import java.net.ServerSocket;
/**
 * Created by jiesi on 2018/11/19.
 */
public class SocketTest {
    public static void main(String [] args)
    {
        try {
            ServerSocket s=new ServerSocket(8189);
            Socket incoming=s.accept();
            InputStream inStream=incoming.getInputStream();
            OutputStream outStream=incoming.getOutputStream();

            Scanner in=new Scanner(inStream,"Utf-8");//将输入流转成扫描器
            PrintWriter out=new PrintWriter(new OutputStreamWriter(outStream));//将扫描器再转成写入器；
            String line =in.nextLine();
            out.println("Echo: " +line);
            incoming.close();
            boolean done=true;
            if(line.trim().equals("BYE"))done=true;
            out.println("Hello Enter BYE to exit!");




        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
