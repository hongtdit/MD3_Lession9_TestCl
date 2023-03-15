import java10tdh.Bt2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Bt2Test {
    @Test
    public  void testTamgiacdeu(){
String expected ="Đây là tam giác đều";
String result = Bt2.Tamgiac(2,3,2);
        assertEquals(expected,result);
    }
}
