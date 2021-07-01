pipeline {
    agent any

    stages {
        stage('Deepti Build') {
            steps {
                echo 'Deepti Building..'
                echo "${packagetype}"
            }
        }
        stage('Deepti Test') {
            steps {
                echo 'Testing1..at particular time'
                echo "I know time is : ${params.runningtime}"
            }
        }
        stage('Deepti Deploy1') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
