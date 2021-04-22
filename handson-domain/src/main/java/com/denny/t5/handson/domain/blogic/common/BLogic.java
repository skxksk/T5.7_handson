package com.denny.t5.handson.domain.blogic.common;

public interface BLogic<I, O> {
    O execute(I input);
}