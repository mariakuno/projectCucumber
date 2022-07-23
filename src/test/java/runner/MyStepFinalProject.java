package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.*;
import session.Session;

import java.math.RoundingMode;
import java.util.Map;

public class MyStepFinalProject {
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    SignUpModal signUpModal = new SignUpModal();
    MenuSection menuSection = new MenuSection();
    SettingModal settingModal = new SettingModal();
    int numero =  (int)Math.round(Math.random()*100);
    @Given("the page {string} is open")
    public void thePageIsOpen(String url)  {
        Session.getInstance().getBrowser().get(url);
    }

    @When("I want to create a new account")
    public void iWantToCreateANewAccount(Map<String,String> data) {
        mainPage.signUpFreeButton.click();
        signUpModal.fullNameTxtBox.writeText(data.get("fullName"));
        signUpModal.emailTxtBox.writeText(numero + data.get("email"));
        signUpModal.passwordTxtBox.writeText(data.get("password"));
        signUpModal.termsChkBox.click();
        signUpModal.signUpButton.click();
    }
    @Then("I should enter to webpage")
    public void iShouldEnterToWebpage() {
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(), "ERROR la creación de cuenta fallo");
    }
    @When("I access to Setting")
    public void iAccessToSetting() {
        menuSection.settingsButton.click();
    }

    @Then("the profile page is open")
    public void theProfilePageIsOpen() {
        Assertions.assertTrue(settingModal.profileButton.isControlDisplayed(), "ERROR el login fallo");
    }

    @When("I update the old password {string} with the new password {string}")
    public void iUpdateTheOldPasswordWithTheNewPassword(String oldPass, String newPass) {
        settingModal.oldPwdTxtBox.writeText(oldPass);
        settingModal.newPwdTxtBox.writeText(newPass);
        settingModal.okButton.click();
    }

    @Then("the password is updated")
    public void thePasswordIsUpdated() {
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(), "ERROR no se modificó el password");
    }

    @When("I logout of page")
    public void iLogoutOfPage() {
        menuSection.logoutButton.click();
    }

    @Then("I am redirected to the page {string}")
    public void iAmRedirectedToThePage(String url) {
        Session.getInstance().getBrowser().get(url);
    }

    @When("I access with the new password")
    public void iAccessWithTheNewPassword(Map<String, String> credential) {
        mainPage.loginButton.click();
        loginModal.emailTxtBox.writeText(numero+credential.get("email"));
        loginModal.pwdTxtBox.writeText(credential.get("password"));
        loginModal.loginButton.click();
    }

    @Then("I should enter to the webpage")
    public void iShouldEnterToTheWebpage() {
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(), "ERROR el login fallo");
    }
}
