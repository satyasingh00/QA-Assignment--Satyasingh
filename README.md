## OpenInApp Functional E2E Automation
-- Project Overview
This project is a functional end-to-end (E2E) automation test suite for the OpenInApp web application. The task involves automating the process of creating resource links via the "Top Secret Links" feature on the OpenInApp dashboard and sharing these links on an Instagram bio. The automation script ensures that each link can be accessed sequentially from the Instagram bio, verifying their functionality.

## Table of Contents
- Project Setup
- Test Structure
- Execution in STS
-  Docker Integration
- Results
- Project Structure
- Best Practices Followed
-  Screenshots
## Project Setup
## Prerequisites
- Java Development Kit (JDK)
- Maven: To manage dependencies.
- Selenium WebDriver: For web automation.
- ChromeDriver: Required for running tests on Google Chrome.
- TestNG: Testing framework used to organize and run the tests.
- Docker: To containerize the project and ensure consistency across different environments.

## Installation
- Clone the repository
- Install dependencies
- Set up configuration
  - Modify the config.properties file located in src/test/resources/ with the following details:

     -- url: URL of the OpenInApp dashboard.
     -- email and password: Your OpenInApp login credentials.
     -- instagramUrl, instagramUsername, and instagramPassword: Your Instagram credentials.
     -- Linkcreated1 and ContentTitle: Links and titles to be used.

## Test Structure
- The test suite is organized into three main steps:

## Login to OpenInApp:

- Navigate to the OpenInApp dashboard and log in using Google authentication.

## Create Resource Links:

- Use the "Top Secret Links" feature to create four distinct resource links.
- Each link is assigned a title, and they are saved for later use.

## Update Instagram Bio:
- Log in to Instagram.
- Update the bio section with the created resource links.
- Verify that each link is correctly added.
- Click each link sequentially to ensure it redirects to the correct resource.  

## Explanation of Code Sections
- LoginPage Class: Handles the login process for OpenInApp.
  ![image](https://github.com/user-attachments/assets/089dfd3f-1d13-4bfd-bcee-4d3369655eee)

- DashboardPage Class: Manages the creation of resource links on the OpenInApp dashboard.
   ![image](https://github.com/user-attachments/assets/0c4a8376-507a-4036-83a4-ec9bdd028f38)

- InstagramPage Class: Automates the process of logging in to Instagram, updating the bio, and verifying links.
   ![image](https://github.com/user-attachments/assets/e863744b-d7c3-4d2a-89ec-7c52ef1fdde7)

## Key Lines:
- String[] links = linkcreated1.split(",");: This line splits the comma-separated string of links into an array for easier handling.
- String[] titles = contentTitle.split(",");: Similarly, this splits the titles into an array.   

## Execution in STS
- To execute the test within Spring Tool Suite:
- Right-click on the test class (SearchSelenium.java).
- Select Run As > TestNG Test.
- View the results in the TestNG view, which shows passed/failed test cases.

## Docker Integration
- Build the Docker image: docker build -t openinapp-automation .
- Run the Docker container: docker run -it openinapp-automation
- Test Results:The test results are generated after running the tests and can be viewed in the Docker container.

## Results
After running the tests, results can be found in the target/surefire-reports directory. These results include detailed logs of each test case and their respective outcomes

## Project Structure

![image](https://github.com/user-attachments/assets/d6db10a5-49d3-4ad1-a45b-fe60f64314a1)

## Screenshots
![image](https://github.com/user-attachments/assets/fb3c7cb6-ac2a-40cb-a022-3d1bf55e59d4)

![image](https://github.com/user-attachments/assets/a6dbb050-c081-4d94-a909-47aa81387c6c)

![image](https://github.com/user-attachments/assets/803a225b-c0c5-4d4a-96f9-e6a42339e6e3)

![image](https://github.com/user-attachments/assets/1823bf54-d8d0-471e-a09c-0c8dd8f6e43a)

## THANK YOU





