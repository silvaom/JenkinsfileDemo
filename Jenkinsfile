@Library('jenkins-shared-libraries') _

pipeline {
  //environment{
  //  INPUT_TAG=""
  //  DIR_WINDOWS=""
  //  SERVICE_DIRECTORY="python"
  //  WORKSPACE=""
  //}
  stages {
    stage('checkout') {
      steps {
        checkout scm
      }
    }
    stage('deploy')
      {
        steps {
          echo 'branch name ' + env.BRANCH_NAME
        }
      }
      when {
        branch 'Feature/'
      }
      steps {
        echo "Deploying to Dev environment after build"
        sh "pwd"
        sh "ls -la"
      }
      when {
        branch 'Release/'
      }
      steps 
        {
        echo "Deploying to Stage after build and Dev Deployment"
        sh "pwd"
        sh "ls -la"
        }
        
      when {
        branch 'master'
      }
      steps 
        {
        echo "Deploying to PROD environment"
        }
      stage('Printing') {
        steps {
        sh """
        pwd
        ls -la
        ls -la scripts
        chmod +x ./scripts/hello.sh 
        ./scripts/hello.sh"""
      }
    }
  }
}