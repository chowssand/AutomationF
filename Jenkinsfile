pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
					bat "mvn clean"
            }
        }
        stage('Test') {
            steps {
                bat "mvn test -Dtest=LoginTest"
            }
        }
        stage('Deploy') {
            steps {
                bat "mvn package"
            }
        }
    }
}