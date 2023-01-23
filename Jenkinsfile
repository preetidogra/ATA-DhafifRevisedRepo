pipeline{

	agent any
	stages{
	stage('Checkout code') {
        	steps {
		// Get some code from a GitHub repository
    	checkout([$class: 'GitSCM',
        branches: [[name: '*/main']],
        extensions: [[$class: 'CloneOption', timeout: 120]],
        gitTool: 'Default', 
        userRemoteConfigs: [[url: 'https://github.com/preetidogra/ATA-DhafifRevisedRepo']]
    ])
           	checkout scm
        }
    }
	stage("Compile stage"){
		steps{
		// Get some code from a GitHub repository
    		checkout([$class: 'GitSCM',
       		branches: [[name: '*/main']],
        	extensions: [[$class: 'CloneOption', timeout: 120]],
        	gitTool: 'Default', 
        	userRemoteConfigs: [[url: 'https://github.com/preetidogra/ATA-DhafifRevisedRepo']]
    		])
		withMaven(maven: 'maven_3_8_6') {
                    sh 'mvn clean install'
		 }}}
			  
	stage("Test stage"){
		steps{
			// Get some code from a GitHub repository
    		checkout([$class: 'GitSCM',
        	branches: [[name: '*/main']],
       		extensions: [[$class: 'CloneOption', timeout: 120]],
        	gitTool: 'Default', 
        	userRemoteConfigs: [[url: 'https://github.com/dhkad/ATA.git']]
   		 ])
		withMaven(maven: 'maven_3_8_6'){
		sh'mvn test'}}}
			  
	stage("Cucumber Report"){
		steps{
			// Get some code from a GitHub repository
    		checkout([$class: 'GitSCM',
        	branches: [[name: '*/main']],
        	extensions: [[$class: 'CloneOption', timeout: 120]],
        	gitTool: 'Default', 
        	userRemoteConfigs: [[url: 'https://github.com/preetidogra/ATA-DhafifRevisedRepo']]
			 ]) 
		cucumber buildStatus: "UNSTABLE",
		fileIncludePattern: "**/reports.json",
                jsonReportDirectory: 'target'}}

}

}
