Feature: Ingresar al sitio web y registrarse despues verificar el registro exitoso


  @caso1
 Scenario:Ingresar a la Página automarizacion y registrarse y por ultimo verificar registro
    Given Ingresar a la Página Automation Demo Site
    When  Diligencie todos los campos para el registro en la pantalla.
      |name    |last name   |addres  | E-mail                     | phone             | Genero      |  Hobbies  | Languages   | skills  |   country   | Select country | ano   | mes    |  dia1  | password | confirmar Password |
      |jairo   | henao      |calle 45|henaoarbelaezjairo@gmail.com|3013996019         |Male         |Hockey     |Arabic       |  Android| Colombia    |Japan           |1916   |December| 30     |Pjairo123 |Pjairo123           |
    Then  Una vez finalizado el registro, este lo llevará a la pestaña WEBTABLE donde verificará algún componente de la misma con lo cual estará seguro de que se registró correctamente "- Double Click on Edit Icon to EDIT the Table Row."


