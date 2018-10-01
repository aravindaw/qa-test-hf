# Project UI test and API test

This code solution covers the UI testing in [http://automationpractice.com/index.php](http://automationpractice.com/index.php) and API testing in [http://services.groupkt.com/country/get/all](http://services.groupkt.com/country/get/all).

## [UI testing](https://github.com/aravindaw/qa-test-hf)

#### Possible improvements
- Add Continuous integration (CI) to the project.
- Add report generator to get visual test case reports.
- Add bug reporting module (JIRA or Bugzilla). The attached test case document is in JIRA test case format.

### Software Requirements :
1. Java 8
2. Apache Maven 3.1.1 or above
3. Mac Operating system*

*\*Mac operating system is required to run UI test cases.*

### UI test Automation
This project includes a project structure which demonstrates a UI test automation frameworks.
The project has three main sections as, *Scripts*, *Documents* and *Contexts*. Documents and Contexts have made 
reusable so the framework follows DRY principal as much as possible. There is a separate script file for each and every 
test case and with few code lines, we can declare what we need to need to serve as input. The logic of the test scenario 
implemented in Document pages. Also, we can add *Test Case Precondition Blocks* in scripts. But here I added them as @BeforeTest blocks.
I used *Page Object model* for the development of this project and all the pages that are required for testing are 
captured and put in the *page* folder. When it happens a test case failure scenario listeners will capture it and 
take a screenshot at the moment. This image path can be changed in config.properties. 

##### Requirements to run UI test cases
UI test automation in this project only work with Mac operating system. But it can be enhanced to work with other 
operating system as future work by replacing the web driver in *resources* folder and changing the name of the 
new driver in config.properties.

##### Run UI automated test cases
1. Open up a Terminal.
2. Navigate to project folder ```$cd qa-test-hf```
3. Execute the command ```$mvn test```

##### UI test cases
1. Registering new customer
2. Login with existing customer
3. Checkout a product with existing customer

## [API testing](https://github.com/aravindaw/hf-apiTest)

### Software Requirements :
1. Java 8
2. Apache Maven 3.1.1 or above
3. Mac/Linux Operating system

### API test Automation
I used the same project structure as the UI test automation frameworks used. Test cases are in the *script* folder and 
the logic is implemented in *document folder*.

##### Run UI automated test cases
1. Open up a Terminal.
2. Navigate to project folder ```$cd hf-apiTest```
3. Execute the command ```$mvn test```




