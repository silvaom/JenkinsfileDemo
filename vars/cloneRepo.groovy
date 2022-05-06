def call(){
    withEnv([SERVICE_DIRECTORY = "~/apps/jenkins/workspace/"]) {
    dir(SERVICE_DIRECTORY) {
    printEnv()
    echo"Cloning repo..."
    checkout scm
    }
}