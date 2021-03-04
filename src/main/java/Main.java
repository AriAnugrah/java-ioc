import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception, BeansException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Ari ari = context.getBean(Ari.class);

        ari.add("Bark");

    }
}
