def call(json){
def data = readJSON file: "${env.WORKSPACE}/${json}"
String j = data.ci.jobs.job.job_name
String jenkins_jobname=j.replaceAll("\\[", "").replaceAll("\\]","");
println(jenkins_jobname)
String d=data.ci.jobs.job.dsl_fileName
String dsl_filename=d.replaceAll("\\[", "").replaceAll("\\]","");
println(dsl_filename)
environment {
                JENKINS_NAME = jenkins_jobname
            }
}