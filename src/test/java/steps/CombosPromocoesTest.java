package steps;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CombosPromocoesTest {

	WebDriver driver;
	ChromeOptions options = new ChromeOptions();

	@Dado("que eu acesse o site {string}")
	public void que_eu_acesse_o_site(String site) {
		options.addArguments("--start-maximized");
		options.addArguments("disable-notification");
		driver = new ChromeDriver(options);
		driver.get(site);

	}

	@Dado("eu clico no menu no canto esquerdo superior")
	public void eu_clico_no_menu_no_canto_esquerdo_superior() {

		driver.findElement(By.xpath("//div[@class='pl']/a[1]")).click();
	}

	@Dado("clico no menu cardapio")
	public void clico_no_menu_cardapio() {
		WebElement cardapio = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title='Cardápio'])[1]")));
		cardapio.click();

	}

	@Quando("clico em combo e promocoes")
	public void clico_em_combo_e_promocoes() {
	    driver.findElement(By.xpath("(//span[text()='Combos e Promoções'])[1]")).click();

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    boolean urlCorreta = wait.until(ExpectedConditions.urlContains("/combos-e-promocoes"));

	    Assert.assertTrue("Não redirecionou para a página de Combos e Promoções!", urlCorreta);
	}



	@Entao("vejo o texto para todos os campos e promocoess")
	public void vejo_o_texto_para_todos_os_campos_e_promocoess() {

		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(screenShot, new File("./evidencia/screen.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//driver.quit();

	}

}
