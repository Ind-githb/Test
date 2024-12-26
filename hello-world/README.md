# README.md

# Hello World Maven Project

This is a simple Maven project that demonstrates a "Hello, World!" application in Java.

## Project Structure

```
hello-world
├── src
│   └── main
│       └── java
│           └── com
│               └── example
│                   └── HelloWorld.java
├── pom.xml
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven 3.6 or higher

## Building the Project

To build the project, navigate to the project directory and run the following command:

```
mvn clean package
```

## Running the Application

After building the project, you can run the application using the following command:

```
java -cp target/hello-world-1.0-SNAPSHOT.jar com.example.HelloWorld
```

## Output

The application will print:

```
Hello, World!
``` 

## License

This project is licensed under the MIT License.