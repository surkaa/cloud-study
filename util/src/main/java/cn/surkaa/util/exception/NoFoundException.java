package cn.surkaa.util.exception;


import cn.surkaa.util.CloudError;

/**
 * 未找到错误
 *
 * @author SurKaa
 * @date 2023/09/19
 */
public class NoFoundException extends CloudException {

    public NoFoundException(String message, int code, String description) {
        super(message, code, description);
    }

    public NoFoundException error(String description) {
        return new NoFoundException(
                CloudError.NO_FOUND.getMessage(),
                CloudError.NO_FOUND.getCode(),
                description
        );
    }

    public NoFoundException error() {
        return this.error("");
    }
}
