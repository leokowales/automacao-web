package org.automacao.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import org.automacao.actions.HomeActions;

public class HomeSteps {
    @Dado("que esteja na pagina inicial")
    public void queEstejaNaPaginaInicial() {
        HomeActions.validatePage();
    }

    @Quando("fizer a busca pelo produto: {string}")
    public void fizerABuscaPeloProduto(String produto) {
        HomeActions.pesquisarProduto(produto);
    }
}
