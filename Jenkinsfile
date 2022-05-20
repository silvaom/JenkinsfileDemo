@Library('jenkins-shared-libraries') _

node
  {
  environment{
    INPUT_TAG=""
    GITREPO="https://github.com/silvaom/JenkinsfileDemo.git"
    BRANCH="Feature/library"
  }
  stage('checkout')
    {
    //checkout scm
    }
  stage('deploy')
    {
    echo 'branch name ' + env.BRANCH_NAME
    
    if (env.BRANCH_NAME.startsWith("Feature/"))
      {
      echo "Deploying to Dev environment after build"
      sh "pwd"
      sh "ls -la"
      }
      
    else if (env.BRANCH_NAME.startsWith("Release/"))
      {
      echo "Deploying to Stage after build and Dev Deployment"
      sh "pwd"
      sh "ls -la"
      }
      
    else if (env.BRANCH_NAME.startsWith("master"))
      {
      echo "Deploying to PROD environment"
      }
      
    sh """
    pwd
    ls -la
    ls -la scripts
    chmod +x ./scripts/hello.sh 
    ./scripts/hello.sh"""
    }
}