def call(jsondata){
def jsonString = jsondata
def jsonObj = readJSON text: jsonString
String a=jsonObj.ci.jobs.job.job_name
String jobname=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.ci.jobs.job.dsl_fileName
String dslfilename=b.replaceAll("\\[", "").replaceAll("\\]","");
env.DSL_NAME = dslfilename
env.JENKINS_NAME = jobname
}