package org.delivery.api.common.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

//Token의 경우 2000번대 에러코드 사용


@Getter
@AllArgsConstructor
public enum TokenErrorCode implements ErrorCodeIfs{
    //첫번째는 인자는 표면적인 http status, 두번째 인자가 내부적으로 사용하는 에러코드
    INVALID_TOKEN(400, 2000, "유효하지 않은 토큰"),
    EXPIRED_TOKEN(400, 2001, "만료된 토큰"),
    TOKEN_EXCEPTION(400, 2002, "토큰 알수없는 에러")
    ;

    private final Integer httpStatusCode;
    private final Integer errorCode;
    private final String description;

}