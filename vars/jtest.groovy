def call(json){
def data = readJSON file: "${env.WORKSPACE}/${json}"
String j = data.ci.jobs.job.job_name
String j1=j.replaceAll("[","");
String jenkins_jobname=j1.replaceAll("]","");
def d=data.ci.jobs.job.dsl_fileName
String d1=d.replaceAll("[","");
String dsl_fileName=d1.replaceAll("[","");

}