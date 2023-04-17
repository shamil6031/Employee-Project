package shukurov.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckMailValidator implements ConstraintValidator <ChechMail,String>{

    private String endMail;

    @Override
    public void initialize(ChechMail constraintAnnotation) {
       endMail = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.endsWith(endMail);
    }
}
