package clayton.com;

import Configuration.AppConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SubjectOneTest {

    private SubjectsCollectionInterface subOne;

    @Before
    public void setUp() throws Exception {

        ApplicationContext cTX = new AnnotationConfigApplicationContext(AppConfig.class);
        subOne = (SubjectsCollectionInterface)cTX.getBean("collections1");

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testAddToArray(){

        String subName = "Applications Development";
        String subName2 = "Multimedia";

        subOne.addToArrayList(subName);
        subOne.addToArrayList(subName2);

        Assert.assertEquals("Adding to list", subName, subName);
        Assert.assertEquals("Adding more to list", subName2, subName2);

    }

    @Test
    public void testAddToSet(){

        Double cNo1 = Double.valueOf(2.13);
        Double cNo2 = Double.valueOf(1.19);
        Double cNo3 = Double.valueOf(1.19);

        subOne.addToSet(cNo1);
        subOne.addToSet(cNo2);
        subOne.addToSet(cNo3);

        Assert.assertNotSame("Class numbers are different", cNo1,cNo2);

    }

    @Test
    public void testAddToMap(){

        String key = "ADP";
        String val = "362S";

        subOne.addToMap(key,val);

        Assert.assertNotNull("No null values", val);

    }

}

