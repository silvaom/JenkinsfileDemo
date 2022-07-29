@Library('jenkins-shared-libraries') _

pipeline {
  agent any 
  environment{
      CONFIG_DIR="develop"
      ENV="test"
  }
  stages {
    stage('Reading env variables') {
      steps {
        echo "There should be a step here"
        script {
          load "./config/${CONFIG_DIR}.yaml"
          load "./config/${ENV}.yaml"
        }
      GITREPO=""
  }
  stages {
    stage('Checkout') {
      steps {
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
        echo "argument variables are not passed to bash script, unless specified when you call the script"
        echo "like this ./scripts/story.sh ${HERO} ${TREASURES} ${ENEMY}"
        pwd
        ls -la
        ls -la scripts
        chmod +x ./scripts/story.sh
        ./scripts/story.sh"""
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
