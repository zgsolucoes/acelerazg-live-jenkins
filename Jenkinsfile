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

    // @Todo : Criar stages de notificacao
//         stage('Notifica teste') {
//
//         }
    }
}
