package testScript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.CreatePostPage;


public class CreatePostTest extends BaseClass{
    CreatePostPage createPostPage;

    @BeforeClass(alwaysRun = true)
    public void setupTest() {
        super.setup();
        driver.get("https://write-wave-gamma.vercel.app/");
        createPostPage = new CreatePostPage(driver);
    }

    @Test(priority = 3 )
    public void testCreatePost() {
        createPostPage.createPost(
            "My First Selenium Project",
            "This is a story created using Selenium",
           // "\"C:\\Users\\rohya\\OneDrive\\Desktop\\Excel\\Bug Report_Proxify.docx\"",
            "This is blog content written through automation"
        );
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.close();
    }
}
