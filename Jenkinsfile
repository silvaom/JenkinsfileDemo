@Library('jenkins-shared-libraries') _

pipeline {
  agent any 
  environment{
  //  env variables 
  //  will be set
  //  using 
  //  different 
  //  files
    CONFIG_DIR="develop"
  }
  stages {
    stage('Checkout') {
      steps {
        checkout scm
        echo "There should be a step here"
        script {
          load "./config/${CONFIG_DIR}.yaml"
          sh "echo $DIR_WINDOWS"
        }
        sh "echo $DIR_WINDOWS"
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
        echo "$DIR_WINDOWS"
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