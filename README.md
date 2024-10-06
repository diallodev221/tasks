# Sring Boot & JTE & HTMX Tasks

## Technologies Used

- Java 21
- Spring Boot 3.3.4
- JTE (Java Template Engine)
- HTMX (for dynamic frontend updates)
- Maven (for dependency management and build)

## Features

- View a list of tasks
- Add new tasks
- Delete existing tasks
- Responsive updates without full pages reloads (using HTMX)

## Setup and Running

1. Ensure you have Java 21 and Maven installed on your system
2. Clone the repository:
    ```bash
   git clone [repository-url]
   cd [repository-name]
   ```
3. Build the project
    ```bash
   mvn clean install
    ```
4. Run the application
    ```bash
   mvn spring-boot:run
    ```
5. Open a web browser and navigate to ```http://localhost:8080```

## Testing

```bash
mvn test
```