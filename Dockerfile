# Docker build stage
FROM gradle AS build

# Build Stage
WORKDIR /opt/app
COPY ./ /opt/app
RUN gradle build

#Docker Build Stage
FROM openjdk:17-alpine
COPY --from=build /opt/app/build/libs/some-jenkins-0.0.1-SNAPSHOT.jar app.jar
ENV PORT 8000
EXPOSE $PORT

ENTRYPOINT ["java","-jar","-Xmx1024M","-Dserver.port=${PORT}","app.jar"]