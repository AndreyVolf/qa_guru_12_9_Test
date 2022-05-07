package github;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Test {

    @org.junit.jupiter.api.Test
    void shouldFindSelenideAsFirstRepository(){
        //открыть страницу github.com
        open("https://xn--80adjzclooe.xn--p1ai/");
        //ввести в поле поиска selenide  нажать Enter
       $("[lb-form-control]").setValue("selenide").pressEnter();
        //$("[popup-form]").hover().click();
        //нажимаем на линк от первого результата поиска

        // check: в заголовке встречается selenide/selenide
       // $("button-11 widget-7 widget-type-button editorElement layer-type-widget").shouldHave(text("Заказать звонок")).hover().click();
sleep(5000);

        //нажимаем на линк от первого результата поиска
        // check: в заголовке встречается selenide/selenide


    }






}
