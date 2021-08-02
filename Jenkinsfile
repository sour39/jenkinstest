pipeline { 
    agent any 
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') { 
            steps { 
                git 'https://github.com/jirentaicho/jenkinstest'
            }
        }
        stage('Test'){
            steps {
                
            }
        }
        stage('Deploy') {
            steps {
                
            }
        }
    }
}