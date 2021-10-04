class UsefulClass implements Serializable {

    Script script

    UsefulClass(Script script) {
        this.script = script
    }

    void echoDateTime() {
        script.sh 'date'
    }

    void call() {
        script.echo 'Echo from "call" method'
    }

}
