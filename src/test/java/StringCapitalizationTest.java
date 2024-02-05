import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.smu.mscda.Main.getCapitalize;
import static com.smu.mscda.Main.getMd5Hex;

public class StringCapitalizationTest {
    private static String INPUT = "smu";
    @Test
    public void capitalizationTest(){
        Assertions.assertEquals("Smu", getCapitalize(INPUT));
    }

    @Test
    public void md5HexTest(){
        Assertions.assertEquals("6850c0ee0db4626bbdda5660167f0d4c", getMd5Hex(getCapitalize(INPUT)));
    }
}
