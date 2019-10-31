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
        stage('deploy'){
            steps{
                bat 'xcopy .\\target\\fatca-app-0.0.1-SNAPSHOT.jar D:\\jar'               
            }
            post{
                success{
                    bat 'java -jar D:\\fatca-app-0.0.1-SNAPSHOT.jar'
                }
            }
        }
            
      

}
}
