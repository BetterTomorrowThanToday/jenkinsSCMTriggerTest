pipeline {
    agent any

    stages {
        stage("Permission") {
            steps {
                echo "Adding execute permission to gradlew"
                sh "chmod +x ./gradlew"
            }
        }

        stage("Compile") {
            steps {
                echo "Compiling Java code using Gradle"
                sh "./gradlew compileJava"
            }
        }

        stage("Unit Test") {
            steps {
                echo "Running unit tests"
                sh "./gradlew test"
            }
            post {
                always {
                    // 테스트 리포트 저장 (JUnit 리포트 형식)
                    junit '**/build/test-logs/*.xml'
                }
            }
        }
    }

    post {
        success {
            echo "Pipeline completed successfully."
        }
        failure {
            echo "Pipeline failed."
        }
    }
}