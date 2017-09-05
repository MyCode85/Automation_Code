
This code created an automated test that satisfies the following test scenario:
Application under test: URL https://apps3test.enservio.com/myaccess/?carrier=Enservio/#/user/login
1. Register a new user by clicking on "New User " Link from main page and enter all input and submit data.
2. Login in to test application by clicking on "Login" from main page, enter username & password and submit.
3. Verify successful login into correct URL.

Browser: Firefox
Tool: Selenium WebDriver
Language: Java
Repository: https://github.com/

Source Code: 
A java class with two methods.

signUp(String sUsrName, String sPsw, String sPswConfirm)
login(String sUsrName, String sPsw)
