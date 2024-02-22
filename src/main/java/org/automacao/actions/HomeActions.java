package org.automacao.actions;

import org.automacao.pages.BasePage;
import org.automacao.pages.HomePage;

public class HomeActions extends BasePage {
    private static final HomePage homePage = new HomePage();

    public static void validatePage(){
        homePage.validatePage();
    }

    public static void pesquisarProduto(String produto){
        sendKeys(homePage.campoPesquisa, produto);
        tap(homePage.btnPesquisa);
    }
}
