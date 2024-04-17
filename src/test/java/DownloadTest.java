import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

public class DownloadTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void downloadAndVerify() throws IOException {

        driver.get("https://intellipaat.com/blog/tutorial/selenium-tutorial/selenium-cheat-sheet/");
        WebElement pdfLink = driver.findElement(By.linkText("Download a Printable PDF of this Cheat Sheet"));
        pdfLink.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }

        String pdfUrl = driver.getCurrentUrl();

        InputStream in = new URL(pdfUrl).openStream();
        Files.copy(in, Path.of("C:\\Users\\Minhaz\\Downloads\\Selenium Cheat Sheet.pdf"), StandardCopyOption.REPLACE_EXISTING);

        Assert.assertTrue(verifyDownloadedFile("C:\\Users\\Minhaz\\Downloads", "Selenium Cheat Sheet.pdf"));
    }

    public boolean verifyDownloadedFile(String savedFilePath, String fileName) {

        boolean flag = false;
        File dir = new File(savedFilePath);
        File[] dir_contents = dir.listFiles();
        assert dir_contents != null;
        for (File dirContent : dir_contents) {
            if (dirContent.getName().equals(fileName))
                return true;
        }
        return flag;
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}

