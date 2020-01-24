def call(){

sh 'curl -X GET http://"${url}"/api/json?pretty=true --user "${username}"'

}