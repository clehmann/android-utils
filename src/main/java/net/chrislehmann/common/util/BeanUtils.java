package net.chrislehmann.common.util;


public class BeanUtils {

    public static <T> T createInstance(Class<T> klass){
        try {
            return klass.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException("Error creating class " + klass.getCanonicalName(), e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Error creating class " + klass.getCanonicalName(), e);
        }
    }
}
