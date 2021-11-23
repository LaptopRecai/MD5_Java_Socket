import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import javax.swing.JOptionPane;

// MD5 hash değerini hesaplayan Java programı
// -----------------------------------------
// Taha TANGÜLÜ
// 16260055
// -----------------------------------------
public class MD5 {
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

	
                        // Sürücü kodu
	public static void main(String args[]) throws NoSuchAlgorithmException
	{ 
                //System.out.println("MD5 Tarafından HashCode oluşturmak için giriş yapınız:");
                //Scanner MD5Veri = new Scanner(System.in); // MD5Veri nesnesini oluşturmuş olduk. 
                //System.out.println("MD5 Tarafından Oluşturulan HashCode'unuz: " + MD5olusturma(s));
            
            
		String s = JOptionPane.showInputDialog("MD5 Tarafından HashCode oluşturmak için giriş yapınız");
                JOptionPane.showMessageDialog(null,"MD5 Tarafından Oluşturulan HashCode'unuz: "+MD5olusturma(s));
                System.out.println(MD5olusturma(s));
		
	}
}
