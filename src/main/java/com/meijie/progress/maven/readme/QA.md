1.使用阿里云镜像仓库 打开 maven 的配置文件（ windows 机器一般在 maven 安装目录的 conf/settings.xml ），在<mirrors></mirrors>标签中添加 mirror 子节点
https://maven.aliyun.com/mvn/guide
<mirror>
    <id>aliyunmaven</id>
    <mirrorOf>*</mirrorOf>
    <name>阿里云公共仓库</name>
    <url>https://maven.aliyun.com/repository/public</url>
</mirror>

2.package和install错误
Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project progress: Fatal error compiling
在maven添加
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.8.1</version>
    <configuration>
        <source>1.8</source>
        <target>1.8</target>
    </configuration>
</plugin>

3.org.springframework.boot最新版本号
https://repo.spring.io/plugins-release/org/springframework/boot/spring-boot-starter-parent/
