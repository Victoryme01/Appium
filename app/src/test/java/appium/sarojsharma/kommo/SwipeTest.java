package appium.sarojsharma.kommo;



import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import java.net.MalformedURLException;

public  class SwipeTest {
    InitializeDriver init_dr;
    Dimension size;
    //initialize

    public SwipeTest() throws MalformedURLException {
        init_dr = new InitializeDriver();
        size=init_dr.driver.manage().window().getSize();
    }

        @Test
        public void Image_button()throws Exception{
            init_dr.driver.findElementByClassName("android.widget.ImageButton").click();
            swipe_Vertical();
            swipe_horizontal();

        }


//for swiping vertical

    public void swipe_Vertical() throws InterruptedException {
        System.out.println(size);
        int starty = (int) (size.height * 0.50);
        int endy = (int) (size.height * 0.90);
        int startx = size.width / 2;
        init_dr.driver.swipe(startx, starty, startx, endy, 500);
        Thread.sleep(1000);
        init_dr.driver.swipe(startx, endy, startx, starty, 3000);

    }

    public void swipe_horizontal()
    {
        size=init_dr.driver.manage().window().getSize();
        int start_x = (int) (size.width * 0.90);
        int end_x = (int) (size.width * 0.90);
        int start_y = size.height / 2;
        //right ro left
        init_dr.driver.swipe(start_x, start_y, end_x, start_y, 500);
        /*
        //swipe from left to right
        init_dr.driver.swipe(end_x, start_y, start_x, start_y, 500);
        */
        }

    @After
    public void testCaseTearDown()
    {
        init_dr.driver.quit();
    }

    }
