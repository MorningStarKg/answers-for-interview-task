# NAIC Software Engineer I candidate test

## Description
This test is meant to test a candidates skills as pertain's to a Software Engineer I at the NAIC

## Googling Test
Being able to Google is one of the most important skills a developer can have.  Being able to Google efficiently and 
accurately is a must.

Include in your project a README.md file that includes the search terms you used in each search to find the solution to
the following questions

1. You need to determine how to open a file in Java 1.5
## Search terms:
* List of Java versions
* How many Java versions are there?
* How to open a file in Java 1.5?
* How to open a file in Java 5?
2. You need to determine how to find a directory via Java 8
## Search terms:
* Find a directory via Java 8
* Find a file directory in Java 8
3. You need to format a String
## Search terms:
* String formatting in Java
* String format Java

## Debugging Test
Debugging to determine where an issue is something every developer needs to do.
In this project there is a Class, org.naic.se1test.MCP that is not working.  Look at the comments and make the program
do what the comments say and fix any bugs that exist.

Comment: To pass argument(s) in main method with IntelliJ IDE click Run-->Edit Configuration-->Program Arguments field enter value

## Actual Program  writing test
* Write a Java Class with a main method that accepts two arguments.
* If there are less than two arguments throw an Exception explaining there must be two arguments
* If there are more than two arguments throw an IllegalArgumentException that there only needs to be two arguments
* Have the package of the class be org.naic.insert last name.test (example org.naic.smith.test)
* Class can be named whatever you want
* The program is checking the two Strings to see if they are an Anagram.  If they are an anagram have the console 
display "true" otherwise display "false"

https://en.wikipedia.org/wiki/Anagram

Comment: Comments: To pass argument(s) in main method with IntelliJ IDE click Run-->Edit Configuration-->Program Arguments field enter value
Test Case:
1. Two arguments ex: world wolrd
2. One argument ex: world (Exception)
3. Three arguments ex: world wolrd wodrl (IllegalArgumentException)
4. Two arguments ex: world cholpon
5. Two arguments ex: World wordl

## Finally 
Check in your code to GitHub under your own account and send the link to the interviewer.
This project should include:
 * the README.md with your search terms
 * The correct class from the debugging section
 * Your new Anagram class
