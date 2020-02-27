Feature: To Validate facebook functionality

Background:
 Given User is on bearnesandnobel webpage

@Sanity
Scenario Outline: To Verify Search Button


When User enter the Search Item "<Search>"
Then user click the Search button

Examples:
|Search|
|Teens|
|NOOK|
@Smoke
Scenario: To Verify Signin

When user click the myaccount "My Account"
Then click the sign in




