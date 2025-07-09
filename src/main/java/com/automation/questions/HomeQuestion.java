package com.automation.questions;

import com.automation.userinterfaces.HomeScreen;
import net.serenitybdd.screenplay.Question;

public class HomeQuestion {

    public static Question<Boolean> visibleTitlePopup(){
        return actor -> HomeScreen.TITLE_POPUP_HOME.resolveFor(actor).isVisible();
    }

}
