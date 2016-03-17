Feature: Checkout
	
	Scenario: Checkout a banana
		Given The price of a "banana" is 40c
		When I checkout 1 "banana"
		Then The total price should be 40c
		
	Scenario: Checkout banana and apple
		Given The price of a "banana" is 40c
		And The price of a "apple" is 25c
		When I checkout 1 "banana"
		And I checkout 1 "apple"
		Then The total price should be 65c


	Scenario Outline: Checkout bananas
		Given The price of a "banana" is 40c
		When I checkout <count> "banana"
		Then The total price should be <total>c
		
		Examples:
		|count	|	total	|
		|1		|	40		|
		|2		|	80		|