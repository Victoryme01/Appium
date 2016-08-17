package appium.sarojsharma.kommo;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import java.net.MalformedURLException;
import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;

/**
 * Created by Sarojsharma on 05.08.2016.
 */
public class Gmail_app_automation {
    InitializeDriver init_dr;

    public Gmail_app_automation() throws MalformedURLException {
        init_dr = new InitializeDriver();

    }

    @Test

    public void click_button()throws Exception {

        MobileElement m_ele = (MobileElement)init_dr.driver.findElementById("com.google.android.gm:id/search");
        m_ele.click();
        search_text();
        search_button();

    }
    public void search_text() throws Exception {

        List<MobileElement> m_ele = (List<MobileElement>) init_dr.driver.findElementsByClassName("android.widget.LinearLayout");

        m_ele.get(1).sendKeys("saroj");


    }

    public void search_button() throws Exception {
        MobileElement m_ele = (MobileElement)init_dr.driver.findElementById("com.google.android.gm:id/compose_button");
        m_ele.click();
    }



    @After
    public void testCaseTearDown()
    {

        init_dr.driver.quit();
    }
















}
