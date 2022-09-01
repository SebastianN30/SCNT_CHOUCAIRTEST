package co_com_choucair.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaInfoPersona {

    public static final Target NOMBRE = Target.the("Nombre de Usuario")
            .located(By.id("firstName"));
    public static final Target APELLDO = Target.the("Nombre de Usuario")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Nombre de Usuario")
            .located(By.id("email"));
    public static final Target MES_NACIMIENTO = Target.the("Nombre de Usuario")
            .located(By.id("birthMonth"));
    public static final Target DIA_NACIMIENTO = Target.the("Nombre de Usuario")
            .located(By.id("birthDay"));
    public static final Target ANO_NACIMIENTO = Target.the("Nombre de Usuario")
            .located(By.id("birthYear"));
    public static final Target BOTON_SEGUIR = Target.the("Nombre de Usuario")
            .located(By.xpath("//a[class='btn btn-blue']"));
}
