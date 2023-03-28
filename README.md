# Edcater-Exam Portal
This is an Exam Portal built using Java SpringBoot and Angular with MySQL as the database. The application allows users to register and login, create and take exams, and view exam results.

# ER-Digram
[![image](https://www.linkpicture.com/q/exam_1.png)](https://www.linkpicture.com/view.php?img=LPic640053e4be9051605785365)

# Installation
  * Clone the repository to your local machine.
  * git clone https://github.com/Rohit9252/Edcater-Exam-Portal.git

# Install dependencies for the SpringBoot application.

 [] Copy code
 * cd exam-portal/backend
 * ./mvnw install
# Create a PostGreSQL database.
 * mysql -u root -p
 
# CREATE DATABASE exam_portal;
 * Update the database configuration in the application.properties file located in exam-portal/backend/src/main/resources.

  `  spring.datasource.url=jdbc:mysql://localhost:3306/exam_portal
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    Run the SpringBoot application.
    bash
    Copy code
    cd exam-portal/backend
    ./mvnw spring-boot:run  `
    
# Install dependencies for the Angular application.

` cd exam-portal/frontend
* npm install
Run the Angular application. 
ng serve `
Open the application in your browser.
 * http://localhost:4200
 
 # Admin details:
 
  * UserName : admin123
  * Password : admin@123
 
 
Usage
 * Register for an account by clicking on the "Register" link in the navigation bar.
 * Login to your account.
 * Create an exam by clicking on the "Create Exam" button on the dashboard.
 * Take an exam by clicking on the "Take Exam" button on the dashboard.
  * View exam results by clicking on the "Results" button on the dashboard.


# License
This project is licensed under the MIT License.

# THANK YOU 
