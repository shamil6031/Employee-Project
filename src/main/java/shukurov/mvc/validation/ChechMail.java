package shukurov.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy =  CheckMailValidator.class)
public @interface ChechMail {

    String value() default "shamil.com";
    String message() default "Must be ended with shamil.com";


    Class<?>[] groups() default {};
    Class<? extends Payload>[]payload() default {};
}
