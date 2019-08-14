package el_spring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Data
public class DemoService {

    @Value("其他类的属性")//注入普通的字符串
    String another;

}
