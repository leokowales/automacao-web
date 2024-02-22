package org.automacao.actions;

import org.automacao.pages.BasePage;
import org.automacao.pages.PesquisaPage;
import org.junit.Assert;

public class PesquisaActions extends BasePage {
    private static final PesquisaPage pesquisaPage = new PesquisaPage();

    public static void validatePage(){
        pesquisaPage.validatePage();
    }

    public static void compararValor(String valor){
        String produto = captureText(pesquisaPage.valorProduto);
        Assert.assertNotEquals(produto, valor);
    }
}
