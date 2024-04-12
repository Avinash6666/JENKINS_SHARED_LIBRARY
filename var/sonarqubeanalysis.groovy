def call(){
    withSonarQubeEnv('sonar-server') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectNAme=Youtube -Dsonar.projectKey=Youtube '''
    }
}