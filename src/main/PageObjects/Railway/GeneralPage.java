package Railway;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Constant.Constant;
public class GeneralPage {
    //Locators
    private final By tabLogin = By.xpath("//div[@id='menu']//a[@href='/Account/Login.cshtml']");
    private final By tabRegister = By.xpath("//div[@id='menu']//a[@href='/Account/Register.cshtml']");
    private final By tabLogout = By.xpath("//div[@id='menu']//a[@href='/Account/Logout']");
    private final By lblWelcomeMessage = By.xpath("//div[@class='account']/strong");

    //Elements
    protected WebElement getTabLogin() {
        return Constant.WebDriver.findElement(tabLogin);
    }
    protected WebElement getTabRegister() {
        return Constant.WebDriver.findElement(tabRegister);
    }
    protected WebElement getTabLogout() {
        return Constant.WebDriver.findElement(tabLogout);
    }
    protected WebElement getLblWelcomeMessage() {
        return Constant.WebDriver.findElement(lblWelcomeMessage);
    }

    //Methods
    public String getWelcomeMessage()
    {
        return this.getLblWelcomeMessage().getText();
    }
    public LoginPage gotoLoginPage()
    {
        this.getTabLogin().click();
        return new LoginPage();
    }
    public RegisterPage gotoRegisterPage()
    {
        this.getTabRegister().click();
        return new RegisterPage();
    }
}
