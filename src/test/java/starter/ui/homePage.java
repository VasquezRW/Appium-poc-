package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class homePage {
    public static Target loginOption = Target.the("Login option").located(By.xpath("//android.view.ViewGroup[@content-desc" +
            "=\"Login" +
            " " +
            "Screen\"]\n"));
}
