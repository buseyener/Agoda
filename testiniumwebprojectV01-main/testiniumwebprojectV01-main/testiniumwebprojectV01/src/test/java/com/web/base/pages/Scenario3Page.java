package com.web.base.pages;

import com.web.base.pageElement.PageElementModel;
import com.web.base.pageElement.TestiniumButton;
import com.web.base.pageElement.TestiniumLabel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Scenario3Page {
    private static final Log log = LogFactory.getLog(ExamplePage.class);
    private static ExamplePage instance;

    private static TestiniumLabel Label_Destination = new TestiniumLabel(PageElementModel.selectorNames.ID, "textInput");
    private static TestiniumButton BTN_EnterDate = new TestiniumButton(PageElementModel.selectorNames.ID, "check-in-box");
    private static TestiniumButton BTN_ExitDate = new TestiniumButton(PageElementModel.selectorNames.ID, "check-out-box");

    public static synchronized ExamplePage getInstance() {
        if (instance == null)
            instance = new ExamplePage();
        return instance;
    }

    public static void mainPage() throws InterruptedException {
        //Destination gir
        Label_Destination.setLabelText("Antalya");
        //Date gir
        BTN_EnterDate.click();
        Thread.sleep(10000);
        //Ara butonuna tıkla
    }


}