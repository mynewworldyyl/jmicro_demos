# 构建
mvn clean install -Dmaven.test.skip=true

# 安装依赖
JMicro依赖ZK及Redis，为了方便入门的同学，我提供这两包的下载链接如下：
Windows版本Redis：
https://pan.baidu.com/s/13i7T1riw10zdqd5oYmJizQ 提取码：whrl

下载Redis后解压到任意目录，双击redis-server.exe文件即可启动单机版本Redis。
ZK：
https://pan.baidu.com/s/1MLYPLfjUAnkmp1JEjddPJw 提取码：t58p

下载后解到压任意目录，找到bin/zkServer.cmd文件,双击即可运行单机版ZK.

# 运行
java ^
-Xbootclasspath/a:%MAVEN_RESP_HOME%\org\javassist\javassist\3.24.0-GA\javassist-3.24.0-GA.jar ^
-javaagent:%MAVEN_RESP_HOME%\cn\jmicro\jmicro.agent\0.0.3-RELEASE\jmicro.agent-0.0.3-RELEASE.jar ^
-jar  %MAVEN_RESP_HOME%\cn\expjmicro\expjmicro.timeout.shop\0.0.3-RELEASE\expjmicro.timeout.shop-0.0.3-RELEASE-with-core.jar ^
-DsysLogLevel=2  -DclientId=25500 -DadminClientId=0  -Dlog4j.configuration=%JMICRO_DEMO_HOME%\log4j.xml -Dpwd=1

MAVEN_RESP_HOME表示我们本地maven仓库根目录，在系统环境变量中配置
JMICRO_DEMO_HOME表示源代码所在的根目录，在系统环境变量中配置

# 问题
如查启动出错：
1. 首先检查MAVEN_RESP_HOME和JMICRO_DEMO_HOME环境变量配置是否正确；
2. mvn clean install命令执行是否全部成功；
3. 在maven仓库下查找javassist-3.24.0-GA.jar，jmicro.agent-0.0.3-RELEASE.jar和expjmicro.timeout.shop-0.0.3-RELEASE-with-core.jar是否存在
4. Redis和ZK是否成功启动并正常可用
5. 欢迎联系 mynewworldyyl@gmail.com
6. 头条 JMicro作者

