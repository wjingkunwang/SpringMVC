package aop;

import org.apache.avalon.framework.service.ServiceException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;


@Aspect
@Service
public class LogAspect {

    /**
     * Pointcut
     * 定义Pointcut，Pointcut的名称为aspectjMethod()，此方法没有返回值和参数
     * 该方法就是一个标识，不进行调用
     */
    @Pointcut("execution(* aop.ServiceA.*(..))")
    private void aspectjMethod() {
    }

    @Around(value = "aspectjMethod()")
    public void aroundAdvice(ProceedingJoinPoint pjp) throws ServiceException {

        try {
            System.out.println("记录日志开始!!!!");
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}