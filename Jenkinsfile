pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                withGradle{
                    sh './gradlew test'
                }
                junit(testResults: '**/build/test-results/test/*.xml', allowEmptyResults: true)
            }
        }

    // @Todo : Criar stages de notificacao
//         stage('Notifica teste') {
//
//         }
    }
}
