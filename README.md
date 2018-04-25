# *Setup Instructions*

 1. Download and Install Java 8  & IntelliJ IDEA Community Edition.
 2. Use git to clone the repository (https://github.com/ckuruvi/jooqtutorial.git).
 3. Open project in IntelliJ ( make sure you select the pom.xml file before clicking OK)
 4. Goto MyMainClass.java and run the file as a stand-alone java application from IntelliJ. You should see the following output.

 +----+ /n
 | one|
 +----+
 |   1|
 +----+

 5. Goto the downloaded h2 database folder and look for h2-1.4.197.jar file. This jar should be under
    /Users/{your user name}/.m2/repository/com/h2database/h2/1.4.197
 6. Execute the following command.
        > java -jar h2-1.4.197.jar

 7. You should see an H2 console open on the browser with the following:

       Driver Class : org.h2.Driver
       JDBC URL: jdbc:h2:~/bookstore
       User Name: sa
       Password:
 8. Enter password as sa and hit connect.
 9. Execute data from dbscript.sql in the console.

