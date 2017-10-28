package cloud.simple.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SampleController {

	@ResponseBody
    @RequestMapping(value = "/")
    String home() {   
        return "Hello World!";
    }
 
    public static void main(String[] args) throws Exception {
//        SpringApplication.run(SampleController.class, args);//http://localhost:8080/
        SpringApplication.run(SampleController.class, "--server.port=8081");//http://localhost:8081/
        
        
      /*  部署spring boot应用

      　　要部署运行spring boot应用，首选要打包spring boot应用，你在pom文件中看到的spring-boot-maven-plugin插件就是打包spring boot应用的。

      进入工程目录运行mvn package，如：

      　　D:\cloud-simple-helloword>mvn package

      　　打包过后就可以进入target目录使用java原生命令执行这个应用了。

      　　D:\cloud-simple-helloword\target>java -jar cloud-simple-helloword-0.0.1.jar --server.port=8081*/
    }
}
