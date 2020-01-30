def call(json){
def data = readJSON file: "${env.WORKSPACE}/${json}"
String j = data.ci.jobs.job.job_name
String j1=j.replace("[", "").replace("]", "");

def d=data.ci.jobs.job.dsl_fileName
String d1=d.replace("[", "").replace("]", "");


}