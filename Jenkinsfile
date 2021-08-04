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
                def file = readFile 'output.txt'
                
                build(job: "ssh_Test", parameters: [string(name: "war_file", value: files[0])])
            }
        }
    }
}