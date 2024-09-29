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
                echo "Building the project..."
                // Add your build commands here, e.g., `mvn clean install`
            }
        }
        
        stage('Test') {
            steps {
                // Example test step
                echo "Running tests..."
                // Add your test commands here, e.g., `mvn test`
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