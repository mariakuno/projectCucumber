package page;

import control.Button;
import control.CheckBox;
import control.TextBox;
import control.Control;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SignUpModal {
    public TextBox fullNameTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox passwordTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public CheckBox termsChkBox = new CheckBox(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button signUpButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));

}