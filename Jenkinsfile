node {
    def WORKSPACE = "/var/lib/jenkins/workspace/some-jenkins"
    def dockerImageTag = "some-jenkins{env.BUILD_NUMBER}"

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
        echo "Complete comand docker stop some-jenkins || true && docker rm some-jenkins || true"
        sh "docker stop some-jenkins || true && docker rm some-jenkins || true"
        echo "Complete comand docker run --name some-jenkins -d -p 8000:8080 some-jenkins:${env.BUILD_NUMBER}"
        sh "docker run --name some-jenkins -d -p 8000:8080 some-jenkins:${env.BUILD_NUMBER}"
    }
    }catch(e){
        throw e.getMessage
    }
}