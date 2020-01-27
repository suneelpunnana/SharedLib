def props = readJSON file: './sample.json '
def jobname=props.ci.jobs.job.job_name
println(jobname) 