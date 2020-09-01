FROM store/oracle/serverjre:8

ADD target/docker-demo-1.0.0.jar run.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar" ,"run.jar"]
