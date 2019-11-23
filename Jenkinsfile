pipeline {
    agent any



stages{
        stage('init'){
            steps{
                echo 'initialization...'
				echo "${DOCKER_USERID}"
				echo "${DOCKER_PASSWORD}"
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
                                "target": "libs-snapshot-local/crest-jar-copy/"
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
		
		 stage('download from artifactory'){
            steps{
                rtDownload (
                    serverId: 'jenkins-artifactory-server',
                    spec: '''{
                        "files": [
                            {
                                "pattern": "libs-snapshot-local/crest-jar-copy/*fatca*.jar",
                                "target": "D:/jar"
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
       
           
      

}
}
