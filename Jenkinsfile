pipeline {
    agent any
    tools{
        maven 'MAVEN_HOME'
        jdk 'JAVA_HOME'
    }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Clone project And Build'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/RambhaSidar/App2.git']])
                bat 'mvn clean install'
            }
        }
       stage('Build Docker image'){
           steps{
               script{
                   bat 'docker build -t rambhasidar/app .'
               }
           }
       }
       stage('Push image to DockerHub'){
           steps{
               script{
                   bat 'docker login -u rambhasidar -p dckr_pat_2-uMfhgJZlngZBXwZHYDDWrfvdw'
                    bat 'docker push rambhasidar/app'
               }
           }
       }
    }
}
