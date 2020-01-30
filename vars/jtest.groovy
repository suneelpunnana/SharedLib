def call(){
def data = readJSON file: "${env.WORKSPACE}/sample.json"
def j = data.ci.jobs.job.job_name
println(j)
}