def call(Map config = [:]) {
    sh "echo Hello Tarik who is ${config.name}. Today is ${config.dayOfWeek}."
}
