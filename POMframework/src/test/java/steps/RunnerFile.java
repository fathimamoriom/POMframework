package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features",
glue="steps",
snippets=SnippetType.CAMELCASE
//plugin={"html:reports"},
//tags="@smoke"
		)
public class RunnerFile extends AbstractTestNGCucumberTests{
	
	

}