package userinterface;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaElementosPage extends PageObject {

    public static final net.serenitybdd.screenplay.targets.Target name= Target.the("el nombre").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input"));
    public static final net.serenitybdd.screenplay.targets.Target lastname= Target.the("el apellido").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[2]/input"));
    public static final net.serenitybdd.screenplay.targets.Target addres= Target.the("la direccion").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[2]/div/textarea"));
    public static final net.serenitybdd.screenplay.targets.Target email= Target.the("correo electronico").located(By.xpath("//*[@id=\'eid\']/input"));
    public static final net.serenitybdd.screenplay.targets.Target phone= Target.the("celular").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[4]/div/input"));
    public static final net.serenitybdd.screenplay.targets.Target male= Target.the("Hombre").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[5]/div/label[1]/input"));
    public static final net.serenitybdd.screenplay.targets.Target female= Target.the("Mujer").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[5]/div/label[2]/input"));
    public static final net.serenitybdd.screenplay.targets.Target crikey= Target.the("crykey").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[6]/div/div[1]/label"));
    public static final net.serenitybdd.screenplay.targets.Target movie= Target.the("movie").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[6]/div/div[2]/label"));
    public static final net.serenitybdd.screenplay.targets.Target hockey= Target.the("hockey").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[6]/div/div[3]/label"));
    public static final net.serenitybdd.screenplay.targets.Target click1= Target.the("click en  crikey").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[6]/div/div[1]/input"));
    public static final net.serenitybdd.screenplay.targets.Target click2= Target.the("click en movies").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[6]/div/div[2]/input"));
    public static final net.serenitybdd.screenplay.targets.Target click3= Target.the("click en hockey").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[6]/div/div[3]/input"));
    public static final net.serenitybdd.screenplay.targets.Target lenguaje= Target.the("click en lenguaje").located(By.id("msdd"));
    public static final net.serenitybdd.screenplay.targets.Target lenguaje1= Target.the("click en Skills").located(By.id("Skills"));
    public static final net.serenitybdd.screenplay.targets.Target lenguaje2= Target.the("click en afuera").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[7]/label"));
    public static final net.serenitybdd.screenplay.targets.Target country= Target.the("click en ciudad").located(By.xpath("//*[@id=\'countries\']"));
    public static final net.serenitybdd.screenplay.targets.Target Selectcountry= Target.the("click en selecionar ciudad").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[10]/div/span/span[1]/span"));
    public static final net.serenitybdd.screenplay.targets.Target escribircountry= Target.the("escribir ciudad").located(By.xpath("/html/body/span/span/span[1]/input"));
    public static final net.serenitybdd.screenplay.targets.Target year= Target.the("click en ano").located(By.id("yearbox"));
    public static final net.serenitybdd.screenplay.targets.Target mes= Target.the("click en mes").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
    public static final net.serenitybdd.screenplay.targets.Target dia= Target.the("click en dia").located(By.id("daybox"));
    public static final net.serenitybdd.screenplay.targets.Target primerpassword= Target.the("escribir en primer password").located(By.id("firstpassword"));
    public static final net.serenitybdd.screenplay.targets.Target segundopassword= Target.the("escribir en segundo password").located(By.id("secondpassword"));
    public static final net.serenitybdd.screenplay.targets.Target enviar= Target.the("click en enviar").located(By.id("submitbtn"));
    public static final net.serenitybdd.screenplay.targets.Target verificacion= Target.the("click en verificacion").located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));



}
