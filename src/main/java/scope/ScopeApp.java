package scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeApp {

    public static void main(String[] args) {
        //作为spring容器，接收配置类输入
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        System.out.println("s" + s1.equals(s2));
        System.out.println("p" + p1.equals(p2));

        context.close();
    }
}
