FROM openjdk:17

ARG WORKDIR=/opt/run

WORKDIR ${WORKDIR}
COPY run/lib run/lib
COPY /meowcloud-app/target/meowcloud-app-1.0.0.jar meowcloud.jar

EXPOSE 5508

ENV LANG=zh_CN.UTF-8
ENV LANGUAGE=zh_CN.UTF-8
ENV LC_ALL=zh_CN.UTF-8
ENV TZ=Asia/Shanghai
ENV SPRING_PROFILES_ACTIVE=prod

ENTRYPOINT java -jar meowcloud.jar