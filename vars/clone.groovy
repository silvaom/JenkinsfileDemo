def call(Map params) {
        sh '''
          #!/bin/bash
          set -eux pipefail
          echo "${params.GITREPO}"
          echo "${params.BRANCH}"
          git status
          git clone "${params.GITREPO}" 
          git checkout "${params.BRANCH}"
        '''
}