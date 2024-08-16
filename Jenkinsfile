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
                sh "pwd"
                sh "mvn clean install"
                echo "MAVEN BUILD COMPLETED"
            }
        }
        stage("Build Docker Image") {
            steps {
                script {
                    sh "docker build -t rest-backend-image/rest-backend ."
                }
            }
        }
        stage("Run Docker Container") {
            steps {
                script {
                    // Stop and remove any existing container using the same port
                    sh "docker ps -q --filter 'name=rest-backend-container' | xargs -r docker stop"
                    sh "docker ps -a -q --filter 'name=rest-backend-container' | xargs -r docker rm"

                    // Run the new container on port 9999
                    sh "docker run -d -p 9999:9999 --name rest-backend-container rest-backend-image/rest-backend"
                }
            }
        }
    }
}
