package org.automacao.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public void validatePage(){
        validateElementPresence("//*[@id=\"header-content\"]/header/div[1]/section[1]/h1");
    }

    public By campoPesquisa = By.xpath("//*[@id=\"search-input\"]");
    public By btnPesquisa = By.xpath("//*[@id=\"header-content\"]/header/div[1]/section[2]/section/form/div/button");
}