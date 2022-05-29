import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private List<String> input;
    private List<String> output;
    @Test
    void EveryStatement() {
        IllegalArgumentException ex;
        input = Arrays.asList();
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(input));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        input = Arrays.asList("0", "0", "#", "0", "#");
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(input));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        input = Arrays.asList("#", "0", "#", "0", "#", "#", "0", "#", "0");
        output = Arrays.asList("#", "3", "#", "2", "#", "#", "1", "#", "2");
        assertEquals(output, SILab2.function(input));
    }

    @Test
    void EveryBranch() {
        IllegalArgumentException ex;
        input = Arrays.asList();
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(input));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        input = Arrays.asList("0", "0", "#", "0", "#");
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(input));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        input = Arrays.asList("#", "0", "#", "0", "#", "#", "0", "#", "0");
        output = Arrays.asList("#", "3", "#", "2", "#", "#", "1", "#", "2");
        assertEquals(output, SILab2.function(input));

        input = Arrays.asList("0", "0", "0", "0", "0", "0", "0", "0", "0");
        output = Arrays.asList("0", "0", "0", "0", "0", "0", "0", "0", "0");
        assertEquals(output, SILab2.function(input));

    }
}