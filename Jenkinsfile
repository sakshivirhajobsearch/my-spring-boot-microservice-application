pipeline {
    agent any
    tools {
        maven 'Maven'  // Make sure Maven is configured in Jenkins
        jdk 'jdk-17'    // Ensure JDK is configured
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/sakshivirhajobsearch/my-spring-boot-microservice-application.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Deploy Service Registry') {
            steps {
                bat 'java -jar service-registry/target/service-registry-1.0-SNAPSHOT.jar'
            }
        }
        stage('Deploy Microservice One') {
            steps {
                bat 'java -jar microservice-one/target/microservice-one-1.0-SNAPSHOT.jar'
            }
        }
        stage('Deploy Microservice Two') {
            steps {
                bat 'java -jar microservice-two/target/microservice-two-1.0-SNAPSHOT.jar'
            }
        }
    }
    post {
        success {
            echo 'Deployment Successful! Access at http://localhost:8762/service-one/hello'
            echo 'Deployment Successful! Access at http://localhost:8763/service-one/hello'
        }
        failure {
            echo 'Deployment Failed! Check the logs for more details.'
        }
    }
}
