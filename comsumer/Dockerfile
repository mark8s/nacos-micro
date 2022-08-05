FROM eclipse-temurin:11-jre-alpine
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
  && echo 'Asia/Shanghai' >/etc/timezone
ADD /target/consumer-0.0.1-SNAPSHOT.jar /
ENTRYPOINT java -jar /consumer-0.0.1-SNAPSHOT.jar
