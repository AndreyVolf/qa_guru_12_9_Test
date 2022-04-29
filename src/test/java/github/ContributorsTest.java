package github;


import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ContributorsTest {

     @Test
    void solntsevShouldBeFirstContributor(){

         open("https://github.com/selenide/selenide");
         $(".Layout-sidebar").$(byText("Contributors")).ancestor("div")
                 .$("ul li").hover();
sleep(5000);
    }


}
