# JET-test
This project contains two Automated Test Cases.
For this Project I used Maven 3.9.6, Selenide version 7.0.5, junit 4.13.2.

Test Case 1  
● Open https://careers.justeattakeaway.com/global/en/home  
● Search for the Job Title “Test”  
● Do not enter a location, “Search” for results  
● Verify that the search contains results from multiple locations  
● Then Refine your search from the left panel to the Country “Netherlands”  
● Verify that now the search results’ location is the Netherlands only

Test Case 2  
● Open https://careers.justeattakeaway.com/global/en/home  
● Click on “Search for Job Title” and select “Sales” among Job Categories  
● Scroll to “Refine your search”  
● Verify Category “Sales” is selected and the search results number is matching  
● Then Refine your search from the left panel to the Country “Germany”  
● Verify the number of the search results is matching and category is “Sales” on
all results


## How to run with Maven
**You can checkout and run it locally.**
Type from command line for running tests in different browsers:

```
mvn clean test -P chrome
mvn clean test -P firefox
mvn clean test -P ie
mvn clean test -P edge
mvn clean test -P safari
```
