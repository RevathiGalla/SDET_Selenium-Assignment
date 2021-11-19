Feature: Validate OrangeHRP Page
Scenario: Validating Admin Job Title

Given login in OrangeHRP Application 
Then Click on Job
When  click on Admin Link
And  validate text – Job Title 