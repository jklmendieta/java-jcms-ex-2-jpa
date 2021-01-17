FROM openjdk:latest

ADD target/java-jcms-ex-2-jpa-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

EXPOSE 8087