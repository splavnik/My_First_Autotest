import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchResultPage {
    /**
     * Создаем коллекцию из всех ссылок на странице с результатами поиска
     */
private final ElementsCollection SearchResult = $$x("//a[@href][@data-ved][@ping]");

    /**
     * Возвращает href из первого результата поиска
     */
    public String firstelement() {
    return SearchResult.first().getAttribute("href");
}
}
