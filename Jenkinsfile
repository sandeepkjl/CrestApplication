pipeline {
    agent any



stages{
        stage('init'){
            steps{
                echo 'initialization...'
            }
        }
        stage('compile'){
            steps{
                echo 'compiling...'
            }
        }
        stage('Build'){
            
            steps {
                bat 'mvn clean package'              
            }
        }
        stage('upload to artifactory'){
            steps{
                rtUpload (
                    serverId: 'jenkins-artifactory-server',
                    spec: '''{
                        "files": [
                            {
                                "pattern": "./target/*fatca*.jar",
                                "target": "libs-snapshot/"
                            }
                                ]
                        }''',
 
                    // Optional - Associate the uploaded files with the following custom build name and build number,
                    // as build artifacts.
                    // If not set, the files will be associated with the default build name and build number (i.e the
                    // the Jenkins job name and number).
                    buildName: 'JFrog',
                    buildNumber: env.BUILD_NUMBER
)
            }
        }
        stage('deploy'){
            steps{
                bat 'xcopy .\\target\\fatca-app-0.0.1-SNAPSHOT.jar D:\\jar'               
            }
           
        }
            
      

}
}
