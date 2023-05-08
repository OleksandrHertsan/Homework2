import java.lang.annotation.Annotation;

public class Reflection {
    public static void main(String[] args) {
        Class cls = Person.class;
        Annotation[] annotations = cls.getAnnotations();

        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
