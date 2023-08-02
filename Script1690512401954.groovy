using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System;


public class KatalonLoginModule
{
	private IWebDriver driver;

	public KatalonLoginModule()
	{
		// Set the path to your ChromeDriver executable
		// You can download the ChromeDriver from: https://sites.google.com/a/chromium.org/chromedriver/downloads
		driver = new ChromeDriver(@"path_to_chromedriver_directory");
	}

	public void Login(string username, string password)
	{
		// Replace "https://www.example.com/login" with the actual login page URL
		driver.Navigate().GoToUrl("https://www.example.com/login");

		// Replace "usernameInputId" and "passwordInputId" with the actual IDs of the username and password input fields on the login page
		var usernameInput = driver.FindElement(By.Id("usernameInputId"));
		var passwordInput = driver.FindElement(By.Id("passwordInputId"));
		var loginButton = driver.FindElement(By.CssSelector("input[type='submit']"));

		// Enter the username and password
		usernameInput.SendKeys(username);
		passwordInput.SendKeys(password);

		// Click the login button
		loginButton.Click();
	}

	public void Close()
	{
		driver.Quit();
	}
}
 