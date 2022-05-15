@regression
Feature: Ebay Cart Functionality

	Scenario: Add product to cart using drop down options
		Given Open Ebay Homepage
		When Search for shirt
		And Select the first shirt on item list
		And Select Size
		And Select Men Size
		And Select Shade
		And Select Quantity
		Then Add to shopping cart
    