def call(dsl,jobname){
println(dsl)

sh 'curl -O https://repo.jenkins-ci.org/public/org/jenkins-ci/plugins/job-dsl-core/1.76/job-dsl-core-1.76-standalone.jar'

sh 'java -jar job-dsl-core-1.76-standalone.jar ${dsl}'
url="http://18.217.178.163:8080/createItem?name="+jobname
echo "$url"
sh 'curl -s -XPOST --url "${url}" -u admin:119767fb81f22e2f10d8594e4201717e53 --data-binary @Test.xml -H Content-Type:text/xml'
}