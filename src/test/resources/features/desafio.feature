#language:pt
Funcionalidade: Testes exemplo web

  @Automacao
  Esquema do Cenário: Teste cucumber web
    Dado que esteja na pagina inicial
    Quando fizer a busca pelo produto: "<PRODUTO>"
    Então vou verificar se o valor está acima de "<VALOR>"

    Exemplos:
      | PRODUTO | VALOR |
      | Nike    | 10    |