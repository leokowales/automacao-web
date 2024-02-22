package org.automacao;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/desafio.feature",
        glue = {"org.automacao"},
        tags = "@Automacao",
        plugin = {"pretty", "summary", "html:build/reports/feature.html", "json:build/reports/feature.json"}
)
public class TestRunner {
}