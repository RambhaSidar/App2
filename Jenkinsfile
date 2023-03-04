node {
    stage('cloning git repo') {
        git branch: 'main', url:'https://github.com/RambhaSidar/App2.git''
        sh "chmod +x -R ./jenkins"
        sh "./jenkins/script/scripted_pipeline_ex_2.sh"
    }
}
