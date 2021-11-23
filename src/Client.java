import java.io.*;
import java.net.*;
import java.util.Scanner;
  
// Client class
public class Client 
{
    public static void main(String[] args) throws IOException 
    {
        try
        {
            Socket s;
            // localhost IP
            try (Scanner klavye = new Scanner(System.in)) {
                // localhost IP
                InetAddress ip = InetAddress.getByName("localhost");
                // Server ile 1881 portu ile bağlantı kurulur
                s = new Socket(ip, 1881);
                DataInputStream md5 = new DataInputStream(s.getInputStream());
                while (true) {
                    String tosend = klavye.nextLine();
                    if(tosend.equals("Exit"))
                    {
                        System.out.println("Bağlantı sonlandırılıyor : " + s);
                        s.close();
                        System.out.println("Bağlantı sonlandırıldı");
                        break;
                    }
                    
                    // Client tarafından talep edilen MD5
                    String received = md5.toString();
                    System.out.println(received);
                }
                // kaynak kapatılıyor
            }
            s.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}