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
                bat 'xcopy C:\\Program Files (x86)\\Jenkins\\workspace\\CrestWiproApplication\\target\\fatca-app-0.0.1-SNAPSHOT.jar D:\\jar'
            }
            
        }

}
}
