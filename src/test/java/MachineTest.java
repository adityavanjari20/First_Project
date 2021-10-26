import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class MachineTest {
    List list = Arrays.asList("ballendmill", "keywaycutter", "slotdrill", "facemill", "Hammer");
    Scanner SIndex = new Scanner(System.in);

    @Test
    public void targetIndexGretterThanStartIndex() {


        int min = Machine.findTool(list, 1, "ballendmill");
        System.out.println("The minimum number of moves is " + min);
        assertEquals(1, min);

    }

    @Test
    public void targetIndexSmallerThanStartIndex() {

        int min = Machine.findTool(list, 1, "Hammer");
        System.out.println("The minimum number of moves is " + min);
        assertEquals(2, min);

    }

}