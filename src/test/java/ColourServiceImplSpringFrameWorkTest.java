import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by fatimam on 21/03/2017.
 */
public class ColourServiceImplSpringFrameWorkTest {
    private ColourInterface colourNameAndID;

    @BeforeMethod
    public void setup() throws Exception{
        ApplicationContext actx = new AnnotationConfigApplicationContext(AppConfig.class);
        colourNameAndID=(ColourInterface)actx.getBean("colourNameAndID");
    }
    @AfterMethod
    public void tearDown() throws Exception{}

    @Test
    public void testGetColourName() throws Exception
    {
        String expected="red";
        String result=colourNameAndID.getColourName("red");
        assertEquals(expected,result);

    }

    @Test
    public void testGetColourID() throws Exception
    {
        int expected=1;
        int result=colourNameAndID.getColourID(1);
        assertEquals(expected,result);
    }

}