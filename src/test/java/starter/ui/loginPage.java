package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class loginPage {
    public static Target username = Target.the("Username").located(AppiumBy.accessibilityId("username"));
    public static Target password = Target.the("Password").located(AppiumBy.accessibilityId("password"));
    public static Target loginButton = Target.the("Login Button").located(By.xpath("//android.view.ViewGroup[@content-desc" +
            "=\"loginBtn" +
            "\"]/android.widget.TextView\n"));

}
