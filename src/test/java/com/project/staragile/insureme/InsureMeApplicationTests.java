package com.project.staragile.insureme;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InsureMeApplicationTests {
	@Test
	void testCreationMessage() throws InterruptedException {
		System.out.println("Contact Page");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		ChromeOptions chromeOptions = new ChromeOptions();
//		WebDriver webdriver = new ChromeDriver();

		// Navigate to contact page
//		String contactUrl2 = "http://localhost:8083/contact.html";
//		String contactUrl = serviceBaseUrl + "/contact.html";
//		webdriver.get(contactUrl2);

		// Populate the contact page to determine if we are able to send information
//		webdriver.findElement(By.id("inputName")).sendKeys("Justin");
//		webdriver.findElement(By.id("inputNumber")).sendKeys("123456786");
//		webdriver.findElement(By.id("inputMail")).sendKeys("face@gmail.com");
//		webdriver.findElement(By.id("inputMessage")).sendKeys("Hello. I'm not a bot.");
//		webdriver.findElement(By.id("my-button")).click();

		// Check if "Message Sent"
//		String responseText = webdriver.findElement(By.id("response")).getText();
//		TimeUnit.SECONDS.sleep(4);
//		Assert.assertEquals("Message Sent", responseText);
	}
}
