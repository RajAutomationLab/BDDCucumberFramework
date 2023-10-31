Feature: Login Functionality
	Scenario: Successful Login with valid credentials
		Given User navigates to Login Page
		When User enters "admin@yourstore.com" into email field
		And User enters "admin" into password field
		And User clicks on Login Button
		Then Page Title should be "Dashboard"
		When User clicks on Logout Button
		Then Page Title should be "Welcome, please sign in!"
#	Examples:
#	|Username										|Password				|Title1																	|Title2							|
#	|admin@yourstore.com				|	admin123			|Dashboard / nopCommerce administration	|Your store. Login	|
#	##|abcd90fe1238@gmail.com			|	admin123089		|
#	##|abc1723hjdhdg@gmail.com		|	admin12356		|
	
	