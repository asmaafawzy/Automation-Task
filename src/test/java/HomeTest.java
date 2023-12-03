import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest{
    @Test
    public void openRegisterationFormTC(){
        new HomePage(driver).closePopUp().registerAccount();

    }
}
