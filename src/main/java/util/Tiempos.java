package util;

import net.thucydides.core.pages.PageObject;

public class Tiempos extends PageObject {

    public void tiempo(){

        waitFor(2).second();

    }
}
