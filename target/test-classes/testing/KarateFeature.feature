Feature: Test the API

Background:
Given url "https://api-pub.bitfinex.com"
And path  "/v2/tickers"
And params {symbols: 'ALL'}
And header Content-Type = 'application/json'

And def mult =
"""
function(var1, var2){
	var a = var1
	
	return a*var2;
}

"""

Scenario: Test API
	When method GET
	Then print response
	And print (response[0])[0]
	And print mult(5,3)
	And print response.headers