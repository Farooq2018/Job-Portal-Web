# Job Portal Web Application

Welcome to the **Farooq2018 Job Portal Web** project! This is a modern, user-friendly job portal web application designed for both job seekers and recruiters. It allows users to apply for jobs, save their favorite jobs, and manage their profiles seamlessly. Recruiters can post jobs and manage their recruitment process efficiently.

This project uses **Spring Boot** for the backend, with a **Thymeleaf** frontend, and utilizes technologies like **Bootstrap**, **jQuery**, and **Summernote** for a responsive and interactive user experience.

---

## Features

- **For Job Seekers**:
  - Create and manage job seeker profile
  - Browse and search job listings
  - Apply for jobs
  - Save favorite job listings
  - Manage applications and view applied job status
  
- **For Recruiters**:
  - Create and manage recruiter profile
  - Post new job openings
  - Manage job post activities
  - View applicants and their profiles

- **Admin Features** (If applicable):
  - Manage all users (job seekers and recruiters)
  - Approve or reject job applications
  - View job stats and activity

---

## Tech Stack

- **Backend**: 
  - Spring Boot (Java)
  - Spring Security for authentication and authorization
  - Spring Data JPA for database interaction
  
- **Frontend**:
  - Thymeleaf for templating engine
  - Bootstrap for responsive UI
  - Summernote for rich text editing
  
- **Database**:
  - H2 Database (for development) / MySQL (for production)
  
- **Build Tool**:
  - Maven
  
- **Other**:
  - Java 8 or higher
  - Maven for dependency management and build automation

---

## Project Structure

The project is organized into several key modules:
Farooq2018-Job-Portal-Web/ ├── README.md ├── mvnw ├── mvnw.cmd ├── pom.xml ├── photos/ # Contains photo assets for candidate and recruiter profiles │ ├── candidate/ │ │ └── 17/ │ └── recruiter/ │ └── 15/ ├── src/ │ ├── main/ │ │ ├── java/ # Java source code │ │ │ └── com/ │ │ │ └── farooq/ │ │ │ └── jobportal/ │ │ │ ├── controller/ # Controllers for various pages │ │ │ ├── entity/ # JPA entities for database tables │ │ │ ├── repository/ # Data access layers │ │ │ ├── services/ # Business logic and service layers │ │ │ ├── util/ # Utility classes │ │ │ └── config/ # Configuration files for Spring Boot │ │ └── resources/ │ │ ├── static/ # Static assets (CSS, JavaScript, fonts, images) │ │ ├── templates/ # HTML templates (Thymeleaf) │ │ └── application.properties # Application configuration file │ └── test/ # Unit and integration tests │ └── java/
│ └── com/ │ └── farooq/ │ └── jobportal/ │ └── JobportalApplicationTests.java └── .mvn/ └── wrapper/ └── maven-wrapper.properties


---

## Installation

To set up the project locally:

### 1. Clone the repository

git clone https://github.com/yourusername/Farooq2018-Job-Portal-Web.git

cd Farooq2018-Job-Portal-Web

## Make use of Maven to build the Project
./mvnw clean install

./mvnw spring-boot:run

By default, the application will run on http://localhost:8080.

## Setup Database Configuration in application.properties file
Database Configuration (example for MySQL)

spring.datasource.url=jdbc:mysql://localhost:3306/jobportal

spring.datasource.username=root

spring.datasource.password=password

## Spring Security settings
spring.security.user.name=user

spring.security.user.password=password

Make sure to configure the database settings according to your environment.

