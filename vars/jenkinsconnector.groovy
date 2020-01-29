def call(jobname){
sh "curl -X POST http://admin:119767fb81f22e2f10d8594e4201717e53@18.217.178.163:8080/job/'${jobname}'/build"
}
