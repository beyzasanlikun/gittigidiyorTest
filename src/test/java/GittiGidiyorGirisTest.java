import org.junit.Test;

public class GittiGidiyorGirisTest extends BaseTestKeyword {

    @Test
    public void girisTest(){
        GirisYap("beyzasanlikun@gmail.com","123456");
        GirisYap("beyza.sanlikun@testinium.com","123456");

    }

    @Test
    public void uyelikTest(){
        KayitOl("Beyza","Sanlikun","beyzasanlikun@gmail.com","123456","555333333");
        GirisYap("beyzasanlikun@gmail.com","123456");
    }
}
