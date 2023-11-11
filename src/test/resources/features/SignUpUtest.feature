# Autor: Yair Alexander Tobar Caro(Nov2023)
  @stories
  Feature: Sign up on Utest.com
    As a Tester, I want to sign up  on the Utest.com page to create a account
    @scenario1
    Scenario: Sing up for a new user by clicking Join Today button
      Given that Alex is on the Utest homepage
      When he successfully completes the whole sign up process
      Then the welcome message is displayed out