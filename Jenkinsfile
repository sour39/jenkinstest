pipeline { 
    agent any 
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') { 
            steps {
            	echo 'Build..' 
            	bat 'mvn clean package'
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