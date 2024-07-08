#Author: raizabatista2011@gmail.com

Feature: Realizar login no site saucedemo
  Como usuario da aplicacao
  Quero informar meus dados de login
  Para acessar a conta

  
  Scenario: Login valido
    Given que esteja na tela de login
    When enviar os dados validos
    Then login com sucesso
    
     Scenario: Login usuario bloqueado
    Given que esteja na tela de login
    When enviar dados de usuario bloqueado
    Then sistema exibe mensagem de usuario bloqueado
    

