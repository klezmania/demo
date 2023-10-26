pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                 sh "./gradlew build"
            }
        }
        stage('Test') {
            steps {
                 sh "./gradlew test"
            }
        }
         stage('Build docker container') {
                    steps {
                         sh "./gradlew jibDockerBuild"
                    }
                }
        stage('Deliver') {
            steps {
                echo 'Deliver....'
                sh '''
                echo "doing delivery stuff.."
                '''
            }
        }
    }
}
