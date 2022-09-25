pipeline { 
    agent any 
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') { 
            steps {
            	echo 'Build..' 
            	checkout([$class: 'GitSCM', branches: [[name: '*/main']],
     			userRemoteConfigs: [[url: 'https://github.com/jirentaicho/jenkinstest.git']]])
            	sh './mvnw clean compile'
            }
        }
        stage('Test'){
            steps {
                echo 'Test..'
                sh './mvnw test'
            }
        }
        stage('Make war file'){
        	steps {
        		echo 'Make war'
        		sh './mvnw package'
        	}
        }
        stage('Deploy') {
            steps {
                echo 'Deploy..'
                deploy adapters: [tomcat9(credentialsId: 'tomcat_misaka', path: '', url: 'http://192.168.11.6:8012')], contextPath: null, war: '**/*.war'
            }
        }
    }
}
