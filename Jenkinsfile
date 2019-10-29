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
            }
            
        }

}
}
