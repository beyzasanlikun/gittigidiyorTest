import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.*;

public class GittiGidiyorSampleTest extends BaseTest{

    @Test
    public void anasayfaTest(){
        assertEquals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi",getTitle());
    }

    @Test
    public void GirisYap(){
        //clickByClassName("style__StyledHeaderAction-sc-181qrxr-5 crisTd");
        //clickByLintext("Giriş yap");

        driver.findElement(By.xpath("//*[@title = 'Giriş Yap']")).click();
        driver.get("https://www.gittigidiyor.com/uye-girisi");
        sendById("L-UserNameField","beyzasanlikun@gmail.com");
        sendById("L-PasswordField","123456");
        clickById("gg-login-enter");
    }

    @Test

    public void KayitOl(){

        driver.findElement(By.xpath("//*[@title = 'Giriş Yap']")).click();
        driver.get("https://www.gittigidiyor.com/kayit-ol");
        sendByName("name","Beyza");
        sendByName("surname","Sanlikun");
        sendByName("email","beyzasanlikun@gmail.com");
        sendByName("passwd","123456");
        sendById("gsmData","555333333");
    }
}
