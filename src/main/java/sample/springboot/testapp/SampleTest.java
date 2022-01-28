package sample.springboot.testapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleTest {

	@RequestMapping(method = RequestMethod.GET, path = "/iam")
	public String getDetails() {
		System.out.println("Hello all...");
		return "I am great";
	}
}
