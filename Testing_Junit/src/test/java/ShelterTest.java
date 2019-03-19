import org.junit.Test;

import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.*;
import java.util.*;

public class ShelterTest {

    @Test
    public void setPet() {
        List<Animals> actual = new ArrayList<>();
        Dogs Grom = new Dogs("Гром", "серый", "кобель", 8);
        actual.add(Grom);
        assertThat(actual, hasItem(Grom));
    }

    @Test
    public void petsInShelter() {
    }

    @Test
    public void getRandomPet() {

    }

    @Test
    public void main() {
    }
}