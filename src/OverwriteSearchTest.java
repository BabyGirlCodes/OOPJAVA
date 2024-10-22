import static org.junit.jupiter.api.Assertions.*;

class OverwriteSearchTest {
    @org.junit.jupiter.api.Test
    void resize(){
        int [] array = {12,12,30,40,52};
        int pos = 2;
        int value = 100;
        OverwriteSearch o = new OverwriteSearch();
        int expected = 30;
        int actual = o.overWrite(array,pos,value);
        assertEquals(expected,actual);

    }

}