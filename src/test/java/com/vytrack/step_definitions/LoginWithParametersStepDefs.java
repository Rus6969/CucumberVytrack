package com.vytrack.step_definitions;


import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class LoginWithParametersStepDefs {


    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_an(String username, String password) {
        LoginPage loginPage=new LoginPage();
        loginPage.login(username, password);
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }


    @Then("the title should contain {string}")
    public void the_title_should_contain(String title) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("title = "+title);
        BrowserUtils.waitFor(3);
        Assert.assertTrue(Driver.get().getTitle().contains(title));

    }


    @Given("a driver is logged in")
    public void a_driver_is_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        String username =ConfigurationReader.get("driver_username");
        String password =ConfigurationReader.get("driver_password");
        new LoginPage().login(username,password);

    }

    @When("the user goes to {string} {string}")
    public void the_user_goes_to(String tab, String module) {
       new DashboardPage().navigateToModule(tab, module);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer count) {
        System.out.println("count = " + count);

        ContactsPage contactsPage =new ContactsPage();
        BrowserUtils.waitFor(3);
       Integer actualCount= Integer.parseInt(contactsPage.PageCount.getAttribute("value"));
        System.out.println("actualCount = " + actualCount);
       Assert.assertEquals(count,actualCount);

    }



}

