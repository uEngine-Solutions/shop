package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.ExpertAdviceApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ExpertAdviceApplication.class })
public class CucumberSpingConfiguration {}
