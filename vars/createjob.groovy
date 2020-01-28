
def call(){
curl -X GET http://example.com/job/pipe/config.xml -u admin:1166851f05c42cf7f533e59eac3819e43d -o mylocalconfig.xml
curl -s -XPOST 'http://3.134.110.122:8080/createItem?name="${jobname}"' -u admin:1166851f05c42cf7f533e59eac3819e43d --data-binary @mylocalconfig.xml -H "Content-Type:text/xml"
}