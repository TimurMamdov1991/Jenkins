package homework_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

  protected WebDriver driver;
  protected WebDriverWait wait;

  public BasePage(WebDriver driver) {
    PageFactory.initElements(driver, this);
    this.driver = driver;
    this.wait = new WebDriverWait(driver, 10);
  }

}
