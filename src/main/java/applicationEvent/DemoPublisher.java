package applicationEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;//注入context用来发布事件

    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
