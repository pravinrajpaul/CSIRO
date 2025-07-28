<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>uploadFile</name>
   <tag></tag>
   <elementGuidId>b8e7d69b-1bda-4dce-b5ca-aecb83fc1e4f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;additionalMetadata&quot;,
      &quot;value&quot;: &quot;&quot;,
      &quot;type&quot;: &quot;string&quot;,
      &quot;contentType&quot;: &quot;&quot;
    },
    {
      &quot;name&quot;: &quot;file&quot;,
      &quot;value&quot;: &quot;&quot;,
      &quot;type&quot;: &quot;file&quot;,
      &quot;contentType&quot;: &quot;&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>form-data</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>808e7fa4-623d-4626-a3a7-cf43fb57b5fc</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>multipart/form-data</value>
      <webElementGuid>86c65776-66d5-4004-8adb-51d71303cda2</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>10.2.2</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path>/pet/{petId}/uploadImage</path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://petstore.swagger.io/v2/pet/${petId}${/uploadImage}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>0d1c9c83-4a42-4e44-b309-9693f586c41f</id>
      <masked>false</masked>
      <name>petId</name>
   </variables>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
