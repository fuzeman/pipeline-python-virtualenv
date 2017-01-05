package net.dgardiner.python;

def create(options=''){
    env.WORKSPACE = pwd().trim()

    sh "virtualenv ${options} ${env.WORKSPACE}/.virtualenv"
}

def run(command){
    sh "vex --path=${env.WORKSPACE}/.virtualenv ${command}"
}
