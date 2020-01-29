def call(jobname,build_num){
sh "curl -s http://18.217.178.163:8080/job/'${jobname}'/'${build_num}'/api/json --user admin:119767fb81f22e2f10d8594e4201717e53"
}