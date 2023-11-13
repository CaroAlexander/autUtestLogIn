# Autor: Yair Alexander Tobar Caro(Nov2023)
  @stories
  Feature: Sign up on Utest.com
    As a Tester, I want to sign up  on the Utest.com page to create a account
    @scenario1
    Scenario Outline: Sing up for a new user by clicking Join Today button
      Given that Tester Alex is on the Utest homepage
      When he successfully completes the whole sign up process
        | strFirstName   | strLastName | strEmail   | strCity | strZipCode | strPassword            |
        | Yair Alexander | Tobar Caro  | <strEmail> | Bogota  | 111041     | HiChoucairISucceed2023 |
      Then the welcome message is displayed out
        | strWelcomeMessage                                                       |
        | Welcome to the world's largest community of freelance software testers! |
      Examples:
        | strEmail                   |
        | yatobarc@udistrital.edu.co |
        | yatobarcaro@gmail.com      |
