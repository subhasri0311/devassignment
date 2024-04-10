pipeline {
    agent any
   tools {
        // Use the configured Maven installation
        maven 'Maven'
    }
	
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/subha130604/sample.git'
            }
        }
         stage('Build') {
            steps {
                

                dir('C:/Users/SUBHA/assignment/first') {
			bat 'mvn compile'
                    bat 'mvn package'
			
                }
            }
        }
	    stage('Test'){
		    steps{
			    dir('C:/Users/SUBHA/assignment/first') {
			    bat 'mvn test'
		    }
		    }
	    }
       
        
        stage('Run') { 
            steps {
	    dir('C:/Users/SUBHA/assignment/first'){
                bat "java -cp target/classes com.mycompany.app.App 2"
            }
	    }
        }
        // Add more stages as needed
    }
}
