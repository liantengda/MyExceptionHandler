package com.lian.javareflect.constant;

import com.lian.javareflect.common.core.exception.assertion.BusinessExceptionAssert;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Ted
 * @version 1.0
 * @date 2020/5/4 13:45
 */
@Getter
@AllArgsConstructor
public enum UserEnum implements BusinessExceptionAssert {

    USER_NOT_FOUND(6001,"未找到此用户"),
    USER_ALREDY_DELETED(6002,"用户已经被删除"),
    USER_ALREDY_EXIST(6003,"已注册用户，不可再次注册");
    private int code;
    private String message;
}
