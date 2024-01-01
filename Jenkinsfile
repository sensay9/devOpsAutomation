pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(
                    branches: [[name: '*/master']],
                    extensions: [],
                    userRemoteConfigs: [[credentialsId: 'b2587b0b-749c-4efd-8286-98f876b8c3bc', url: 'https://github.com/sensay9/devOpsAutomation']]
                )
                bat 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            steps {
                bat 'docker build -t sensay2020/devops-integration .'
            }
        }
        stage('Push Image to Docker Hub') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'dockerhub-password-secret', variable: 'DOCKERHUB_PASSWORD')]) {
                        bat "docker login -u sensay2020 -p ${DOCKERHUB_PASSWORD}"
                        bat "docker push sensay2020/devops-integration"
                    }
                }
            }
        }
    }
}
