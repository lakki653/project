FROM ubuntu
WORKDIR /sample
COPY . /sample
RUN apt update && apt install -y openjdk-17-jdk && javac Test.java
CMD ["java", "Test"]