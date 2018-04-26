#Docker java server

FROM java:8

MAINTAINER Nair Alic

ADD src /opt/src

WORKDIR /opt/src

ENTRYPOINT ["java","-jar","MockMock-1.4.0.one-jar.jar", "-p", "2525"]