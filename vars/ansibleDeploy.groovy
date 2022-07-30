def call(Map config = [:]){
	sh "ansible -m ${config.func} ${config.hosts}"
}
