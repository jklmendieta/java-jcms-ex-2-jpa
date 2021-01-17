FROM openjdk:latest

ADD target/java-jcms-ex-2-jpa.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

EXPOSE 8087