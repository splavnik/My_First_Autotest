import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Строка поиска на сайте google.com
 */
public class SearchInput {
private final SelenideElement input = $x("//input[@aria-label='Найти']");

public SearchInput(String url) {
    Selenide.open(url);
}

    /**
     * Вводим в поле поиска значение из keyword и нажимаем на кнопку Enter
     * @param keyword инпут строки поиска
     */
    public void Search(String keyword) {
    input.setValue(keyword);
    input.sendKeys(Keys.ENTER);
}
}
