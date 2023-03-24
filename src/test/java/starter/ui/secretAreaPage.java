package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class secretAreaPage {
    public static Target loginText = Target.the("Login option").located(By.xpath("//android.widget.TextView[contains(@text,'You are logged in as alice')]"));
}
