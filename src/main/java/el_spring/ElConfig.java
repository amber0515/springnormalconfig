package el_spring;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * value注入properties文件说明：
 * 1、
 */

@Configuration
@ComponentScan("el_spring")
@PropertySource("classpath:/test.properties")
public class ElConfig {

    @Value("I Love You")
    String normal;

    @Value("#{systemProperties['os.name']}")
    String osName;

    @Value("#{ T(java.lang.Math).random() * 100.0}")
    double randomNumber;

    @Value("#{demoService.another}")//其他bean中的属性
    String fromAnother;

    @Value("test.txt")
    Resource testFile;

    @Value("http://www.baidu.com")//读取html文本
    Resource url;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    Environment environment;

//    public ElConfig(@Value("${book.name}") String bookName){
//        this.bookName =bookName;
//    }

    public static PropertySourcesPlaceholderConfigurer propertyConfig(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try{
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);

            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(url.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
