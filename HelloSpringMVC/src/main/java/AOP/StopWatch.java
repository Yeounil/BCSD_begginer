package AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class StopWatch {          //메소드 시간 측정용도의 AOP
    @Around("execution(* controller.HelloController..*(..))")   //메소드 실행시점과 관계없이 controller.HelloController.java 에 있는 모든 메소드에 해당
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {   //AOP 실행
        long beingStopWatch = System.currentTimeMillis();   //메소드 시작 시각 저장
        System.out.println("Start : " + beingStopWatch);  //시작 시각 출력
        try {
            return joinPoint.proceed();            //메소드 실행을 Inline으로 표현
        }finally {
            long afterStopWatch = System.currentTimeMillis();
            System.out.println("End : " + afterStopWatch + ", Time : " + (afterStopWatch - beingStopWatch) + "ms"); //종료 시각과 실행 시간 출력
        }


        }
    }



