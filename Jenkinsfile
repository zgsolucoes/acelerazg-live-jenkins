pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                withGradle{
                    sh './gradlew test'
                }
            }
        }

        stage('Notifica teste') {
            steps {
                slackSend message: "Testes realizados no microserviço de Spring - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
            }
        }
    }
}
