FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/smeet-luminus.jar /smeet-luminus/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/smeet-luminus/app.jar"]
