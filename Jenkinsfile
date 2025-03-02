pipeline {
    agent any

    environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-17'
        PATH = "${env.PATH};${JAVA_HOME}\\bin"
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/sakshivirhajobsearch/my-spring-boot-microservice-application.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the application using Maven'
                bat 'mvn clean package -DskipTests'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying Service Registry'
                bat 'java -jar service-registry\\target\\service-registry-1.0-SNAPSHOT.jar'

                echo 'Deploying Microservice One'
                bat 'java -jar microservice-one\\target\\microservice-one-1.0-SNAPSHOT.jar'

                echo 'Deploying Microservice Two'
                bat 'java -jar microservice-two\\target\\microservice-two-1.0-SNAPSHOT.jar'
            }
        }
    }
    post {
        always {
            echo 'Pipeline completed'
        }
        success {
            echo 'All microservices deployed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
