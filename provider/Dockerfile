FROM eclipse-temurin:11-jre-alpine
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
  && echo 'Asia/Shanghai' >/etc/timezone
ADD /target/provider-1.0-SNAPSHOT.jar /
ENTRYPOINT java -jar /provider-1.0-SNAPSHOT.jar

