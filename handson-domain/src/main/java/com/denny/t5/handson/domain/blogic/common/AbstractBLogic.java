package com.denny.t5.handson.domain.blogic.common;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public abstract class AbstractBLogic<I, O> implements BLogic<I, O> {

    public O execute(I input){
        try{

            // omitted

            // (3)
            preExecute(input);

            // (4)
            O output = doExecute(input);

            // omitted

            return output;
        } finally {
            // omitted
        }

    }

    protected abstract void preExecute(I input);

    protected abstract O doExecute(I input);

}