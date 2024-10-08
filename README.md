# vechile-service

The Honda Service Center project is a web application developed using Java EE (J2EE),
primarily focusing on managing vehicle details in a garage environment. The application utilizes
the Spring Boot framework for building RESTful APIs, facilitating operations like creating,
reading, updating, and deleting vehicle records. The data is stored in an SQL database, and
interactions with the database are managed through JPA (Java Persistence API) with
Hibernate as the underlying ORM (Object-Relational Mapping) implementation.
Technical Stack
● Java EE (J2EE): The primary programming language for backend development.
● Spring Boot: A framework for building stand-alone, production-grade Spring-based
applications easily.
● JPA/Hibernate: Used for object-relational mapping, enabling seamless interaction with
the SQL database.
● ModelMapper: A library for object mapping that simplifies the process of transferring
data between objects.
● SQL Database: For persistent storage of vehicle and user data.
● Postman: Used for API testing to ensure the endpoints function correctly.
Key Components
1. Application Structure:
○ The application is structured following the MVC (Model-View-Controller) design
pattern, where the controller handles HTTP requests, the service layer contains
business logic, and the repository layer interacts with the database.
2. Entities:
○ BaseEntity: A base class for entities with a primary key field (id).
○ Vechicle: Represents vehicle details, including name, company, number, type,
and associated user.
○ User: Represents user information like username, email, password, etc.
○ VType: An enum representing different types of vehicles (e.g., SEDAN,
HATCHBACK, etc.).
3. DTOs (Data Transfer Objects):
○ ApiResponse: Standardizes API responses with a message and timestamp.
○ BaseDto: A base class for DTOs, containing common attributes.
○ VechicleDto: Contains vehicle data fields for transferring data to and from the
client.
4. Controller Layer:
○ The VechicleController class exposes RESTful endpoints for vehicle
management, handling operations like adding, retrieving, updating, and deleting
vehicles. Each endpoint uses appropriate HTTP methods (POST, GET, PUT,
DELETE) and returns ResponseEntity to provide status codes and responses.
5. Service Layer:
○ The VechicleService interface defines CRUD operations for vehicles, while
the VechicleServiceImpl class implements these operations. The service
layer handles business logic, such as validation and exception handling.
6. Repository Layer:
○ Utilizes Spring Data JPA to create a repository interface
(VechicleRepository) for data access. This abstraction allows for easy
database operations without writing boilerplate code.
API Interactions
● The application exposes a RESTful API at /vech with the following endpoints:
○ POST /vech: Adds a new vehicle.
○ GET /vech: Retrieves a list of all vehicles.
○ GET /vech/{vechicleId}: Retrieves details of a specific vehicle by ID.
○ PUT /vech/{vechicleId}: Updates the details of a specific vehicle.
○ DELETE /vech/{vechicleId}: Deletes a specific vehicle.
Testing
● The API endpoints are rigorously tested using Postman to ensure they meet functional
requirements and return expected responses.
Benefits
● Modular Design: The separation of concerns between layers (controller, service,
repository) enhances maintainability and scalability.
● Data Validation: Ensures data integrity through annotations and exception handling.
● User-Friendly: Provides a clear and structured API for client applications to interact
with.