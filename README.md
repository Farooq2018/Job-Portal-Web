
# Job Portal Web Application

## Overview
Job Portal is a web-based application designed to connect job seekers and recruiters. It allows users to search for jobs, apply for positions, manage profiles, and for recruiters to post job listings and review applications.

## Features
- **Job Seekers**:
  - Search and apply for jobs
  - Save favorite jobs
  - Manage personal profiles
- **Recruiters**:
  - Post job listings
  - Manage job applications
  - View job seeker profiles

## Project Structure
```plaintext
Farooq2018-Job-Portal-Web/
├── README.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── photos/
│   ├── candidate/
│   │   └── 17/
│   └── recruiter/
│       └── 15/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── farooq/
│   │   │           └── jobportal/
│   │   │               ├── JobportalApplication.java
│   │   │               ├── config/
│   │   │               ├── controller/
│   │   │               ├── entity/
│   │   │               ├── repository/
│   │   │               ├── services/
│   │   │               └── util/
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test/
└── .mvn/
```

### Key Directories
- `photos/`: Contains profile photos for candidates and recruiters.
- `src/main/java/`: Contains Java source files organized by packages.
  - `config/`: Configuration files for the application.
  - `controller/`: Handles web requests and responses.
  - `entity/`: Contains entity classes mapping to database tables.
  - `repository/`: Interfaces for database operations.
  - `services/`: Contains business logic and service classes.
  - `util/`: Utility classes for various functionalities.
- `src/main/resources/`: Resources such as configuration files and templates.
  - `static/`: Static assets like CSS, JS, and fonts.
  - `templates/`: HTML templates for views.
- `src/test/java/`: Test classes for the application.

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/Farooq2018-Job-Portal-Web.git
   ```

2. **Navigate to the project directory**:
   ```bash
   cd Farooq2018-Job-Portal-Web
   ```

3. **Run the application**:
   ```bash
   ./mvnw spring-boot:run
   ```

## Configuration
Modify the `application.properties` file in `src/main/resources/` to set up your database and other configurations.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.

## Acknowledgements
- Spring Boot
- Hibernate
- Thymeleaf

## Contributing
Contributions are welcome! Please open an issue or submit a pull request.

## Contact
For any inquiries or feedback, please contact Farooq at [farooqahm@gmail.com](mailto:farooqahm97@gmail.com).
