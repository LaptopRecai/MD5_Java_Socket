import java.io.*;
import java.math.BigInteger;
import java.net.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
  
// Server sınıfı
public class Server 
{
    public static void main(String[] args) throws IOException 
    {
        // 1881 protunu dinliyor
        ServerSocket ss = new ServerSocket(1881);
          
        // Sonsuz döngü
        // client isteği
        while (true) 
        {
            Socket s = null;
              
            try 
            {
                // gelen client isteklerini almak için soket nesnesi
                s = ss.accept();
                  
                System.out.println("Client bağlandı : " + s);
                  
                // giriş ve çıkış streamlerinin elde edilmesi
                DataInputStream dis = new DataInputStream(s.getInputStream());
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                  
                System.out.println("Client için yeni atama yapılıyor");
  
                // yeni bir thread nesnesi oluşturdum
                Thread t = new ClientHandler(s);
  
                // Invoking the start() method
                t.start();
                  
            }
            catch (Exception e){
                s.close();
                e.printStackTrace();
            }
        }
    }
}
// ClientHandler class
class ClientHandler extends Thread 
{
    
public static String MD5olusturma(String input)
	{
		try {

			// MD5 hash ile statik getInstance metodu çağrılır
			MessageDigest md = MessageDigest.getInstance("MD5");


                        // mesaj özetini hesaplamak için özet() yöntemi çağrılır
                        // bir girdi özetinin () bayt dizisini döndür
			byte[] messageDigest = md.digest(input.getBytes());

			
                        // Bayt dizisini signum gösterimine dönüştür
			BigInteger no = new BigInteger(1, messageDigest);

			
                        // Mesaj özetini onaltılık değere dönüştür
			String hashtext = no.toString(16);
			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}
			return hashtext;
		}

		
                        // Yanlış mesaj özeti algoritmaları belirtmek için
		catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	

    ClientHandler(Socket s) {
        throw new UnsupportedOperationException("");
    }
}


      


