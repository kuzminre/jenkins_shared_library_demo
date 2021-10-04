void call(String procName) {
    String label = "Killing ${procName}"
    if ( isUnix() ) {
        sh  returnStatus: true,
            label: label,
            script: "killall ${procName}"
    } else {
        bat returnStatus: true,
            label: label,
            script: "taskkill /F /IM ${procName} /T"
    }
}
