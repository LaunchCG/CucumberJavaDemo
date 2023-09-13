package CucumberJavaDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaunchCareerPage {
    @FindBy(xpath = "//*[@id=\"keywords\"]")
    public WebElement keywordInputBox;

    @FindBy(xpath = "//*[@id=\"location-quicksearch\"]")
    public WebElement locationInputBox;
    @FindBy(xpath = "//*[@id=\"searchFormButton\"]")
    public  WebElement applyFiltersButton;
    @FindBy(xpath = "//*[@id=\"jb-search-results-inner\"]")
    public  WebElement jobSearchResults;

    public void searchKeyword (String keyword) {
        keywordInputBox.sendKeys(keyword);
        locationInputBox.clear();
        applyFiltersButton.click();
        keywordInputBox.clear();
        locationInputBox.clear();
        keywordInputBox.sendKeys(keyword);
        applyFiltersButton.click();

    }

}
