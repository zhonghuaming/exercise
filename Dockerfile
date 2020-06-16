FROM openjdk:8-jdk-alpine

MAINTAINER zhonghuaming zhonghuaming@shencom.cn

COPY target/*.jar /app.jar

ENV TZ=Asia/Shanghai
RUN  ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ENTRYPOINT ["java", "-jar", "/app.jar"]