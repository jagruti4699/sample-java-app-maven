# Maven build container 

FROM maven:3.8.5-openjdk-11 AS maven_build

COPY pom.xml /tmp/

COPY src /tmp/src/

WORKDIR /tmp/

RUN mvn package

#pull base image

FROM eclipse-temurin:11

#maintainer 
MAINTAINER dstar55@yahoo.com
#expose port 8080
EXPOSE 8080

#default command
CMD java -jar /data/greetings-1.0.0.jar

#copy hello world to docker image from builder image

COPY --from=maven_build /tmp/target/greetings-1.0.0.jar /data/greetings-1.0.0.jar
