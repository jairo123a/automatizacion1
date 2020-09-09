package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.AbrirPage;

public class AbrirPagina implements Task {
    AbrirPage abrirPage;

   public static tasks.AbrirPagina abrirPagina() {

       return Tasks.instrumented(tasks.AbrirPagina.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(abrirPage));
    }
}
