pipeline{
    agent any
    stages{
        stage("clone code to jenkins mechine"){
            steps{
                println "Here I'm clonig the code"
            }
        }
        stage('Build code'){
            steps{
                println "Here I'm building the code using -- mvn clean package"

            }
        }
        stage("upload artifacts"){
            steps{
                println "Here  I,m uploading artifacts to -S3 bucket"
            }
        }
        stage("Deployment"){
            steps{
                println "Here I'm deploying the code to tomcat servers"
            }
        }
    }
}