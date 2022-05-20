def call() {
    sh (
        script: '''#!/bin/bash
          set -euxo pipefail
          echo "$GITREPO"
          echo "$BRANCH"
          git status
          git clone "$GITREPO" 
          git checkout "$BRANCH"
        '''
    )
}
