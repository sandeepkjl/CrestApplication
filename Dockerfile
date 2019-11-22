FROM java

WORKDIR /usr/app
ADD ./target/*.jar /


CMD java -jar fatca-app-0.0.1-SNAPSHOT.jar