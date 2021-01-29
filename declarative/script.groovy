/*
All environment variables defined in Jenkinsfile are available in groovy script
*/

def buildApp() {
    echo 'building the application...'
}

def testApp() {
    echo 'testing the application...'
}

def deployApp() {
    echo 'deploying the application...'
}

return this