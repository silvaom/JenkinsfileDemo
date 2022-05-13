def call(srv_dir){
    printEnv()
    withEnv(["SERVICE_DIRECTORY=$srv_dir"]) {
        dir("$SERVICE_DIRECTORY") {
        printEnv()
        echo"Cloning repo..."
        checkout scm
            }
        }
}