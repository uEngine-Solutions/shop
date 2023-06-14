package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.CustomerServiceApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerServiceApplication.class })
public class CucumberSpingConfiguration {}
