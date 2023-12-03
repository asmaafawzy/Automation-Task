import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.Utilities;

public class RegisterTest extends BaseTest{
    @Test
    public void fillRegisterationFormTC(){
        new HomePage(driver).closePopUp().registerAccount()
                .enterMobileNumber(Utilities.getJsonData("registerationData", "MobileNumber")+ Faker.instance().phoneNumber().subscriberNumber(8))
                .clickfirstbtn()
                .enterPassword(Utilities.getJsonData("registerationData", "Password"))
                .enterConfirmPassword(Utilities.getJsonData("registerationData", "ConfirmPassword"))
                .clicksecondbtn()
                .enterFirstName(Utilities.getJsonData("registerationData", "FirstName"))
                .enterLastName(Utilities.getJsonData("registerationData", "LastName"))
                .enterEmail(Utilities.getJsonData("registerationData", "Email")+Utilities.getTimestamp()+"@gmail.com")
                .clickthirdbtn()
                .selectGender()
                .enterdatebirth(Utilities.getJsonData("registerationData", "DateBirth"))
                .clickCheckbox()
                .clickfourthbtn();
    }
}
