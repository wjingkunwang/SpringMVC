package aop;

import org.springframework.stereotype.Service;

/**
 * Created by wjk on 16/10/27.
 */
@Service

public class ServiceA {

    public void methodA() {
        System.out.println("A");
        methodB();
    }

    protected void methodB() {
        System.out.println("B");
    }

    protected void methodC() {
        System.out.println("C");
    }
}