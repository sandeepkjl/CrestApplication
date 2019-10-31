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
                echo 'Build ID ' +env.BUILD_ID
                echo 'BUILD_NUMBER ' +env.BUILD_NUMBER
                echo 'BUILD_TAG ' +env.BUILD_TAG
                echo 'BUILD_URL ' +env.BUILD_URL
                echo 'EXECUTOR_NUMBER ' +env.EXECUTOR_NUMBER
                echo 'JAVA_HOME ' +env.JAVA_HOME
                echo 'JENKINS_URL ' +env.JENKINS_URL
                echo 'JOB_NAME ' +env.JOB_NAME
                echo 'NODE_NAME ' +env.NODE_NAME
                echo 'JOB_NAME ' +env.WORKSPACE
                bat 'mvn clean package'              
            }
        }
        stage('deploy'){
            steps{
                bat 'xcopy .\\target\\fatca-app-0.0.1-SNAPSHOT.jar D:\\jar'               
            }
           
        }
            
      

}
}
