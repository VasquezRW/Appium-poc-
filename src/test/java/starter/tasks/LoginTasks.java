package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.homePage;
import starter.ui.loginPage;

public class LoginTasks {
    public static Task goToLogin(){
        return Task.where(
                Click.on(homePage.loginOption)
        );
    }
    public static Performable enterCredentials(String username, String password){
        return Task.where(
                SendKeys.of(username).into(loginPage.username),
                SendKeys.of(password).into(loginPage.password),
                Click.on(loginPage.loginButton)
        );
    }
}
