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

    USER_NOT_FOUND(6001,"未找到此用户");

    private int code;
    private String message;
}
