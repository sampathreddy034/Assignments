package assignment7;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.LOCAL_VARIABLE,ElementType.CONSTRUCTOR,ElementType.TYPE,ElementType.METHOD})
@interface Info{
int authorid() default 0 ;
String date() default "00-00-0000";
String time() default "00:00";
int version() default 0;
}
@Info(
authorid=1,
date="15-10-2019",
time="11:2",
version=07
)
class developers{
}
public class assignment7_2 {

 public static void main(String[] args) {
Class<developers>obj=developers.class;
Annotation[] annotations=obj.getAnnotations();
for(Annotation annotation:annotations) {
System.out.println(annotation);
}
}

}