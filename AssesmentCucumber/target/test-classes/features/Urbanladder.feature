Feature: Testing the urban ladder site

Scenario: Searching for dining table
Given Initialize the browser with chrome
And Navigate to "http://www.urbanladder.com/" Site
When user enters "din" in search box
Then print the count of dining table
And close browsers


Scenario: Clicking on Help icon
Given Initialize the browser with chrome
And Navigate to "http://www.urbanladder.com/" Site
When user clicks on help button
Then verify the Contactmail Bulkordermail Facebook and Twitter
And close browsers



Scenario: Clicking on living option
Given Initialize the browser with chrome
And Navigate to "http://www.urbanladder.com/" Site
When user clicks on Living menu and wooden sofa
Then prints the number of sofa and click on view product
And close browsers


Scenario: Clicking on gift cards
Given Initialize the browser with chrome
And Navigate to "http://www.urbanladder.com/" Site
When user clicks on giftcards and then clicking on birthday
Then user enters amount and selects date and click on next
And user enters from and to details and click on confirm button
And close browsers

Scenario: Login page Validation
Given Initialize the browser with chrome
And Navigate to "http://www.urbanladder.com/" Site
When user clicks on login button 
Then Enters username and password and click on login 
And close browsers


Scenario: Validating stores icon
Given Initialize the browser with chrome
And Navigate to "http://www.urbanladder.com/" Site
When user clicks on stores button and clicks view details on Hadapsar
Then displays the address and working hrs in the console
And close browsers

Scenario: Validating DecorIcon page
Given Initialize the browser with chrome
And Navigate to "http://www.urbanladder.com/" Site
When user clicks on decor icon
Then checks the title of Home decor page
And close browsers


Scenario: Validating Study Button
Given Initialize the browser with chrome
And Navigate to "http://www.urbanladder.com/" Site
When user clicks on study icon
Then check the count of products in the page is 10
And close browsers

