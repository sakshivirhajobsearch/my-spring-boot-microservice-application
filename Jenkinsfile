pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your/repo.git'
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
}
