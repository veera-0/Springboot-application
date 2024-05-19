# Pet Peers: Your Haven for Connecting with Pets and Their People

**Pet Peers** is a web application designed to empower you to manage your pet's information effortlessly. Create detailed profiles, keep track of their details, and connect with fellow pet lovers in your community. 

**Key Features:**

- **CRUD Operations:** Gain complete control over your pet profiles with comprehensive CRUD (Create, Read, Update, Delete) functionality.
  - **Create:** Add new furry (or feathery!) friends to the system with ease.
  - **Read:** View comprehensive details of your existing pets at a glance.
  - **Update:** Keep your pet profiles current by modifying information as needed.
  - **Delete:** Easily remove pets from the database when necessary.

**Getting Started:**

Before embarking on your Pet Peers journey, ensure you have the following tools in your arsenal:

- **Java Development Kit (JDK):** Download and install the latest version from https://www.oracle.com/java/technologies/javase-downloads.html.
- **MySQL Database Server:** Set up a MySQL database server. Refer to https://dev.mysql.com/downloads/mysql/ for installation instructions.
- **Maven:** Install Maven, a build automation tool, for managing project dependencies. Instructions can be found at https://maven.apache.org/download.cgi.

**Setting Up Your Pet Sanctuary:**

1. **Clone the Repository:**

   ```bash
   git clone [https://github.com/veera-0/Springboot-application.git](https://github.com/veera-0/Springboot-application.git)
Use code with caution.
content_copy
Prepare Your Database:

**Create a MySQL database named pet_peers.**

Update the database connection details in src/main/resources/application.properties:

Properties
spring.datasource.url=jdbc:mysql://localhost:3306/pet_peers
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
Use code with caution.
content_copy
Replace your_db_username and your_db_password with your actual credentials.

# Build and Run:

**Build the Project:**

**Bash**
cd pet-peers
mvn clean install
Use code with caution.
content_copy
Launch the Application:

**Bash**
mvn spring-boot:run
Use code with caution.
content_copy
Welcome to Your Pet Paradise:

Open a web browser and navigate to http://localhost:8080. You'll be greeted by the Pet Peers home page, showcasing your pet profiles.

# Usage
Add a New Pet:
Click the “Add Pet” button.
Fill in the pet details (name, age, breed, etc.).
Click “Save” to add the pet to the database.
View Pet Details:
Click on a pet’s name to view its details.
Update Pet Information:
Click the “Edit” button next to a pet’s details.
Modify the information and click “Save Changes”.
Delete a Pet:
Click the “Delete” button next to a pet’s details.

# Tech Stack:

-**Spring Boot**: Provides a robust foundation for building this web application.
-**Thymeleaf**: Enables dynamic content generation for a seamless user experience.
-**CSS**: Crafts the application's visual style and presentation.
-**MySQL**: The reliable backend storage solution for managing your pet data.