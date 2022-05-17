package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class StopWatch {          //메소드 시간 측정용도의 AOP
    @Around("execution(* controller.HelloController..*(..))")   //메소드 실행시점과 관계없이 controller.HelloController.java 에 있는 모든 메소드에 해당
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {   //AOP 실행
        //AOP가 실행되었음을 알린다.
        System.out.println("Execution Time check");
        try {
            //메소드 실행 이전 시간 기록
            long beforeExecutionTime = System.currentTimeMillis();
            //메소드 실행
            Object ret = joinPoint.proceed();
            //메소드 실행 이후 시간 기록
            long afterExecutionTime = System.currentTimeMillis();
            //메소드 이름을 출력한다.
            //두 시간 차이를 출력한다.
            System.out.println(joinPoint.getSignature().toString() + ", Execution time : " + (afterExecutionTime - beforeExecutionTime) + "ms");
            return ret;
        } catch (Throwable throwable) {
            //예외인 경우 출력하고, 넘긴다.
            System.out.println("At Execution Time, Throwable: " + throwable.getMessage());
            throw throwable;
        }
    }
}
