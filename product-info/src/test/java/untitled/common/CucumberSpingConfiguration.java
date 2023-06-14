package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.ProductInfoApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProductInfoApplication.class })
public class CucumberSpingConfiguration {}
