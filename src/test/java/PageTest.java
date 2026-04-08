import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTest extends BaseTest {
    @Test
    public void testLoginWithInvalidData(){
        Page page = new Page(driver);
        page.getUrl().clickEnterBtn().inputEmail("test@test.com").inputPassword("johnnyTest").buttonSubmit();
        Assert.assertEquals(page.getErrorMessage(), "Неверно указан E-mail или пароль");

    }
}
