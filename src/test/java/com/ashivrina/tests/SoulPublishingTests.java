package com.ashivrina.tests;

import com.ashivrina.JiraIssue;
import com.ashivrina.helpers.DriverUtils;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

@JiraIssue("HOMEWORK-270")
public class SoulPublishingTests extends TestBase {
    @BeforeEach
    void prepare() {
        step("Open https://www.thesoul-publishing.com/", () -> {
            open("https://www.thesoul-publishing.com/");
        });
    }

    @Test
    @DisplayName("Check https://www.thesoul-publishing.com/ main page")
    void mainPageTest() {
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
    @DisplayName("Check that 'About TheSoul Publishing' button opens correct URL")
    void checkAboutButton() {
        step("Click the 'About' button", () -> {
            $("#comp-knyimrdc").click();
        });
        step("Check that URL is https://www.thesoul-publishing.com/about", () -> {
            String expectedUrl = "https://www.thesoul-publishing.com/about";
            String actualUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
            assertThat(actualUrl).isEqualTo(expectedUrl);
        });
    }

    @Test
    @DisplayName("Check the 'Advertise' page")
    void checkAdvertisePage() {
        step("Click the 'Advertise' button", () -> {
            $(byText("Advertise")).click();
        });
        step("Check that URL is https://www.thesoul-publishing.com/advertise", () -> {
            String expectedUrl = "https://www.thesoul-publishing.com/advertise";
            String actualUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
            assertThat(actualUrl).isEqualTo(expectedUrl);
        });
        step("Check the header text", () -> {
            $("h1").shouldHave(text("Advertise with us!"));
        });
        step("Check the subheader text", () -> {
            $("h5").shouldHave(text("Advertise with TheSoul Publishing to elevate your brand. Exceed your " +
                    "marketing objectives and engage with your brand’s ideal consumers through TheSoul Publishing’s " +
                    "powerful brand partnerships program."));
        });
    }

    @Test
    @DisplayName("Check social media icons")
    void checkSocialMediaIcons() {
        step("Check that the Facebook icon is displayed", () -> {
            $("[alt='TheSoul Publishing Facebook']").shouldBe(visible);
        });
        step("Check that the LinkedIn icon is displayed", () -> {
            $("[alt='TheSoul Publishing LinkedIn']").shouldBe(visible);
        });
        step("Check that the Instagram icon is displayed", () -> {
            $("[alt='Instagram']").shouldBe(visible);
        });
    }

    @Test
    @DisplayName("Check that 'Career' button opens the URL")
    void checkCareerButton() {
        step("Check the 'Career' button's URL", () -> {
            String actualUrl =$(byText("Career")).closest("a").getAttribute("href");
            String expectedUrl = "https://www.careers.thesoul-publishing.com/";
            assertThat(actualUrl).isEqualTo(expectedUrl);
        });
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}