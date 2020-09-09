package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import userinterface.PaginaElementosPage;
import util.Tiempos;

public class RegistrarUsuario implements Task {

    String[] vector=new String[16];
    Tiempos tiempoEspera;

    public RegistrarUsuario(String[] vector) {

    this.vector = vector;

    }

    public static RegistrarUsuario registrarUsuario(String[] datos) {

        return new RegistrarUsuario(datos);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue(vector[0]).into(PaginaElementosPage.name),
                    Enter.theValue(vector[1]).into(PaginaElementosPage.lastname),
                    Enter.theValue(vector[2]).into(PaginaElementosPage.addres),
                    Enter.theValue(vector[3]).into(PaginaElementosPage.email),
                    Enter.theValue(vector[4]).into(PaginaElementosPage.phone)
            );

            if(vector[5].toString().equals("Male")){
                actor.attemptsTo(Click.on(PaginaElementosPage.male));
            }else{
                actor.attemptsTo(Click.on(PaginaElementosPage.female));
            }
            if(vector[6].toString().equals(Text.of(PaginaElementosPage.crikey).viewedBy(actor).asString())){
            actor.attemptsTo(Click.on(PaginaElementosPage.click1));
              }

        if(vector[6].toString().equals(Text.of(PaginaElementosPage.movie).viewedBy(actor).asString())){
            actor.attemptsTo(Click.on(PaginaElementosPage.click2));
        }

        if(vector[6].toString().equals(Text.of(PaginaElementosPage.hockey).viewedBy(actor).asString())){
            actor.attemptsTo(Click.on(PaginaElementosPage.click3));
        }
        tiempoEspera.tiempo();
        actor.attemptsTo(Click.on(PaginaElementosPage.lenguaje));
        actor.attemptsTo(Click.on(PaginaElementosPage.lenguaje));
        actor.attemptsTo(Click.on(By.cssSelector("#basicBootstrapForm > div:nth-child(7) > div > multi-select > div:nth-child(2) > ul"), By.linkText(vector[7])));
        actor.attemptsTo(Click.on(PaginaElementosPage.lenguaje2));
        actor.attemptsTo(Click.on(PaginaElementosPage.lenguaje1));
        actor.attemptsTo(SelectFromOptions.byVisibleText(vector[8]).from(PaginaElementosPage.lenguaje1));
        actor.attemptsTo(Click.on(PaginaElementosPage.country));
        actor.attemptsTo(SelectFromOptions.byVisibleText(vector[9]).from(PaginaElementosPage.country));
        actor.attemptsTo(Click.on(PaginaElementosPage.Selectcountry));
        actor.attemptsTo(Enter.theValue(vector[10]).into(PaginaElementosPage.escribircountry));
        actor.attemptsTo( Hit.the(Keys.ENTER).keyIn(PaginaElementosPage.escribircountry));
        actor.attemptsTo(Click.on(PaginaElementosPage.year));
        actor.attemptsTo(SelectFromOptions.byVisibleText(vector[11]).from(PaginaElementosPage.year));
        actor.attemptsTo(Click.on(PaginaElementosPage.mes));
        actor.attemptsTo(SelectFromOptions.byVisibleText(vector[12]).from(PaginaElementosPage.mes));
        actor.attemptsTo(Click.on(PaginaElementosPage.dia));
        actor.attemptsTo(SelectFromOptions.byVisibleText(vector[13]).from(PaginaElementosPage.dia));
        actor.attemptsTo(Enter.theValue(vector[14]).into(PaginaElementosPage.primerpassword));
        actor.attemptsTo(Enter.theValue(vector[14]).into(PaginaElementosPage.segundopassword));
        actor.attemptsTo(Click.on(PaginaElementosPage.enviar));
        tiempoEspera.tiempo();

}
}
