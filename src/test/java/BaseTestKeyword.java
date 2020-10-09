public class BaseTestKeyword extends BaseTest{

    public void GirisYap(String kullaniciAdi, String sifre){
        clickByLintext("Giriş Yap");
        sendById("L-UserNameField",kullaniciAdi);
        sendById("L-PasswordField",sifre);
        clickById("gg-login-enter");
    }

    public void KayitOl(String ad, String soyad, String email,String sifre, String telefon ){

        clickByXpath("//*[@id=\"__next\"]/header/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div/a");
        sendByName("name",ad);
        sendByName("surname",soyad);
        sendByName("email",email);
        sendByName("passwd",sifre);
        sendById("gsmData",telefon);

    }
}
