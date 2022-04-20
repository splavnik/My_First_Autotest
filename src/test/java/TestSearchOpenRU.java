import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchOpenRU extends BaseTest {
    private final static String HomeURL = "https://google.com";
    private final static String keyword = "open.ru";

    @Test
    public void checkSearch() {
        SearchInput SearhInput = new SearchInput(HomeURL);
        SearhInput.Search(keyword);
        SearchResultPage SearchResultPage = new SearchResultPage();
        String href = SearchResultPage.firstelement();
        Assert.assertTrue(href.contentEquals("https://www.open.ru/"));
    }
}
