FROM java:8
WORKDIR /
COPY /var/lib/jenkins/workspace/calc/target/devopsCalc-1.0-SNAPSHOT.jar .
CMD java -jar devopsCalc-1.0-SNAPSHOT.jar
