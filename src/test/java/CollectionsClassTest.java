import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by fatimam on 21/03/2017.
 */
public class CollectionsClassTest {
    @Test
    public void testListColors() throws Exception {
        CollectionsClass obj=new CollectionsClass();

        String expected="Blue";

       String results=obj.listColors();
        Assert.assertEquals(expected,results);
    }

    @Test
    public void testHashSetColors() throws Exception
    {
        CollectionsClass obj=new CollectionsClass();

        boolean results=obj.hashSetColors();
        Assert.assertTrue(results);

    }

  /*  @Test
    public void testMapColors() throws Exception {

    }*/

    @Test
    public void testMapColorID() throws Exception
    {
        CollectionsClass obj=new CollectionsClass();

        String expected="green";

        String results=obj.mapColorID();
        Assert.assertEquals(expected,results);

    }

}