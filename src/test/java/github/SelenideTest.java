package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class SelenideTest {

    @Test
    void shouldFindSelenideAsFirstRepository(){
        //открыть страницу github.com
        open("https://github.com");
        //ввести в поле поиска selenide  нажать Enter
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();

        //нажимаем на линк от первого результата поиска
        $$("ul.repo-list li").first().$("a").click();
        // check: в заголовке встречается selenide/selenide
        $("h2").shouldHave(text("selenide / selenide"));
sleep(5000);

        //нажимаем на линк от первого результата поиска
        // check: в заголовке встречается selenide/selenide


    }






}
