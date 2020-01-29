curl -O https://repo.jenkins-ci.org/public/org/jenkins-ci/plugins/job-dsl-core/1.76/job-dsl-core-1.76-standalone.jar
java -jar job-dsl-core-1.76-standalone.jar $0
curl -s -XPOST  $1 -u admin:119767fb81f22e2f10d8594e4201717e53 --data-binary @Test.xml -H Content-Type:text/xml