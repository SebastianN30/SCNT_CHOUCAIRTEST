package co_com_choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDireccion {
    public static final Target CIUDAD = Target.the("Campo para ciudad")
            .located(By.id("city"));
    public static final Target CODIGO_POSTAL = Target.the("Campo para codigo postal")
            .located(By.id("zip"));
    public static final Target CONTENEDOR_PAIS = Target.the("Campo para contenedor de pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target PAIS = Target.the("Campo para pais de usuario")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BOTON_SEGUIR_DIS = Target.the("Boton para modulo de dispositivos")
            .located(By.xpath("//a[class='btn btn-blue pull-right']"));
}
