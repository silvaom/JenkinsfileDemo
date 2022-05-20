def call() {
    sh (
        script: '''#!/bin/bash
          set -euxo pipefail
          git status
          git clone "$GITREPO" 
          git checkout "$BRANCH"
        '''
    )
}
