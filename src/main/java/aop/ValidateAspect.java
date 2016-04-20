package aop;

import annotation.CheckParams;
import exception.AppException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * Created by liaomengge on 16/4/20.
 */
public class ValidateAspect {

    public void doBefore(JoinPoint joinPoint) throws Exception {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        if (method.isAnnotationPresent(CheckParams.class)) {
            Object[] params = joinPoint.getArgs();
            for (Object param : params) {
                if (param instanceof RequestParam) {
                    if ("lmg".equals(((RequestParam) param).getName())) {
                        throw new AppException("app.001", "check params[{0}:{1}] failed", "name", "lmg");
                    }
                }
            }
        }
    }
}
