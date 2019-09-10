FROM ycr.yonyoucloud.com/base/maven-ynpm-debian:latest
MAINTAINER licza licza@yonyou.com
ADD ./ /app/
WORKDIR /app/
RUN cd lvyaya-fe/ \
    && ynpm install \
    && npm run build \
    && cd ../lvyaya-be \
    && /usr/local/maven/bin/mvn clean install -U -Dmaven.test.skip=true


FROM ycr.yonyoucloud.com/base/tomcat:8-jdk8-alpine
WORKDIR /app
RUN  mkdir -p /usr/local/tomcat/webapps/lvyaya-be

COPY --from=0 /app/lvyaya-fe/ucf-publish/lvyaya-fe /usr/local/tomcat/webapps/lvyaya-fe
COPY --from=0 /app/lvyaya-be/iuap-bootstrap/target/lvyaya-be.war /usr/local/tomcat/webapps/lvyaya-be.war
RUN unzip /usr/local/tomcat/webapps/lvyaya-be.war -d /usr/local/tomcat/webapps/lvyaya-be
RUN rm -f /usr/local/tomcat/webapps/lvyaya-be.war
WORKDIR /usr/local/tomcat
EXPOSE 8080
CMD ["catalina.sh", "run"]
