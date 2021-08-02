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
            }
        }
        stage('Test'){
            steps {
                echo 'Test..'
                echo 'show status'
                sh 'mvn -version'
                sh 'jave -version'
                // sh './mvnw package'
                sh './mvnw clean compile'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy..'
            }
        }
    }
}