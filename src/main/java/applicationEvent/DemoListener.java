package applicationEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component//被配置类扫描，就不需要实例化
public class DemoListener implements ApplicationListener<DemoEvent> {
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();

        System.out.println("demoListener 收到了 demoPublisher 发布的消息：" + msg);
    }
}
