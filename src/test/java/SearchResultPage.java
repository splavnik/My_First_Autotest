import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchResultPage {
private final ElementsCollection SearchResult = $$x("//link[@rel='prerender']");

    /**
     * Возвращает href из первого результата поиска
     */
    public String firstelement() {
    return SearchResult.first().getAttribute("href");
}
}
