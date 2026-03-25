package com.osbcp.cssparser;

/* JADX INFO: loaded from: classes12.dex */
public class IncorrectFormatException extends Exception {
    private static final long serialVersionUID = 1;
    private final ErrorCode errorCode;

    public enum ErrorCode {
        FOUND_SEMICOLON_WHEN_READING_PROPERTY_NAME,
        FOUND_END_BRACKET_BEFORE_SEMICOLON,
        FOUND_COLON_WHEN_READING_SELECTOR_NAME,
        FOUND_COLON_WHILE_READING_VALUE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Replace access to removed values field (ENUM$VALUES) with 'values()' method */
        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ErrorCode[] valuesCustom() {
            ErrorCode[] errorCodeArrValuesCustom = values();
            int length = errorCodeArrValuesCustom.length;
            ErrorCode[] errorCodeArr = new ErrorCode[length];
            System.arraycopy(errorCodeArrValuesCustom, 0, errorCodeArr, 0, length);
            return errorCodeArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public IncorrectFormatException(ErrorCode errorCode, String str) {
        super(str);
        this.errorCode = errorCode;
    }
}
