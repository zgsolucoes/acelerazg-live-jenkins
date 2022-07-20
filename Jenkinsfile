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

        stage('Notifica slack') {
             steps {
                slackSend message: "Testes unitarios executados sem erro"
            }
        }

// @todo : Criar stages de notificacao
//         stage('Gera release') {
//
//         }

// @todo : Criar stages de notificacao
//         stage('Deploy Aplicação') {
//
//         }
    }
}
