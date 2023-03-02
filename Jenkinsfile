node {
    def WORKSPACE = "/var/lib/jenkins/workspace/some-jenkins"
    def dockerImageTag = "some-jenkins:${env.BUILD_NUMBER}"

    try{
    stage('Clone Repo') {
         git url: 'https://github.com/bekone97/some-jenkins',
         credentialsId: 'springdeploy-user',
         branch: 'main'
        }
    stage('Build docker') {
        dockerImage = docker.build("some-jenkins:${env.BUILD_NUMBER}")
    }

    stage('Deploy docker'){
        echo "Docker Image Tag Name Some jenkins: ${dockerImageTag}"
        try{
            bat "docker stop some-jenkins"
            bat "docker rm some-jenkins"
            }catch(exc){
            echo exc
            }
        bat "docker run --name some-jenkins -d -p 8000:8000 some-jenkins:${env.BUILD_NUMBER}"
    }
    }catch(e){
        echo e
        throw e
    }
}