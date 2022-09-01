package co_com_choucair.userinterfaces;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class UtestPage extends PageObject {

    public static final Target JOIN = Target.the("boton para comenzar logueo")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
