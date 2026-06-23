![CS121 Banner](images/CS121-BANNER.svg)
# Module 4 Lab Guide (part 1)
[Lab Introduction Video](https://boisestate.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=16f82241-9181-4de0-b131-ae240170c297&start=0)

**NOTE: Please remember to [open the workspace](images/open-lab-workspace.png) before beginning on the lab activities. If you see an error message stating that VSCode Failed to resolve the main method, that the build path is invalid, or that the java file is not on the classpath, you most likely have forgotten to open the workspace correctly.**

### Code Style Requirements
Please review the [CS121 Style Guide](https://docs.google.com/document/d/1LWbGQBKkApnNAzzgwOSvRM03DmhYWx5yEfecT2WXfjI/edit?usp=sharing) and apply it in all lab activities and projects this semester. Coding Style will assessed as part of your lab and project grades.

### Code Quality Requirements
- Code must compile without warnings using openjdk11
- Code must run without errors or warnings on safe-path and edge test cases
- More to come as we learn about input validation and exception handling

## Lab Warmup - LeapChecker
[Walkthrough Video](https://boisestate.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=8cfc1377-4e98-4c51-863a-ae240170c290&start=0)
### Problem Description
Design and implement an application that reads an integer value representing a year from the user.  The purpose of the program is to determine whether the year is a leap year (and therefore has 29 days in February) in the Gregorian calendar.  A year is a leap year if it is divisible by 4, unless it is also divisible by 100 but not 400.  For example, the year 2003 is not a leap year, but 2004 is.  The year 1900 is not a leap year because it is divisible by 100, but the year 2000 is a leap year because even though it is divisible by 100, it is also divisible by 400.  

Print an error message for any input value less than 1582 (the year the Gregorian calendar was adopted) and exit immediately. When a non-recoverable error occurs, it is common to exit immediately with a non-zero exit status.  On most operating systems, an exit status of zero means that the program ran successfully and a non-zero exit status means that some sort of error has occurred. 

The following code will allow your program to exit immediately with an exit status of 1.

```
System.exit(1);
```

Your program should match the expected output below.

#### Expected Program Output (with sample user input)
```
Enter a year: 1980
1980 is a leap year
```
#### Expected Program Output (with sample user input)
```
Enter a year: 2020
2020 is a leap year
```
#### Expected Program Output (with sample user input)
```
Enter a year: 1900
1900 is not a leap year
```
#### Expected Program Output (with sample user input)
```
Enter a year: 2019
2019 is not a leap year
```
#### Expected Program Output (with sample user input)
```
Enter a year: 1502
ERROR: not valid in Gregorian calendar
```

### Implementation Guide
1. Expand the folder named LeapChecker and create a new file named LeapChecker.java
2. Design a program to satisfy the requirements in the Problem Description and enter the program code in LeapChecker.java
3. Test the program with the sample user input using the run link above the main method
4. Commit the changes to your local repository with a message stating that Lab Warmup is completed.
5. Push the changes from your local repository to the github classroom repository.

## Lab Activity 1 - EvenNumberSum
### Problem Description
Design and implement an application that reads an integer value and prints the sum of all even integers between 2 and the input value, inclusive. Print an error message if the input value is less than 2 and exit immediately.

When a non-recoverable error occurs, it is common to exit immediately with a non-zero exit status.  On most operating systems, an exit status of zero means that the program ran successfully and a non-zero exit status means that some sort of error has occurred. 

The following code will allow your program to exit immediately with an exit status of 1.
```
System.exit(1);
```

Your program should match the expected output below.

#### Expected Program Output (with sample user input)
```
Enter a positive integer: 100
The sum of the even integers from 2 to 100 is 2550
```

#### Expected Program Output (with sample user input)
```
Enter a positive integer: 101
The sum of the even integers from 2 to 101 is 2550
```

#### Expected Program Output (with sample user input)
```
Enter a positive integer: 2
The sum of the even integers from 2 to 2 is 2
```
#### Expected Program Output (with sample user input)
```
Enter a positive integer: 1
Error: The value must be greater than two.
```

### Implementation Guide
1. Expand the folder named EvenNumberSum and create a new file named EvenNumberSum.java
2. Design a program to satisfy the requirements in the Problem Description and enter the program code in EvenNumberSum.java
3. Test the program with the sample user input using the run link above the main method. Carefully think about each of the different cases you'll need to test for to verify that the application is functioning properly.
4. Commit the changes to your local repository with a message stating that Lab Activity 1 is completed.
5. Push the changes from your local repository to the github classroom repository.
