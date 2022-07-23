package page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class SettingModal {
    public Button profileButton = new Button(By.xpath("//*[@id=\"settings_tabs\"]/li[1]"));
    public Button okButton = new Button(By.xpath("/html/body/div[9]/div[2]/div/button[1]/span"));

    public TextBox oldPwdTxtBox = new TextBox(By.id("TextPwOld"));
    public TextBox newPwdTxtBox = new TextBox(By.id("TextPwNew"));

}