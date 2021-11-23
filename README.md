## Bilgisayar Sistemleri Lab. Proje

# MD5_Java_Socket


1. Dışardan başlangıç, bitiş ve özütlenmiş veri bilgilerini alan bir fonksiyon oluşturulur. Bu 
fonksiyon başlangıç ve bitiş değerleri arasındaki tüm değerleri md5 fonksiyonundan 
geçirerek özütlenmiş halleri bulunur. Bulunan değer, dışardan girilen özütlenmiş veri 
bilgisi ile aynı ise fonksiyon o anda aktif olarak işlem gören sayısı geri döndürür. 

2. Main metodu içerisinde bir string tanımlanır. Bu string “Başlangıç-Bitiş-a12cdd…” gibi 
üç parametreyi aralarına boşluk, tire, virgül gibi bir karakter ekleyerek ifade eder. Bu 
stringin çözümlenmesi için bir split metodu yazılarak, ilk değer başlangıç, ikinci değer 
bitiş ve üçüncü değer ise özütlenmiş veri yerine konulur ve 1. Adımda oluşturulan 
fonksiyon çağrılır.

3. Bilgisayarlar aynı ağa bağlanır.

4. Bir bilgisayar başka bilgisayarların bağlanması için Java Socket sınıfında yararlanarak 
port açar ve diğer bilgisayar buna bağlanır. İki bilgisayar arasında mesajlama işlemi test 
edilir. 

5. Diğer bilgisayarlarda istemciden gelen mesaj 2. Maddedeki formatta gönderilir. Alınan 
mesaj 2. Maddedeki string yerine yazılarak kod çalıştırılır.

6. Bir bilgisayar açtığı portu dinlerken tüm kaynakları onun için harcar ve başka bir işlem 
yapamaz. Birden fazla bilgisayarın bağlanabilmesi için ana bilgisayarda port dinleme 
işlemi thread kullanacak şekilde uyarlanır.



