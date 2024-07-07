package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {InvIsInMinMaxValidator.class})
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidInvIsInMinMax {
    String message() default "Inventory value isn't within the min/max range.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

