import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTest extends BaseTest {
    @Test
    public void testLoginWithInvalidData() throws InterruptedException {
        Page page = new Page(driver);
        page.getUrl().clickEnterBtn().inputEmail("test@test.com").inputPassword("john345nyTest").buttonSubmit();
        String actual = page.getErrorMessage();
        System.out.println("actual: " +actual);
        Assert.assertEquals(actual, "Неверно указан E-mail или пароль");

    }
}
