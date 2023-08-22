package ru.philimonov.springcourse.reflect.context;

import java.util.HashMap;
import java.util.Map;

public class AnnotationAppContext implements ApplicationContext {
    private Map<String, Object> mapOfBeans = new HashMap<>();

    public AnnotationAppContext(Class... classes) throws InstantiationException, IllegalAccessException {
        for (Class aClass : classes) {
            if (aClass.isAnnotationPresent(Component.class)) {
                System.out.println("we are creating bean");

                Object houseObj = aClass.newInstance();
                Component annotation = (Component) aClass.getAnnotation(Component.class);
                String nameOfCurrentBean = annotation.name();

                mapOfBeans.put(nameOfCurrentBean, houseObj);

                System.out.println("bean was created");
            }
        }
    }

    @Override
    public Object getBean(String name) {
        return mapOfBeans.get(name);
    }
}
