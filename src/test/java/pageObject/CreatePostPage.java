package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePostPage {
    WebDriver driver;

    @FindBy(xpath = "//button[contains(text(),'Start Writing 🚀')]")
    WebElement clickstart;
    
    @FindBy(xpath = "//input[@placeholder='Title']")
    WebElement titleInput;

    @FindBy(xpath = "//input[@placeholder='Summary']")
    WebElement storySummary;

//    @FindBy(xpath = "(//input[@type='file'])[1]")
//    WebElement fileUpload;

    @FindBy(xpath = "//div[@class='ql-editor ql-blank']//p")
    WebElement contentEditor;


    public CreatePostPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createPost(String title, String summary, String summaryy) {
    	clickstart.click();
        titleInput.sendKeys(title);
        storySummary.sendKeys(summary);
       // fileUpload.click();
       // fileUpload.sendKeys(filepath);
        contentEditor.sendKeys(summaryy);
        
    }
}