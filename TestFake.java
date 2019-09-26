import org.junit.*;

public class TestFake{
    @Test
    public void Test1(){
        for(int i = 0; i < 5; i++){
            Assert.assertTrue(true);
        }
    }
    
    @Test
    public void Test2(){
        for(int i = 0; i < 5; i++){
            Assert.assertFalse(true);
        }
        Test1();
    }
}
