package com.ashivrina.tests;

import com.ashivrina.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @DisplayName("Check https://www.thesoul-publishing.com/ main page")
    void mainPageTest() {
        step("Open https://www.thesoul-publishing.com/", () -> {
            open("https://www.thesoul-publishing.com/");
        });
        step("Check the header text", () -> {
            $("h1").shouldHave(text("TheSoul Publishing"));
        });
        step("Check the subheader text", () -> {
            $("h5").shouldHave(text("An award-winning digital studio that produces entertaining, " +
                    "positive and original content for a global audience."));
        });
        step("Check that 'About' button is displayed", () -> {
            $("#comp-knyimrdc").shouldHave(text("About TheSoul Publishing"));
        });
    }

    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.thesoul-publishing.com/'", () ->
            open("https://www.thesoul-publishing.com/"));

        step("Page title should have text 'TheSoul Publishing'", () -> {
            String expectedTitle = "TheSoul Publishing";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.thesoul-publishing.com/'", () ->
            open("https://www.thesoul-publishing.com/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}