title expjmicro.helloworld.payment
java ^
-Xbootclasspath/a:%MAVEN_RESP_HOME%\org\javassist\javassist\3.24.0-GA\javassist-3.24.0-GA.jar ^
-javaagent:%MAVEN_RESP_HOME%\cn\jmicro\jmicro.agent\0.0.3-RELEASE\jmicro.agent-0.0.3-RELEASE.jar ^
-jar  %MAVEN_RESP_HOME%\cn\expjmicro\expjmicro.helloworld.payment\0.0.3-RELEASE\expjmicro.helloworld.payment-0.0.3-RELEASE-with-core.jar ^
-DsysLogLevel=2  -DclientId=25500 -DadminClientId=0  -Dlog4j.configuration=%JMICRO_DEMO_HOME%\log4j.xml -Dpwd=1