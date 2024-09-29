pipeline {
    agent any    
    stages {
        stage('Checkout') {
            steps {
                // Check out the source code from GitHub
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                // Example build step
                script {
                    // Run the Gradle build
                    def wrapper = sh(script: 'gradle wrapper', returnStatus: true)
                    if (result != 0) {
                        error "Build failed!"
                    }
                    def result = sh(script: 'sudo ./gradlew clean build', returnStatus: true)
                    if (result != 0) {
                        error "Build failed!"
                    }
                }
            }
        }
        
        stage('Test') {
            steps {
                script {
                    // Run tests
                    def result = sh(script: 'sudo ./gradlew test', returnStatus: true)
                    if (result != 0) {
                        error "Tests failed!"
                    }
                }
            }
        }
        
        stage('Deploy') {
            steps {
                // Example deploy step
                echo "Deploying the project..."
                // Add your deploy commands here, e.g., `scp` or `kubectl apply`
            }
        }
    }
    
    post {
        always {
            // Actions to perform regardless of build success/failure
            echo "Cleaning up..."
        }
        success {
            echo "Build succeeded!"
        }
        failure {
            echo "Build failed!"
        }
    }
}