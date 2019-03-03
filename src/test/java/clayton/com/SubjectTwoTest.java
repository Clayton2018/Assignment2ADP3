package clayton.com;

import Configuration.AppConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class SubjectTwoTest{

    private SubjectsCollectionInterface subTwo;

    @Before
    public void setUp() throws Exception {

        ApplicationContext cTX = new AnnotationConfigApplicationContext(AppConfig.class);
        subTwo = (SubjectsCollectionInterface)cTX.getBean("collections2");

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testAddToArray(){

        String subName = "Applications Development";
        String subName2 = "Multimedia";

        subTwo.addToArrayList(subName);
        subTwo.addToArrayList(subName2);

        Assert.assertEquals("Adding to list", subName, subName);
        Assert.assertEquals("Checking again", subName2, subName2);

    }

    @Test
    public void testAddToSet(){

        Double cNo1 = Double.valueOf(2.13);
        Double cNo2 = Double.valueOf(1.19);
        Double cNo3 = Double.valueOf(1.19);

        subTwo.addToSet(cNo1);
        subTwo.addToSet(cNo2);
        subTwo.addToSet(cNo3);

        Assert.assertNotSame("Class numbers are different", cNo1,cNo2);

    }

    @Test
    public void testAddToMap(){

        String key = "ADP";
        String val = "362S";

        subTwo.addToMap(key,val);

        Assert.assertNotNull("No null values", val);

    }
}
