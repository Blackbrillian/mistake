import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.MovieManager;

public class MovieManagerTest {


    @Test
    public void test1() {
        MovieManager manager = new MovieManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");

        String[] actual = manager.findAll();
        String[] expected = new String[]{"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void test2() {
        MovieManager manager = new MovieManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        Assertions.assertArrayEquals(actual, expected);

    }

}