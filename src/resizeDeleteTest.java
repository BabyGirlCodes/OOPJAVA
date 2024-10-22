import static org.junit.jupiter.api.Assertions.*;

class resizeDeleteTest {
    @org.junit.jupiter.api.Test
    void resize(){
        int [] array = {12,12,30,40,52};
        int pos = 3;
        int value = 100;
        resizeDelete r = new resizeDelete();
        int [] expected = {12,20,30,100,40,52};
        int [] actual = r.resize(array,pos,value);
        assertEquals(expected,actual);

    }

}