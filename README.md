# BDD Framework

This repository provides some working boilerplate code for building automated test suites for UI-based testing with Selenium 3 and Behavior driven development (BDD). 

# Below are some of the features of this test framework:

* Maven based framework
* Extent Report for reporting
* Report Generation (cucumber-reporting)
* Helper class to handle web component such as (click,sendkeys etc)
* POM with page factory (Page Object Model is a design pattern to create Object Repository for web UI elements. Page Factory is an inbuilt Page Object Model concept for Selenium WebDriver but it is very optimized.)
* Different browser support (chrome,firefox)
* Java 8 (lambda expression)
* Slack integration

## Documentation

* [Installation](https://github.com/selenium-cucumber/selenium-cucumber-java/blob/master/doc/installation.md)
* [Install IntelliJ](https://www.jetbrains.com/idea/download/#section=linux) for easy use of lambda expression
* Configure and Install Following Intellij Plugins
	* File -> Setting -> Plugins ->
	* Cucumber for Java 
	* Gherkin 
	* Maven Integration 

# Getting the Slack API access token(optional)

You can obtain the Slack API access token for your workspace by following the steps below:

* In your Slack Workspace, click the Apps section.
* In the Apps page, click Manage apps.
* The App Directory page shows up, in this page, make a search using the keyword “bots” in the top text box Search App Directory.
* Click Bots app > Add configuration.
* Set Username and click Add bot integration.
* You’ll get the API access token in Integration Settings.


# Setting up and running tests

* Go to Project >src >test >java >feature >Login.feature
	* Add your valid facebook username and password to run test
* Open project command line and run the following command
	* mvn clean compile test -Dbrowser=chrome 
* If you want to send messages to slack configure the following.
	* Update slack message constants from Project >src> main >java >constants >Constant
	* Uncomment the onFinish method from Project >src> main >java >utility> HookHelper 

That's all folks. Happy testing!
