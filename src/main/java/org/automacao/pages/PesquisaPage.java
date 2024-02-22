package org.automacao.pages;

import org.openqa.selenium.By;

public class PesquisaPage extends BasePage{

    public void validatePage(){
        validateElementPresence("//*[@id=\"content\"]/section/section[2]/h1");
    }

    public By valorProduto = By.xpath("//*[@id=\"item-list\"]/div[1]/a[1]/div/div[2]/section/div[1]/div/span/span[2]/span[1]");
}
