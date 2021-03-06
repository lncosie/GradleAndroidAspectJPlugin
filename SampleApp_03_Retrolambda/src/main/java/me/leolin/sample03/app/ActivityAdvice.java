package me.leolin.sample03.app;

import android.app.Activity;
import android.widget.TextView;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author leolin
 */
@Aspect
public class ActivityAdvice {

    @After("execution(* me.leolin.sample03.app.MainActivity.onCreate(..))")
    public void afterOnCreate(JoinPoint joinPoint){
        Activity activity= (Activity) joinPoint.getTarget();
        TextView textView = (TextView) activity.findViewById(R.id.textView);
        textView.setText("Hello AspectJ!");
    }
}
