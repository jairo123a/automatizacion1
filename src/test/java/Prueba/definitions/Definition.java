package Prueba.definitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Pregunta;
import tasks.AbrirPagina;
import tasks.RegistrarUsuario;

import java.util.List;

public class Definition {

  @Before

   public void setStage(){

      OnStage.setTheStage(new OnlineCast());

   }

    @Given("^Ingresar a la Página Automation Demo Site$")
    public void ingresarALaPáginaAutomationDemoSite() {

        OnStage.theActorCalled("jairo").wasAbleTo(AbrirPagina.abrirPagina());
    }

    @When("^Diligencie todos los campos para el registro en la pantalla\\.$")
    public void diligencieTodosLosCamposParaElRegistroEnLaPantalla(DataTable arg1) {
        List<List<String>> lista=arg1.raw();
        String vector[]=new String[16];
        for(int j=0;j<16;j++){
            vector[j]=lista.get(1).get(j).trim();



        }

        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarUsuario.registrarUsuario(vector));
    }


    @Then("^Una vez finalizado el registro, este lo llevará a la pestaña WEBTABLE donde verificará algún componente de la misma con lo cual estará seguro de que se registró correctamente \"([^\"]*)\"$")
    public void unaVezFinalizadoElRegistroEsteLoLlevaráALaPestañaWEBTABLEDondeVerificaráAlgúnComponenteDeLaMismaConLoCualEstaráSeguroDeQueSeRegistróCorrectamente(String arg1) {

      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Pregunta.responderPregunta(arg1)));
    }



}
