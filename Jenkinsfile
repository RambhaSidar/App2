pipeline{
    agent any
    tools{
        maven "MAVEN_HOME"
    }
    stages{
          stage('Clone Code'){
            steps{
            checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/RambhaSidar/App2.git']])  
                   }
        }   
        stage('Build Maven'){
            steps{
                 bat 'mvn clean install -f App2/pom.xml'
            }
        }
    }
}