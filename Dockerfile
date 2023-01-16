# Difine base Docker image

FROM openjdk:17
LABEL maintainer="alan"
ADD target/learningdocker-0.0.1-SNAPSHOT.jar springboot-docker-image.jar
# Set environment variables
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar springboot-docker-image.jar"]