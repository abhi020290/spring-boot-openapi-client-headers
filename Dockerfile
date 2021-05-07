#Base Image
FROM openjdk:8-jdk-alpine

#Port to expose
EXPOSE 8080

#Env varibale for Working Directory
ENV CC_APP_HOME /usr/src/app
#ADD target/spring-boot-openapi.jar spring-boot-openapi.jar

#Locate and Create JAR path
ARG CASSANDRA_CONNECTIVITY_JAR=target/spring-boot-openapi-client-headers.jar

#Copy jar to container app directory
COPY $CASSANDRA_CONNECTIVITY_JAR $CC_APP_HOME/spring-boot-openapi-client-headers.jar

#Set Working Directory
WORKDIR $CC_APP_HOME

#Start Command
ENTRYPOINT ["java", "-jar","spring-boot-openapi-client-headers.jar"]