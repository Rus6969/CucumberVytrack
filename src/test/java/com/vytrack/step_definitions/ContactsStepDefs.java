package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContactsStepDefs {
    @Then("the user should see folowing menu option")
    public void the_user_should_see_folowing_menu_option(List<String>list) {
        System.out.println("listSize "+ list.size());
        System.out.println(list);
        DashboardPage dashboardPage =new DashboardPage();
        List<String>actualList= new ArrayList<>();
        BrowserUtils.waitFor(2);
        for(WebElement option:dashboardPage.menuOptions){
            actualList.add(option.getText());
        }
        Assert.assertEquals(list,actualList);
    }

    @When("the user logs in using folowing credentials")
    public void the_user_logs_in_using_folowing_credentials(Map<String, String>userData) {
        System.out.println(userData);
        System.out.println("FirstName "+ userData.get("username"));
        LoginPage loginPage = new LoginPage();
        loginPage.login(userData.get("username"),userData.get("password"));

    }
}
