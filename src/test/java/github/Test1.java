package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Test1 {

    @Test
    void shouldFindSelenideAsFirstRepository(){
        //открыть страницу github.com
        open("https://valetudo.ru/mma/news/olivejra-ya-leg-spat-v-vese-a-prosnulsya-tyazhelee-na-kilogramm");
        //ввести в поле поиска selenide  нажать Enter
        $("[mod-search-searchword97]").setValue("mirco").pressEnter();

        //нажимаем на линк от первого результата поиска
        //$$("ul.repo-list li").first().$("a").click();
        // check: в заголовке встречается selenide/selenide
       // $("h2").shouldHave(text("selenide / selenide"));
sleep(5000);

        //нажимаем на линк от первого результата поиска
        // check: в заголовке встречается selenide/selenide


    }






}
