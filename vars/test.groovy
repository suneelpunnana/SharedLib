def call(){
curl -s -XPOST 'http://3.134.110.122:8080/createItem?name=job' -u admin:1166851f05c42cf7f533e59eac3819e43d --data-binary @Test.xml -H "Content-Type:text/xml"
}