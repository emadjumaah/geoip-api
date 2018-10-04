FROM openjdk:11-jre-slim

RUN apt-get update && \
    apt-get install -y curl && \
    rm -rf /var/lib/apt/lists/*

ENV JAVA_GC_OPTS    -XshowSettings:vm \
                    -XX:+PrintCommandLineFlags \
                    -XX:InitialRAMPercentage=40 \
                    -XX:MaxRAMPercentage=85 \
                    -XX:+UseG1GC \
                    -XX:+UseNUMA \
                    -XX:+UseCompressedOops \
                    -XX:+UseStringDeduplication
ENV JAVA_OPTS   -server \
                -Dfile.encoding=UTF-8 \
                -Djava.awt.headless=true \
                -Djava.security.egd=file:/dev/./urandom \
                -Dcom.sun.management.jmxremote \
                -Dcom.sun.management.jmxremote.authenticate=false \
                -Dcom.sun.management.jmxremote.ssl=false \
                -Dcom.sun.management.jmxremote.local.only=false \
                -Djava.rmi.server.hostname=127.0.0.1

EXPOSE 8080

COPY target/geoip-api.jar /opt/geoip-api.jar

HEALTHCHECK CMD curl -f http://localhost:8080/8.8.8.8

CMD exec java ${JAVA_GC_OPTS} ${JAVA_OPTS} -jar /opt/geoip-api.jar
