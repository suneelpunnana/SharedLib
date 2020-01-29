def call(groovy_file){
sh 'curl -O https://repo.jenkins-ci.org/public/org/jenkins-ci/plugins/job-dsl-core/1.76/job-dsl-core-1.76-standalone.jar'
sh 'java -jar job-dsl-core-1.76-standalone.jar "${groovy_file}"'
}