import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by fatimam on 21/03/2017.
 */
public class ColourServiceImplTest {

    @Test
    public void testGetColourName() throws Exception
    {
        ColourServiceImpl colourName=new ColourServiceImpl();

        String expected="red";
        String result=colourName.getColourName("red");
        assertEquals(expected,result);

    }

    @Test
    public void testGetColourID() throws Exception
    {
        ColourInterface colourID=new ColourServiceImpl();
        int expected=1;
        int result=colourID.getColourID(1);
        assertEquals(expected,result);
    }

}