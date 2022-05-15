@regression @smoke @SKYW-17
Feature: Ebay Brand Outline

	Scenario Outline: Search for items with Brands
		Given Open Ebay Homepage
		When Search for "<Items>"
		And Filter by "<Brand>"
		Then Item list should have products of "<Brand>"
		
	Examples:
		|Items		|Brand		|
		|Shoes		|Nike		|
		|Shirts		|Adidas		|
		|Pants		|Unbranded	|