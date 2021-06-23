package homework_5.Test;

import homework_5.TestBase;
import org.testng.annotations.Test;

public class TestLogin extends TestBase {


  @Test
  public void testLogin() {
    // Авторизация
    autoPage.login (MAIL_LOGIN, MAIL_PASSWORD);
  }
}