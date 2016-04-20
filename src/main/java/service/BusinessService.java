package service;

import annotation.CheckParams;
import aop.RequestParam;
import org.springframework.stereotype.Component;

/**
 * Created by liaomengge on 16/4/20.
 */
@Component("businessService")
public class BusinessService {

    @CheckParams
    public void doHandle(RequestParam params) {
        System.out.println("print : " + params.toString());
    }
}
