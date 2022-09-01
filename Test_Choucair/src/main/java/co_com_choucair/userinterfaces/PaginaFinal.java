package co_com_choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFinal {
    public static final Target PASSWORD = Target.the("Campo para contrasena")
            .located(By.id("password"));
    public static final Target CONFIRMAR_PASSWORD = Target.the("Campo para confirmar contrasena")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAY_INFO = Target.the("Checbox de que estoy informado")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK_I_HAVE = Target.the("Checbox de acepto las guias de utest")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_I_READ = Target.the("Checbox de que lei terminos de privacidad")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_SETUP = Target.the("Boton para modulo de dispositivos")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
