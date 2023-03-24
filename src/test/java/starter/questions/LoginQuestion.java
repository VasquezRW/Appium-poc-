package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.ui.secretAreaPage;

public class LoginQuestion implements Question<Boolean> {
    private final String validtext;
    public LoginQuestion(String validtext){
        this.validtext = validtext;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(secretAreaPage.loginText).answeredBy(actor).equals(validtext);
    }
    public static LoginQuestion checkLogin(String validtext){
        return new LoginQuestion(validtext);
    }
}