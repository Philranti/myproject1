package ac.za.cput.project;

import static org.junit.Assert.assertTrue;

import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    App app;

    @Before
    public void setUp(){
        app = new App();

    }

    @Test
    public void getMap(){
        Map map = app.getMap();
        Assert.assertEquals(app.getMap(), map);
    }

    @Test
    public void getCollection(){
        Collection collect = app.getCollection();
        Assert.assertEquals(app.getCollection(), collect);
    }

    @Test
    public void getString(){
        Set st = app.getString();
        Assert.assertEquals(app.getString(), st);
    }

    @Test
    public void getList(){
        List list = app.getList();
        Assert.assertEquals(app.getList(), list);
    }

}
