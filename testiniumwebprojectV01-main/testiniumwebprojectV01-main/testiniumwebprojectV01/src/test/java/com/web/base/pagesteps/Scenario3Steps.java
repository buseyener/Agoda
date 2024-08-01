package com.web.base.pagesteps;

import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;
import com.web.base.pages.ExamplePage;
import com.web.base.pages.Scenario3Page;

public class Scenario3Steps extends BaseSteps {

    @ContinueOnFailure({AssertionError.class})
    @Step("mainPage")
    public void mainPage() throws InterruptedException {
        Scenario3Page.mainPage();
    }
}