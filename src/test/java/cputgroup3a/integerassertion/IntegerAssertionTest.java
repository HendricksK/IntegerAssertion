/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.integerassertion;

import cputgroup3a.integerassertion.configuration.AppConfig;
import org.testng.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import cputgroup3a.integerassertion.service.IntegerAssertion;
import cputgroup3a.integerassertion.service.Impl.IntegerAssertionImpl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author kurvin
 */
public class IntegerAssertionTest {
    
    public IntegerAssertionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    private static IntegerAssertion ia;
    
    @Test
    public static void testIsTrue(){
      Assert.assertEquals(ia.isTrue(15, 5), true);  
    }
    
    @Test
    public static void testCompChar(){
        Assert.assertEquals(ia.compChar('E'), 'E');
    }
    
    @Test
    public static void testCompByte(){
        //Assert.assertEquals(ia.compByte(10100110), 10100110);
    }
    
    @Test
    public static void testMuntiply(){
        Assert.assertEquals(ia.multiply(10, 20), 2000);
    }
    
    @Test
    public static void testAddLong(){
        Assert.assertEquals(ia.addLong(123123, 456456), 579579);
    }
    
    @Test
    public static void testIsTrueMessage(){
      Assert.assertEquals(ia.isTrue(12, 8), true, "Message: ");  
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ia = (IntegerAssertion) ctx.getBean("IntAssert");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
