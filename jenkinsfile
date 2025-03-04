pipeline {
    agent any

    stages {
        stage('Git-Java') {
            steps {
               git branch: 'main', url: 'https://github.com/lakki653/docker.git'
            }
        }
        stage('Docker build and run') {
            steps {
               sh '''docker build -t myimage10 .
                    docker run myimage10'''
            }
        }
    }
}
