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

// @todo : Criar stages de notificacao
        stage('Gera release') {
           steps{
                 sh 'echo "Gerando release...."'
           }
        }

// @todo : Criar stages de notificacao
//         stage('Deploy Aplicação') {
//
//         }
    }
   post {
    always {
      junit(testResults: '**/build/test-results/test/*.xml', allowEmptyResults: true)
    }
    success {
            slackSend message: "Testes unitarios executados com sucesso na branch ${BRANCH_NAME}"
        }
    failure {
         slackSend message: "Testes unitarios executados com erro na branch : ${BRANCH_NAME}"
    }
   }
}
