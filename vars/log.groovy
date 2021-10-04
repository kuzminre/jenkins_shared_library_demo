void call(String msg, String level = 'INFO') {
    println("${level}: ${msg}")
}

void warn(String msg) {
    call(msg, 'WARNING')
}

void info(String msg) {
    call(msg, 'INFO')
}

void debug(String msg) {
    call(msg, 'DEBUG')
}
