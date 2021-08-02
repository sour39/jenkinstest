pipeline { 
    agent any 
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') { 
            steps {
            	echo 'Build..' 
            	// sh './mvnw clean compile'
            	bat '.\\mvnw clean compile'
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