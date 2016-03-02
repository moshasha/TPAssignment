package ac.za.cput;

import ac.za.cput.determineFalse.ReturnFalse;
import ac.za.cput.determineFloat.FloatingPoint;
import ac.za.cput.determineInteger.IntegerPoint;
import ac.za.cput.determineNonNull.CheckNonNull;
import ac.za.cput.determineNull.CheckIsNull;
import ac.za.cput.determineTrue.ReturnTrue;
import ac.za.cput.objectEquality.CheckObjectEquality;
import ac.za.cput.objectIdentity.CheckObjectIdentity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/02.
 */


public class ApplicationTesting {
    FloatingPoint myFloat = new FloatingPoint();
    IntegerPoint myInteger = new IntegerPoint();
    CheckObjectEquality equality1 = new CheckObjectEquality();
    CheckObjectEquality equality2 = new CheckObjectEquality();
    CheckObjectIdentity identity = new CheckObjectIdentity();
    ReturnFalse checkFalse = new ReturnFalse();
    ReturnTrue checkTrue = new ReturnTrue();
    CheckIsNull nullValue = new CheckIsNull();
    CheckNonNull notNullValue = new CheckNonNull();


    @Before
    public void setUp() throws Exception {

    }

    //Testing a float
    @Test
    public void testFloat() throws Exception{
        Assert.assertEquals(7.0, myFloat.isFloat(),.0);

    }

    //Testing integer
    @Test
    public  void testInt() throws Exception{
        Assert.assertEquals(6, myInteger.isInteger());
    }

    @Test
    public void testObjectEquality() throws Exception
    {
        Assert.assertEquals(equality1.firstObject, equality2.secondObject);
    }

    @Test
    public void testObjectIdentity() throws Exception
    {
        Assert.assertSame(identity.firstObject, identity.firstObject);
    }

    @Test
    public  void testReturnTrue() throws Exception{
        Assert.assertTrue(checkTrue.returnTrue());
    }

    @Test
    public  void testReturnFalse() throws Exception{
        Assert.assertFalse(checkFalse.returnFalse());
    }

    @Test
    public void testNull() throws Exception{
        Assert.assertNull(nullValue.checkNull());
    }

    @Test
    public void testNonNull() throws Exception{
        Assert.assertNotNull(notNullValue.returnNonNull());
    }
}
