#
# Build stage
#
FROM maven:3.8-openjdk-18-slim
COPY src /home/app/src
COPY pom.xml /home/app
#RUN mvn -f /home/app/pom.xml clean package
#
##
## Package stage
##
#FROM amazoncorretto:19
#COPY --from=build /home/app/target/Dai-0.0.1-SNAPSHOT.jar /usr/local/lib/dai.jar
#ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /home/app/target/Dai-0.0.1-SNAPSHOT.jar"]

