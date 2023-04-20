package com.qacart.todo.testcases;
import com.github.javafaker.Faker;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.SignupPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TodoTest extends BaseTest {

    @Test
    public void shouldBeAbleToAddATodo() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().safeEmailAddress();
        String password = "iLikeTesting";
        String text = new SignupPage(driver)
               .load()
               .signup(firstName, lastName, email, password)
               .clickOnAddIcon()
               .addTodo("Learn Selenium")
               .getTodoText();
        Assert.assertEquals(text, "Learn Selenium");
    }

    @Test
    public void shouldBeAbleToDeleteATodo() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().safeEmailAddress();
        String password = "iLikeTesting";
        boolean isNoTodosDisplayed =new SignupPage(driver)
                .load()
                .signup(firstName, lastName, email, password)
                .clickOnAddIcon()
                .addTodo("Learn Selenium")
                .deleteTodo()
                .isNoTodosDisplayed();
        Assert.assertTrue(isNoTodosDisplayed);
    }
}
