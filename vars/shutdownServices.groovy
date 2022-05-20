def call() {
    if ( params.BAJAR_PROCESOS == true ) {
        dir(SERVICE_DIRECTORY){
            echo "${SERVICE_DIRECTORY}"
            sh "ls ${DIR_WINDOWS}fk\\\\tasks"
            sh "python ${DIR_WINDOWS}fk\\\\tasks\\\\finalizar.py"
        }
    }
}