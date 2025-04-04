package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", // Caminho dos arquivos .feature
		glue = "steps", // Pacote onde estão os steps do Cucumber
		plugin = { "pretty", "html:target/cucumber-reports" })
public class RunnerTest {
}
