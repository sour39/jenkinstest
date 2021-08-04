pipeline { 
    agent any 
    environment {
        SSH_INFO = credentials('dev')
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') { 
            steps {
            	echo 'Build..' 
            	checkout([$class: 'GitSCM', branches: [[name: '*/main']],
     			userRemoteConfigs: [[url: 'https://github.com/jirentaicho/jenkinstest.git']]])
            	//sh './mvnw clean compile'
            }
        }
        stage('Test'){
            steps {
                echo 'Test..'
                //sh './mvnw test'
            }
        }
        stage('Make war file'){
        	steps {
        		echo 'Make war'
        		//sh './mvnw package'
        	}
        }
        stage('Deploy') {
            steps {
                echo 'Deploy..'
                echo $SSH_INFO
                sh 'scp myproject.war root@192.168.11.13 -p 20022:/usr/local/tomcat/webapps/'
            }
        }
    }
}