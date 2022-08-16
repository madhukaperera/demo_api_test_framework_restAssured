# Introduction
This repository contains an automated test with some pre-listed acceptance criteria
## Supported Operating Systems
* Windows
* Linux
* Mac
# Prerequisites
Following dependencies should be installed before build and run the test suite.
* Java 11 or above
* Maven 3.8.x and above
## Check Java Installation
Run the command in a terminal
`java -version`. It should display the following output or similar output accordingly

`openjdk version "11.0.15" 2022-04-19`  
`OpenJDK Runtime Environment Homebrew (build 11.0.15+0)`  
`OpenJDK 64-Bit Server VM Homebrew (build 11.0.15+0, mixed mode)`
## Check Maven Installation
Run the command in terminal `mvn -v`. It should display the following output  
`Apache Maven 3.8.2 (ea98e05a04480131370aa0c110b8c54cf726c06f)`  
`Maven home: C:\Users\{@User Name}\Documents\Software\apache-maven-3.8.2`  
`Java version: 11, vendor: Oracle Corporation, runtime: C:\Users\{@User Name}\Documents\Software\jdk-11`  
`Default locale: en_US, platform encoding: Cp1252`  
`OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"`
# Configure Test Suite (Before Run)
Open the file `src/main/resources/configs.properties`.  
Update the properties in the file as required.  
`api.url`= Base Url of the API. Ex: https://api.tmsandbox.co.nz/  
# Build Test Suite
Run the command `mvn clean install -DskipTests` in a terminal to build the project.
# Execute Testcases
## Execute Full Suite
Run the command `mvn test` in a terminal.
## Execute Given Test Suite
Run the command `mvn test -Dtest.suite=CategoryTests` in a terminal considering **CategoryTest** is the name of the test suite xml file Ex: **CategoryTest.xml**.
# View Test Results Report
Open the file `target/surefire-reports/index.html` in a web browser to view the HTML test results report.