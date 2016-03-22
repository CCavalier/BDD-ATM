Feature: account
	permet d' effectuer des operations sur un compte en banque

Scenario Outline: Eating
  Given that account is provided by <start> euros
  When I depose <value>
  Then new value is <left> 

  Examples:
    | start | value | left |
    |  12   |  5  |  7   |
    |  20   |  5  |  15  |
  	