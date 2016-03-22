Feature: compute
	permet d' effectuer des operations
 
  Scenario: Add two simple numbers.
  	Given two simple numbers 2 and 3
  	When I add them
  	Then the result is 5
  	
Scenario: Add many numbers
	Given the following numbers:
		| 2 |
		| 4 |
		| 1 |
		| 5 |
	When I add them
	Then the result is 12
	
