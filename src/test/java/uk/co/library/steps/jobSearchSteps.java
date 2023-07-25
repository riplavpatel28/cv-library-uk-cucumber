package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import uk.co.library.pages.HomePage;

public class jobSearchSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @And("I accept cookies")
    public void iAcceptCookies() {
        new HomePage().acceptIframeAlert();
    }

    @When("I   enter job title {string}")
    public void iEnterJobTitle(String jobRole ) {
        new HomePage().enterJobTitle(jobRole);
    }

    @And("I  enter Location {string}")
    public void iEnterLocation(String enterLocation) {
        new HomePage().enterLocation(enterLocation);
    }

    @And("I select distance {string}")
    public void iSelectDistance(String enterDistance) {
        new HomePage().selectDistance(enterDistance);
    }

    @And("I click on moreSearchOptionsLink")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter salaryMin {string}")
    public void iEnterSalaryMin(String minSalary) {
        new HomePage().enterMinSalary(minSalary);
    }

    @And("I enter salaryMax {string}")
    public void iEnterSalaryMax(String maxSalary) {
        new HomePage().enterMaxSalary(maxSalary);
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryType(String sType) {
        new HomePage().selectSalaryType(sType);
    }

    @And("I select jobType {string}")
    public void iSelectJobType(String JobType) {
        new HomePage().selectJobType(JobType);

    }

    @And("I click on Find Jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobs();
    }



    @Then("I should verify the {string}")
    public void iShouldVerifyThe(String result) {
        Assert.assertEquals("result not match",result,new HomePage().getResult());
    }


}
