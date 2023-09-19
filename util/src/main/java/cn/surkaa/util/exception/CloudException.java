package cn.surkaa.util.exception;

import lombok.Getter;

/**
 * 统一的错误类型
 *
 * @author SurKaa
 */
@Getter
public class CloudException extends RuntimeException {

    private final int code;
    private final String description;

    public CloudException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

}
