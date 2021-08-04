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
                sshagent(['661da038-a590-47f8-b3b3-6f69de4bb1fe']) {
                    sh 'scp myproject.war root@192.168.11.13 -P 200022:/usr/local/tomcat/webapps/'
                }
            }
        }
    }
}