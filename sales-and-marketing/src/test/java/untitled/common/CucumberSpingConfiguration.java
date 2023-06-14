package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.SalesAndMarketingApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SalesAndMarketingApplication.class })
public class CucumberSpingConfiguration {}
