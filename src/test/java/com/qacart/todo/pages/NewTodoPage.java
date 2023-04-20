package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTodoPage extends BasePage {
    public NewTodoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="[data-testid=new-todo]")
    private WebElement todoInput;

    @FindBy(css="[data-testid=submit-newTask]")
    private WebElement todoSubmitButton;


    public TodosPage addTodo(String task) {
        todoInput.sendKeys(task);
        todoSubmitButton.click();
        return new TodosPage(driver);
    }





}
