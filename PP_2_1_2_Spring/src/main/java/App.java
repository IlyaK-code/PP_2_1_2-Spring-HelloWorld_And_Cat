import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanW =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat bean2 = (Cat) applicationContext.getBean("cat");
        Cat beanC = applicationContext.getBean("cat", Cat.class);
        System.out.println(bean2.getMessage());
        System.out.println(beanC.getMessage());
        System.out.println(bean == beanW);
        System.out.println(bean2 == beanC);
    }
}