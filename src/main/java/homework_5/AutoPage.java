package homework_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoPage extends BasePage {


  protected AutoPage(WebDriver driver) {
   super(driver);
  }

  // Логин
  @FindBy(xpath = "//input[@name=\"login\"]")
  private WebElement login;

  // Пароль
  @FindBy(xpath = "//input[@name=\"password\"]")
  private WebElement password;

  // "Клик"
  @FindBy (xpath = "//*[@data-testid= \"enter-password\"]")
  private WebElement submitButton;

  //Вход

  @FindBy (xpath = "//button[@data-testid=\"login-to-mail\"]")
  private WebElement openButton;

  public void login(String name, String pass){
    login.sendKeys(name);
    submitButton.click();
    password.sendKeys(pass);
    openButton.click();
  }

  @FindBy(id = "PH_logoutLink")
  private WebElement logout;


  public void logout() {
    logout.click();
    System.out.println ("Досвидули");
  }
}
