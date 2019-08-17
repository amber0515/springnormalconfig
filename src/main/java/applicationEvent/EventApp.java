package applicationEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EventConfig.class);

//        DemoEvent event = new DemoEvent("123123","1234123124");
//
//        DemoListener listener = new DemoListener();
//        listener.onApplicationEvent(event);

        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.publish("你好你好！");

        context.close();
    }
}
