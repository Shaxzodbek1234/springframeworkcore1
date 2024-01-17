package uz.pdp.lessons.springframeworkcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Shaxzod Muqimov, ${DAY_NAME_SHORT} ${TIME}. ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.hi());
    }
}