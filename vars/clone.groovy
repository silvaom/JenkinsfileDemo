def call() {
        sh '''
          echo "${env.GITREPO}"
          echo "${env.BRANCH}"
          git status
          git clone "${params.GITREPO}"
          git checkout "${params.BRANCH}"
        '''
}