# *Setup Instructions*

 1. Download and Install Java 8  & IntelliJ IDEA Community Edition.
 2. Open project in IntelliJ ( make sure you select the pom.xml file before clicking OK)
 3. Goto MyMainClass.java and run the file as a stand-alone java application from IntelliJ. You should see the following output.

 +----+
 | one|
 +----+
 |   1|
 +----+

 3. Goto the downloaded h2 database folder and look for h2-1.4.197.jar file. This jar should be under
    /Users/{your user name}/.m2/repository/com/h2database/h2/1.4.197
 4. Execute the following command.
        > java -jar h2-1.4.197.jar

 5. You should see an H2 console open on the browser with the following:

       Driver Class : org.h2.Driver
       JDBC URL: jdbc:h2:~/bookstore
       User Name: sa
       Password:
 6. Enter password as sa and hit connect.
 7. Execute data from dbscript.sql in the console.

