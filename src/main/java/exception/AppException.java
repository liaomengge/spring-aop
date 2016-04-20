package exception;

import java.text.MessageFormat;

/**
 * Created by liaomengge on 16/4/20.
 */
public class AppException extends Exception {
    private String code;
    private String[] params;
    private String msg;

    public AppException(String code, String message) {
        super(message);
        this.code = code;
        this.msg = message;
    }

    public AppException(String code, String message, String... params) {
        this.code = code;
        this.msg = MessageFormat.format(message, params);
    }

    public AppException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.msg = message;
    }
}
