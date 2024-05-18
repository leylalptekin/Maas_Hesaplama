Problem : Maaş Hesaplama Java'da "Çalışan" şirketinde fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 kalite ve 5 metoda sahip olacaktır.

Sınıfın Nitelikleri

isim : Çalışanın adı ve soyadı maaş : Çalışanın maaşı çalışmaSaati : Haftalık çalışma saati kiralamaYıl : İşe başlangıç ​​yılı Sınıfın Metotları


Çalışan(adı,maaş,çalışmasaati,işeyıl) : Kurucu metot olup 4 parametre altındadır.
Tax() : Maaşa uygulanan vergiyi hesaplama işlemi. Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır. Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır. 

 Bonus() : Eğer çalışıyorsa haftada 40'tan fazla çalışıyorsa fazladan çaba harcıyorsa saat başına 30 TL olacak şekilde bonus ücretleri hesaplama sistemi.
 RaiseSalary() : Çalışanın işe başlamasına göre maaş artışını hesap çalışması. Şu anda ki yılı 2021 olarak alınıyor. Eğer çalışıyorsa 10 harf az bir çalışıyorsa maaşına %5 zam yapılacaktır. Eğer çalışan 9 harften fazla ve 20 harften az çalışıyorsa maaşına %10 zam yapılacaktır. Çalışan 19 harften fazla çalışıyorsa %15 zam yapılacaktır. 
 toString() : Çalışana ait göstergeler bastırılacaktır.
