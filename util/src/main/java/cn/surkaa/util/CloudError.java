package cn.surkaa.util;

import lombok.Getter;

/**
 * @author SurKaa
 */
@Getter
public enum CloudError {

    SYSTEM_ERROR(-1, "服务器故障, 请联系开发者修复"),
    SUCCESS(0, "成功"),
    NO_FOUND(1, "未找到");

    private final int code;
    private final String message;

    CloudError(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
