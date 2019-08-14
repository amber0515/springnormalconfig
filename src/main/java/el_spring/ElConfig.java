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

@Configuration
@ComponentScan("el_spring")
//@PropertySource("classpath:el_spring/test.properties")
public class ElConfig {

    @Value("I Love You")
    String normal;

    @Value("#{systemProperties['os.name']}")
    String osName;

    @Value("#{ T(java.lang.Math).random() * 100.0}")
    double randomNumber;

    @Value("#{demoService.another}")
    String fromAnother;

//    @Value("el_spring/test.txt")
//    Resource testFile;

    @Value("http://www.baidu.com")
    Resource url;

//    @Value("${book.name}")
//    String bookName;

    @Autowired
    Environment environment;

    public static PropertySourcesPlaceholderConfigurer propertyConfig(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try{
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);

//            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(url.getInputStream()));
//            System.out.println(bookName);
//            System.out.println(environment.getProperty("book.author"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
