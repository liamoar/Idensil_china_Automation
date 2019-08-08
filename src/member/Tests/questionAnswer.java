package member.Tests;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.util.SystemOutLogger;
import org.eclipse.jetty.websocket.client.masks.RandomMasker;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Random;

public class questionAnswer extends Setup {

    @Test
    public void CheckQuestion() throws InterruptedException {
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        int i = (int) js.executeScript("$(\"input[id^='customRadioInline']\").prop(\"checked\",\"checked\");");
        System.out.println(i);
        js.executeScript("" +
                "" +
                "");

    }
}
