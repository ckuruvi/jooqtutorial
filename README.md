# *Setup Instructions*

 1. Download and Install Java 8  & IntelliJ IDEA Community Edition.
 2. Use git to clone the repository (https://github.com/ckuruvi/jooqtutorial.git).
 3. Open project in IntelliJ ( make sure you select the pom.xml file before clicking OK)
 4. Goto MyMainClass.java and run the file as a stand-alone java application from IntelliJ. You should see the following output.

    * `+----+`
    * `| one|`
    * `+----+`
    * `|  1 |`
    * `+----+`

 5. Goto the downloaded h2 database folder and look for `h2-1.4.197.jar` file. This jar should be under
    `/Users/{your user name}/.m2/repository/com/h2database/h2/1.4.197`
 6. Execute the following command.
       * `java -jar h2-1.4.197.jar`

 7. You should see an H2 console open on the browser with the following.

       * Driver Class : `org.h2.Driver`
       * JDBC URL: `jdbc:h2:~/bookstore`
       * User Name: `sa`
       * Password: `sa`

 8. Change JDBC URL from `jdbc:h2:~/test` to `jdbc:h2:~/bookstore` and click on connect.

 8. Copy dbscript.sql from the project into the H2 browser console and execute the script.
 9. Click on the disconnect button on the top left corner of the browser console to shut down H2.

