import org.junit.*;

public class TestFake{
    @Test
    public void Test1(){
        Assert.assertTrue(true);
        Assert.assertTrue(true);
        Assert.assertFalse(true);
        Assert.assertTrue("dam",true);
        Assert.assertEquals(1,1);
        Assert.assertEquals("ab","ab");

        Assert.assertEquals("a","ab","ab");

        Assert.assertNotEquals("ab","ab");
        Assert.assertEquals((float)1.2,(float)1.2);
        Assert.assertEquals((double)1.2,(double)1.2);

        Assert.assertNotEquals((float)1.2,(float)1.2);
        Assert.assertNotEquals((double)1.2,(double)1.2);
        
        Assert.assertNull(null);
        Assert.assertNotNull(null);
        Object o = new Object();
        Assert.assertSame(o,o);
        Assert.assertNotSame(o,o);
        Assert.assertEquals(o,o);
        Assert.assertNotEquals(o,o);
        int[] a = {1,2};
        Assert.assertArrayEquals(a,a);
        String[] s = {"",""};

        
        Assert.assertArrayEquals(s,s);
        //Assert.assertArrayEquals(o,o);
        Assert.assertThat("a",o,null);
    }
    
    @Test
    public void Test2(){
        Assert.assertTrue(true);
        Assert.assertTrue(true);
        Assert.assertFalse(true);
        Assert.assertTrue("dam",true);
        Assert.assertEquals(1,1);
        Assert.assertEquals("ab","ab");

        Assert.assertEquals("a","ab","ab");

        Assert.assertNotEquals("ab","ab");
        Assert.assertEquals((float)1.2,(float)1.2);
        Assert.assertEquals((double)1.2,(double)1.2);

        Assert.assertNotEquals((float)1.2,(float)1.2);
        Assert.assertNotEquals((double)1.2,(double)1.2);
        
        Assert.assertNull(null);
        Assert.assertNotNull(null);
        Object o = new Object();
        Assert.assertSame(o,o);
        Assert.assertNotSame(o,o);
        Assert.assertEquals(o,o);
        Assert.assertNotEquals(o,o);
        int[] a = {1,2};
        Assert.assertArrayEquals(a,a);
        String[] s = {"",""};

        Assert.assertArrayEquals(s,s);
        //Assert.assertArrayEquals(o,o);
        Assert.assertThat("a",o,null);
    }
}
