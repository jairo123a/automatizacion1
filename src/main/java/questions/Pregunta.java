package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.PaginaElementosPage;

public class Pregunta implements Question<Boolean> {
    String verificacion;

    public Pregunta(String verificacion) {
        this.verificacion = verificacion;

    }

    public static Pregunta responderPregunta(String consulta) {

        return new Pregunta(consulta);

    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String texto;
        Boolean resultado;
        texto = Text.of(PaginaElementosPage.verificacion).viewedBy(actor).asString();
        System.out.println(texto);
        if (texto.equals(verificacion)) {
            resultado = true;

        } else {

            resultado = false;

        }
        return resultado;


    }

}