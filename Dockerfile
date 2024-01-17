FROM azul/zulu-openjdk-alpine:17
EXPOSE 8081
ARG JAR_FILE=*.jar
COPY build/libs/${JAR_FILE} message-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/message-1.0-SNAPSHOT.jar"]
