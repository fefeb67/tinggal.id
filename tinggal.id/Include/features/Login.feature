Feature: Login

	Background: User want to login using correct credential
    Given User open URL tinggal.id
    When User click account
    And User choose and click button masuk

	@positive_case @LGN1001
  Scenario: User want to login using correct credential
    And User input value of email with 'qurates@yopmail.com'
    And User input value of password with 'qwertyuiop1'
    And User click button masuk
    Then User successfully login