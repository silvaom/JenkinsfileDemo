@Library('jenkins-shared-libraries') _

def data = readYaml(file: "config/pipeline.yaml")

pipeline {
  agent any 
  environment{
  //  INPUT_TAG=""
  //  DIR_WINDOWS=""
  //  SERVICE_DIRECTORY="python"
  //  WORKSPACE=""
      GITREPO=""
  }
  stages {
    stage('Checkout') {
      steps {
        checkout scm
        echo "There should be a step here"
        //script {def data = readYaml(file: "config/pipeline.yaml") }
        sh "echo ${data.GITREPO}"
      }
    }
    stage('Deploy')
      {
        steps {
          echo 'branch name ' + env.BRANCH_NAME
        }
      }
    stage('Feature') {
      when {
        branch 'Feature/'
      }
      steps {
        echo "Deploying to Dev environment after build"
        sh "pwd"
        sh "ls -la"
      }
    }
    stage('Release') {
      when {
        branch 'Release/'
      }
      steps 
        {
        echo "Deploying to Stage after build and Dev Deployment"
        sh "pwd"
        sh "ls -la"
        }
    }
    stage('master') {
      when {
        branch 'master'
      }
      steps 
        {
        echo "Deploying to PROD environment"
        }
    }
    stage('Printing') {
        steps {
        sh """
        pwd
        ls -la
        ls -la scripts
        chmod +x ./scripts/hello.sh
        echo "testing"
        ./scripts/hello.sh"""
      }
    }
  }
  post {
    always {
      deleteDir()
    }
  }
}