**_`How to run Jacoco (from command line)`_**

    mvn clean verify (find your report under ./target/site)



**Sonar:**

    Download sonar server from here: http://www.sonarqube.org/downloads/
    
    Start sonar server (reference: http://docs.sonarqube.org/display/SONAR/Get+Started+in+Two+Minutes)
    
    run sonar server
    
        ./sonar.sh console

**_How to run Jacoco and Sonar (from command line)_**

    mvn clean verify sonar:sonar

**Find your report from:** 

    http://localhost:9000/

**If the build below fails because the code does not match Sonar minimum criteria, then use:**

    mvn clean verify sonar:sonar -Dsonar.buildbreaker.skip=true



**Setting you sonar server:**

    Please add below to to your ~/.m2/settings.xml right below servers section.
    <servers>
        <server>
            <id>[id]</id>
            <username>[host_username]</username>
            <password>[host_password]</password>
        </server>
    </servers>
    
            <!-- Please add below for Sonar -->
    <pluginGroups>
    <pluginGroup>org.sonarsource.scanner.maven</pluginGroup>
    </pluginGroups>
    
    <profile>
    <id>sonar</id>
    <activation>
        <activeByDefault>true</activeByDefault>
    </activation>
    <properties>
        <!-- Optional URL to server. Default value is http://localhost:9000 -->
        <sonar.host.url>http://[host] </sonar.host.url>
    </properties>
    </profile>
 