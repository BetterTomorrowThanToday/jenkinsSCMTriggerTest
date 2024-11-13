pipeline {
    agent any
    stage("permission"){
                steps{
                     sh "chmod +x ./gradlew"
                }
            }
            stage("compile"){
                steps{
                     sh "./gradlew compileJava"
                }
            }
            stage("test"){
                steps{
                     sh "./gradlew test"
                }
            }
     }
//     stages {
//         stage("Permission"){
//             steps{
//                 sh "chmod +x ./gradlew"
//             }
//         }
//         stage("Compile") {
//             steps {
//                 echo "Compiling Java code using Gradle"
//                 sh "./gradlew compileJava"
//             }
//         }
//         stage("Unit Test") {
//             steps {
//                 echo "Running unit tests"
//                 sh "./gradlew test"
//             }
//             post {
//                 always {
//                     junit '**/build/test-logs/*.xml'
//                 }
//             }
//         }
//     }
//     post {
//         success {
//             echo "Pipeline completed successfully."
//         }
//         failure {
//             echo "Pipeline failed."
//         }
//     }
}