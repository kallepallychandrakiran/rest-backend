pipeline {
    agent any
    tools {
        maven "maven_3_9_8"  // Matches the name you set in Jenkins
    }

    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kallepallychandrakiran/rest-backend']])
                echo "GIT BRANCH CHECKED_OUT"
                sh "mvn clean install"
                echo "MAVEN BUILD COMPLETED"
            }
        }
    }
}
