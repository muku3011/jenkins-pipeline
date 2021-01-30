# Jenkins

## Start command

```shell
java -jar -DJENKINS_HOME=/e/.jenkins jenkins.war --httpPort=9090
```
JENKINS_HOME: path where you want to store all jenkins configuration and job information.

## Install plugins

After first start, Jenkins will ask to install suggested plugins (better to install them).

If you are behind a proxy or having trouble installing plugins you can try below steps:

1. Download offline plugins from [Jenkins update site](https://updates.jenkins.io/download/plugins/) 
2. Download and install 'skip-certificate-check' plugin from above link.
3. Change Jenkins update center url from HTTPS to HTTP in hudson.model.UpdateCenter.xml file inside JENKINS_HOME directory.
4. Above configuration can also be updated inside Manage Jenkins-> Manage Plugins -> Advanced -> Update Site

### List of suggested plugins:

<details>
  <summary>Click to expand!</summary>

    1. Folders
    2. OWASP Markup Formatter
    3. Build Timeout
    4. Credentials Binding
    5. Timestamper
    6. Workspace Cleanup
    7. Ant
    8. Gradle
    9. Pipeline
    10. Pipeline: GitHub Groovy Libraries
    11. Pipeline: Stage View Git
    12. SSH Build Agents
    13. GitHub Branch Source
    14. Matrix Authorization Strategy
    15. PAM Authentication
    16. LDAP
    17. Email Extension
    18. Mailer

</details>

## Katalon jobs with docker

See [here](../master/Katalon.md) for running Katalon test. Information can be used to create Jenkins job.