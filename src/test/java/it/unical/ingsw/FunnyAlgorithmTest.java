package it.unical.ingsw;
import org.junit.Rule;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FunnyAlgorithmTest {
    private static final FunnyAlgorithm funnyAlgorithm = new FunnyAlgorithm();
    @Test
    public void testFindIndex() { // In questo test si verifica che il metodo findIndex funzioni correttamente
        List<Integer> list = new ArrayList<>(); // Creo una lista di interi
        list.add(2);
        list.add(3);
        list.add(-7);
        assertEquals(0, funnyAlgorithm.findIndex(list, 2));
        assertEquals(1, funnyAlgorithm.findIndex(list, 3));
        assertEquals(-1, funnyAlgorithm.findIndex(list, -7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindIndexNull() {
        funnyAlgorithm.findIndex(null, 2);
    }

    @Test
    public void testFindIndexNotFound() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(-7);
        assertEquals(-1, funnyAlgorithm.findIndex(list, 5));
    }
}
