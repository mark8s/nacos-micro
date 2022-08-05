FROM eclipse-temurin:11-jre-alpine
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
  && echo 'Asia/Shanghai' >/etc/timezone
ADD /target/provider.jar /
ENTRYPOINT java -jar /provider.jar

