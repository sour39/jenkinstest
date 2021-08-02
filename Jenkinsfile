pipeline { 
    agent any 
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') { 
            steps {
            	echo 'Build..' 
            	git url: 'https://github.com/jirentaicho/jenkinstest'
            	withMaven {
            		sh "mvn clean verify"
            	}
            }
        }
        stage('Test'){
            steps {
                echo 'Test..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy..'
            }
        }
    }
}