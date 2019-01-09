package com.ntuc.income;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleTest {

    @Step("Navigate to <https://www.google.co.in>")
    public void navigateTo(String url) throws InterruptedException {
        Driver.webDriver.get(url);
        Thread.sleep(2000);
    }

    @Step("Enter query <query> in the search box and submit")
    public void enterQuery(String query) throws InterruptedException {
        WebElement searchBox = Driver.webDriver.findElement(By.name("q"));
        searchBox.sendKeys(query);
        searchBox.submit();
        Thread.sleep(2000);
    }

    @Step("The knowledge graph box should show <query> as result")
    public void verifySearchResult(String resultString) {
        WebElement result = Driver.webDriver.findElement(By.xpath("//div[@class='dDoNo gsrt']/span"));
        result.equals("");
    }
}
