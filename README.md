# MovieWatchlistManager
MovieWatchlistManager is a web application designed to help users manage their movie watchlists. Users can add, update, and view movies in their watchlists through a user-friendly interface. 
The application utilizes Spring Boot for backend development, incorporating features such as Spring Data JPA for database operations, Thymeleaf for server-side HTML rendering, and H2 in-memory database for data storage. Bootstrap is used for frontend styling, ensuring a modern and responsive user experience. The application also integrates with an external API (OMDb API) to fetch movie ratings dynamically. With its intuitive interface and seamless functionality, MovieWatchlistManager simplifies the process of organizing and tracking movies to watch.


Working Of The Project

Backend Development:

The project is built using the Java Spring Boot framework, which provides a robust and efficient platform for developing web applications.
Spring Boot's dependency management and auto-configuration capabilities simplify the setup and development process.
The backend logic is organized into several components including controllers, services, entities, and repositories.

Entity and Repository:

The Movie entity class represents a movie with attributes such as title, rating, priority, and comment. This class is annotated with JPA annotations to define its mapping to the database.
The MovieRepo interface extends JpaRepository, providing methods for CRUD operations on the Movie entity.\

Service Layer:

The DataBaseService class serves as the service layer, encapsulating business logic related to movie management.
It interacts with the MovieRepo repository to perform database operations such as creation, retrieval, and updating of movie entities.
The RatingService class is responsible for fetching movie ratings from an external API (OMDb API) using RESTful HTTP requests. It handles communication with the API and parses the JSON response to extract the movie rating.

Controller Layer:

The MovieController class defines HTTP request handlers for managing movie-related operations.
It handles requests for displaying the watchlist form (/watchListItemForm), submitting the form data (/watchListItemForm POST endpoint), and fetching the watchlist (/watchList).
The controller interacts with the DataBaseService to perform CRUD operations on the movie entities and retrieve watchlist data.

Frontend Integration:

Thymeleaf templates are used for server-side HTML rendering, allowing dynamic data to be displayed based on the model attributes.
The provided index.html and watchlist.html templates define the structure and layout of the landing page and watchlist page, respectively.
Bootstrap CSS is utilized for styling, providing a clean and responsive user interface.

Database Configuration:

The project uses an H2 in-memory database for data storage. Configuration properties such as URL, username, and password are specified in the application.properties file.
The H2 console is enabled (spring.h2.console.enabled=true), allowing for easy database management via a web-based interface.
In summary, the project implements a movie watchlist application using Java Spring Boot, with functionalities for managing movies, fetching movie ratings from an external API, and rendering dynamic content on the frontend using Thymeleaf templates. The backend components handle business logic and database operations, while the frontend integrates with Bootstrap for styling and provides a user-friendly interface for interacting with the application.
