pipeline {
    agent any

    stages {
        stage('Deepti Build') {
            steps {
                echo 'Deepti Building..'
                eco "${package type}
            }
        }
        stage('Deepti Test') {
            steps {
                echo 'Testing1..'
            }
        }
        stage('Deepti Deploy1') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
