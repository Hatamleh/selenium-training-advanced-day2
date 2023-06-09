package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage extends BasePage {

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    // Elements
    @FindBy(css = "[data-testid=first-name]")
    private WebElement firstNameInput;

    @FindBy(css = "[data-testid=last-name]")
    private WebElement lastNameInput;

    @FindBy(css = "[data-testid=email]")
    private WebElement emailInput;

    @FindBy(css = "[data-testid=password]")
    private WebElement passwordInput;

    @FindBy(css = "[data-testid=confirm-password]")
    private WebElement confirmPasswordInput;

    @FindBy(css = "[data-testid=submit]")
    private WebElement submitButton;




    // Actions or Methods

    public SignupPage load() {
        driver.get("https://todo.qacart.com/signup");
        return this;
    }
    public TodosPage signup(String firstName, String lastName, String email, String password) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(password);
        submitButton.click();
        return new TodosPage(driver);
    }




}
