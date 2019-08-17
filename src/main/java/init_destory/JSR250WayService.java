package init_destory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

    @PostConstruct//在构造函数中执行完后执行
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy//在Bean销毁前执行
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }
}
