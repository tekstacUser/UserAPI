# Use the official Tomcat image as the base image
FROM tomcat:9.0-jdk17

#set the environment
ENV UserAPI.war app

RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Set the working directory to Tomcat's webapps directory
WORKDIR /usr/local/tomcat/webapps/

# Copy your WAR file to the Tomcat webapps directory
COPY target/UserAPI.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8080 (default for Tomcat)
EXPOSE 8080

# Start Tomcat server
CMD ["catalina.sh", "run"]
