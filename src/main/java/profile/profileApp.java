package profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class profileApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("dev");//设置profileType
        context.register(ProfileConfig.class);//注册配置类
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}
