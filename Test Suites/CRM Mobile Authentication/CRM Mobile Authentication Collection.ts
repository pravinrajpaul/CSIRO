<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>CRM Mobile Authentication Collection</name>
   <tag></tag>
   <delayBetweenInstances>0</delayBetweenInstances>
   <executionMode>PARALLEL</executionMode>
   <maxConcurrentInstances>2</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Custom</groupName>
            <profileName>SIT</profileName>
            <requireConfigurationData>false</requireConfigurationData>
            <runConfigurationId>chrome_debug</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/CRM Mobile Authentication/CRM Open in Web Browser</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Mobile</groupName>
            <profileName>SIT</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>deviceName</key>
                  <value>samsung SM-S908E (Android 15)</value>
               </entry>
               <entry>
                  <key>deviceId</key>
                  <value>RZCW10NQHCE</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>Android</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/CRM Mobile Authentication/CRM Authenticate from Mobile</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
