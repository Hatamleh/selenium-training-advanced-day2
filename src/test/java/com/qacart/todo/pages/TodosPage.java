package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodosPage extends BasePage {

    public TodosPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="[data-testid=welcome]")
    private WebElement welcomeMessage;

    @FindBy(css="[data-testid=add]")
    private WebElement addIcon;

    @FindBy(css="[data-testid=todo-item]")
    private WebElement todoItem;

    @FindBy(css="[data-testid=delete]")
    private WebElement deleteIcon;

    @FindBy(css="[data-testid=no-todos]")
    private WebElement noTodos;

    public boolean isWelcomeDisplayed() {
        return welcomeMessage.isDisplayed();
    }

    public NewTodoPage clickOnAddIcon() {
        addIcon.click();
        return new NewTodoPage(driver);
    }

    public String getTodoText() {
        return todoItem.getText();
    }

    public TodosPage deleteTodo() {
        deleteIcon.click();
        return this;
    }

    public boolean isNoTodosDisplayed() {
        return noTodos.isDisplayed();
    }


}
