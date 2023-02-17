Feature: Profile
  
  Background: User want to login using correct credential
    Given User open URL tinggal.id
    When User click account
    And User choose and click button masuk
    And User input value of email with 'qurates@yopmail.com'
    And User input value of password with 'qwertyuiop1'
    And User click button masuk
    
  @positive_case @PFL1001
  Scenario: User want to edit Profile
    Given User click icon Profile on the right side of Notification icon
    And User click Profile
    And User input name "Lin Fauziah"
    And User input address "Bandung"
    And user input phone "081585807973"
    And User click button of Submit
    Then Showing popup succesfully update profile