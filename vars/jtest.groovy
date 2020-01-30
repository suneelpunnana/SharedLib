def call(){
def data = readJSON "${env.WORKSPACE}\\sample.json"
def j = data.ci.jobs.job.job_name

}