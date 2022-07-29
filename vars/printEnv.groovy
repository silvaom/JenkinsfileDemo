def call(){
  timeout(time: 1, unit: 'MINUTES') {
    String label = 'Environment'
    sh (
      label: "$label",
      script: '''#!/bin/bash
        set -euxo pipefail
        env | sort
      '''
    )
  }
}