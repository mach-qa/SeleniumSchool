
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class WebDriverFeaturesLesson extends TestBase {

    @Test
    public void shouldFillFormWithSuccess() {

        driver.get("https://seleniumui.moderntester.pl/form.php");

        WebElement firstName = driver.findElement(By.id("inputFirstName3"));
        firstName.sendKeys("Jan");

        driver.findElement(By.id("inputLastName3")).sendKeys("Nowak");

        List<WebElement> experience = driver.findElements(By.name("gridRadiosExperience"));

        experience.get(3).click();

        driver.findElement(By.cssSelector(".btn-primary")).click();
        
        WebElement msg = driver.findElement(By.id("validator-message"));

        assertThat(msg.getText()).isEqualTo("Form send with Success");

        //wybieranie pozcji z listy rozwijanej lub wybranie "opcji"
        //Select continents = new Select(driver.findElement(By.id("selectContinents")));
        //continents.selectByIndex(6)
        //continents.selectByValue("noth-america") //<- proponowana
        //continents.selectByVisibleText("North America")

        // Dodawanie pliku
        //File file = new File("src\\main\\resource\\file.txt");
        //driver.findElement(By.id("chooseFile")).sendKeys(file.getAbsolutePath());

        //Obsługa pop-up/alertów przeglądarki
        //driver.switchTo().alert().sendKeys("some Text");
        //driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss()

        //Obsługa Iframe
        //driver.switchTo().frame("frame1"); //-> przełaczamy się na innego frame'a
        //driver.findElement(); //-> szukamy elementu w danym framie
        //driver.switchTo().defaultContent(); //-> przełączamy Driver na główny content stronę
        //driver.switchTo().parentContent(); // -> przełączamy driver na level wyzej/poprzedni
        //driver.findElement(); // -> szukamy ponownie elementu na głównej stronie

        //Dodatkowe KEYS
        //element.sendKeys(Keys.ENTER);
        //element.sendKeys(Keys.ARROW_RIGHT);
        //element.sendKeys(Keys.CONTROL + "a" + Keys.BACK_SPACE);

        //Klasa Action -> Drag & Drop
        //WebElement drag = driver.findElement(By.id("draggable"));
        //WebElement drop = driver.findElement(By.id("droppable"));
        //Actions actions = new Actions(driver);
        //actions.clickAndHold(drag).moveToElement(drop).release().perform();
        // LUB actions.dragAndDrop(drag, drop)

        }

    public WebElement getRandomElement(List<WebElement> elements) {
        return elements.get(new Random().nextInt(elements.size()));
    }
}
