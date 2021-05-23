# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM openjdk:11-jdk-alpine
MAINTAINER obrii.org
COPY target/LeonidLunin-01.jar docker2.jar
ENTRYPOINT ["java","-jar","/docker2.jar"]