import org.codehaus.groovy.runtime.InvokerHelper

class Nested extends Script {
    def run() {
        def NAME_LENGTH = JOB_BASE_NAME.length()
        def FOLDER_PATH = JOB_NAME[0..((JOB_NAME.length() - NAME_LENGTH) - 2)]

        job("${FOLDER_PATH}/Here there be dragons") {

        }
    }

    static void main (String[] args) {
        InvokerHelper.runScript(Nested, args)
    }

}