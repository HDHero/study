package com.test.designmodel.intercept;


import java.lang.annotation.*;

@Documented
@Inherited
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface  DataHandler {
    /**
     * bean的全类名
     * */
    String bean() default "";

    /**
     * 执行bean的方法
     * */
    String method () default "";

    /**
     * 执行方法的入参
     * */
    String params() default "";

    /**
     * 执行方法的入参类型
     * */
    String paramType () default "";

    /**
     * 执行方法后的返回类型
     * */
    String returnType() default "";

    /**
     * 标题
     * */
    String titile() default "";
}
