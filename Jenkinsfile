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



// @todo : Criar stages de notificacao
//         stage('Gera release') {
//
//         }

// @todo : Criar stages de notificacao
//         stage('Deploy Aplicação') {
//
//         }
    }
   post {
    success {
            slackSend message: "Testes unitarios executados com sucesso"
        }
    failure {
         slackSend message: "Testes unitarios executados com erro"
    }
   }
}
