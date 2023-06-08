# SpringBootRestEmployee
Spring Boot RESTful Project with MVC and CRUD

This project is a Spring Boot application that provides RESTful APIs for CRUD (Create, Read, Update, Delete) operations. It follows the MVC (Model-View-Controller) architectural
pattern to separate concerns and maintain a modular structure. The APIs allow clients to interact with a database and perform operations on resources.

## Features 

- **Create:** Allows the creation of new resources by sending POST requests to the appropriate endpoint.
- **Read:** Retrieves information about resources by sending GET requests to the appropriate endpoint.
- **Update:** Updates existing resources by sending PUT or PATCH requests to the appropriate endpoint.
- **Delete:** Deletes resources by sending DELETE requests to the appropriate endpoint.


## Technologies

The project utilizes the following technologies:

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- H2 Database Engine

## Installation

1. Clone the repository: `git clone https://github.com/Woja404/SpringBootRestEmployee.git`
2. Build the project using Gradlew: `./gradlew build`
3. Run the application: `java -jar ./build/libs/Employee-0.0.1-SNAPSHOT.jar`

## Usage

Once the application is up and running, you can interact with the RESTful APIs using tools like
**curl**, **Postman**, or any other API testing tool. Make HTTP requests to the appropriate endpoints
with the required payload to perform CRUD operations on the resources.

## API Endpoints

- **GET /get:** Retrives all resources.
- **POST /post:** Creates new resource.
- **PUT /put:** Updates the existing resource.
- **DELETE /delete/{id}:** Removes existing resource by ID.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please feel free to open an issue or submit a pull request.

## Contact

E-mail: cerovec.vojislav@gmail.com

Linkedin: https://www.linkedin.com/in/vojislav-cerovec-b0840b169/
