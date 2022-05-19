def call() {
    withEnv(["SERVICE_DIRECTORY=scripts"]) {
        dir(SERVICE_DIRECTORY) {
                echo "$label"
                sh (
                  label: "$label",
                  script: '''#!/bin/bash
                    set -euxo pipefail
                    pwd
                    ls -la
                    echo "$SERVICE_DIRECTORY
                    git status
                  '''
                )
    }
}