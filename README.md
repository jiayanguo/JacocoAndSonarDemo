How to run Jacoco (from command line)
    mvn clean verify (find your report under ./target/site)



Sonar:
    Download sonar server from here: http://www.sonarqube.org/downloads/
    Start sonar server (reference: http://docs.sonarqube.org/display/SONAR/Get+Started+in+Two+Minutes)
    run sonar server
        ./sonar.sh console

How to run Jacoco and Sonar (from command line)
    mvn clean verify sonar:sonar

find your report from http://localhost:9000/

If the build below fails because the code does not match Sonar minimum criteria, then use:
    mvn clean verify sonar:sonar -Dsonar.buildbreaker.skip=true



Setting you sonar server:

 step 1: Please add content of setting.xml file to to your ~/.m2/settings.xml right below servers section:
 