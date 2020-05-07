FROM java:8
WORKDIR /app
COPY target/devopsCalc-1.0-SNAPSHOT.jar ./
CMD java -jar devopsCalc-1.0-SNAPSHOT.jar
