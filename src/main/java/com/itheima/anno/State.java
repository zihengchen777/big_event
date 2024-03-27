package com.itheima.anno;

import com.itheima.constant.MessageConstant;
import com.itheima.validation.StateValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Chen Ziheng
 * @Date: 2024/03/27/16:51
 * @Description:
 */
@Documented //元注解
@Target({ElementType.FIELD}) //元注解
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {StateValidation.class}) //指定提供校验规则的类
public @interface State {
    //提供校验失败后的提示信息
    String message() default MessageConstant.STATE_ERROR_MESSAGE;
    //指定分组
    Class<?>[] groups() default {};
    //负载 获取到state注解的附加信息
    Class<? extends Payload>[] payload() default {};
}
