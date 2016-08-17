package appium.sarojsharma.kommo;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Created by Sarojsharma on 04.08.2016.
 */
public class InitializeDriver  {
    AndroidDriver driver;
    public InitializeDriver() throws MalformedURLException
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.VERSION, "6.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto");
        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.google.android.gm");
        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, ".ConversationListActivityGmail");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
