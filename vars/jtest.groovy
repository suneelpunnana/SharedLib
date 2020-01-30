 
import groovy.json.*

def jS = new JsonSlurper()
 def reader = new BufferedReader(new InputStreamReader(new FileInputStream("/var/lib/jenkins/workspace/${JOB_NAME}/sample.json"),"UTF-8"))
def data = jS.parse(reader)
j=data.ci.jobs.job.job_name
def sharedData = new Binding()
def shell = new GroovyShell(sharedData)
sharedData.setProperty('j',j)
 
 
 
 def call(){

println(j)


}