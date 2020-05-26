# vulcanizer project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `vulcanizer-1.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/vulcanizer-1.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/vulcanizer-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.

## Runinng backend in Docker

Docker image was build as multistage to reduce the amount of software one needs to install on its machine. In this scenario, the only
 thing that is required is docker itself (You won't need GraalVM to start backend! https://www.graalvm.org/).

Navigate to server `vulcanizer` directory (TBR) and build image by executing:

`docker build -f src/main/docker/Dockerfile.multistage -t vulcanizer/backend .`

This line will run 2 docker jobs - the first one will create native GraalVM image and pass it as a argument to another one which will build actual application and set it up for running as docker service (keep in mind it might take a while).

After that, one can run backend in Docker by executing:

`docker run -i --rm -p 8080:8080 vulcanizer/backend`

