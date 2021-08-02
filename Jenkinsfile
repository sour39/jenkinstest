pipeline { 
    agent any 
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') { 
            steps {
            	echo 'Build..' 
            	sh 'pwd'
            	sh 'ls'
            	checkout([$class: 'GitSCM', branches: [[name: '*/main']],
     			userRemoteConfigs: [[url: 'https://github.com/jirentaicho/jenkinstest.git']]])
     			echo 'end checkout'
     			echo '----------------------'
     			sh 'pwd'
            	sh 'ls'
            	sh './mvnw clean compile'
            }
        }
        stage('Test'){
            steps {
                echo 'Test..'
                sh './mvnw test'
                post {
	                always {
	                    junit '**/target/surefire-reports/TEST-*.xml'
	                }
	            }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy..'
            }
        }
    }
}