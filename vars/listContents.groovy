def call() {
    withEnv(["SERVICE_DIRECTORY=scripts"]) {
        dir(SERVICE_DIRECTORY) {
                sh (
                  script: '''#!/bin/bash
                    set -euxo pipefail
                    pwd
                    ls -la
                    echo "$SERVICE_DIRECTORY"
                  '''
                )
          }
      }
}