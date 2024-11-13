pipeline {
    agent any

    stages {
        stage("permission") {
            steps {
                sh "chmod +x ./gradlew"
            }
        }
        stage("compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("test") {
            steps {
                sh "./gradlew test"
            }
            post { // test 단계의 post 블록
                always {
                    junit '**/build/test-logs/*.xml'
                }
            }
        }
    }
    post { // 전체 pipeline의 post 블록
        success {
            echo "Pipeline completed successfully."
        }
        failure {
            echo "Pipeline failed."
        }
    }
}