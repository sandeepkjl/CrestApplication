pipeline {
    agent any



stages{
        stage('init'){
            steps{
                echo 'initialization...'
            }
        }
        stage('Build'){
            steps {
                bat 'mvn clean package'
                bat 'xcopy C:\\Users\\Dell\\.jenkins\\workspace\\CrestApplication\\target\\fatca-app-0.0.1-SNAPSHOT.jar C:\\jtest'
            }
            
        }

}
}
