import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium {

    //C:\Users\ayane\IdeaProjects\AppiumVysor2\APK\Trendyol - Online Alışveriş_7.26.1.811_APKPure.apk




    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SM S908B");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:/Users/ayane/IdeaProjects/AppiumVysor2/APK/Trendyol - Online Alışveriş_7.26.1.811_APKPure.apk");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new
                URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

    }
}


