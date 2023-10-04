package com.valentyn.spring.my_test;

import com.valentyn.spring.my_test.quadrangles.Quadrangle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestWithJavaCodeCnfg {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Quadrangle figure = context.getBean("parallelogramBean", Quadrangle.class);
        Quadrangle figure2 = context.getBean("parallelogramBean", Quadrangle.class);

        figure.showInfoAboutFigure();
        figure2.showInfoAboutFigure();

        figure.findAngle();

        figure.showInfoAboutFigure();
        figure2.showInfoAboutFigure();

        context.close();
    }
}
