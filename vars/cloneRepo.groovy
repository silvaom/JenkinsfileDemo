def call(){
    dir(SERVICE_DIRECTORY) {
    printEnv()
    echo"Cloning repo..."
    checkout scm
    }
}