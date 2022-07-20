pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                withGradle{
                    sh './gradlew test'
                }
                junit 'test-results.xml'
            }
        }

    // @Todo : Criar stages de notificacao
//         stage('Notifica teste') {
//
//         }
    }
}
