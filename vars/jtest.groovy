def call(json){
def data = readJSON file: "${env.WORKSPACE}/json"
def j = data.ci.jobs.job.job_name
String j1=j.replace("[","");
String jenkins_jobname=j1.replace("]","");
def d=data.ci.jobs.job.dsl_fileName
String d1=d.replace("[","");
String dsl_fileName=d1.replace("[","");

}