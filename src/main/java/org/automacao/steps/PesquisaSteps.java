package org.automacao.steps;

import io.cucumber.java.pt.Então;
import org.automacao.actions.PesquisaActions;

public class PesquisaSteps {
    @Então("vou verificar se o valor está acima de {string}")
    public void vouVerificarSeOValorEstaAcimaDe(String produto) {
        PesquisaActions.validatePage();
        PesquisaActions.compararValor(produto);
    }
}
