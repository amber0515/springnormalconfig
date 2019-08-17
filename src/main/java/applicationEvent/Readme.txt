application event为bean和bean之间消息通信提供支持。
比如，监听。
1、自定义事件，继承ApplicationEvent。
2、定义事件监听器，实现ApplicationListener。
3、使用容器，触发事件。（注入ApplicationContext，使用publisher发布事件）