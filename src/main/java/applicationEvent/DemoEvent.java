package applicationEvent;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

@Data
public class DemoEvent extends ApplicationEvent {

    String msg;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DemoEvent(Object source) {
        super(source);
    }

    public DemoEvent(Object source, String msg){
        super(source);
        this.msg = msg;
    }
}
