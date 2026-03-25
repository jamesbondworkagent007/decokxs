package com.okinc.lib.dionysus.crash.bean;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class StackFrame {
    private static final String CLASS_NAME = "className";
    private static final String FILE_NAME = "fileName";
    private static final String LINE_NUMBER = "lineNumber";
    private static final String METHOD_NAME = "methodName";
    private String className;
    private String fileName;
    private Integer lineNumber = 0;
    private String methodName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getClassName() {
        return this.className;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFileName() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer getLineNumber() {
        return this.lineNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMethodName() {
        return this.methodName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setClassName(String str) {
        this.className = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFileName(String str) {
        this.fileName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLineNumber(Integer num) {
        this.lineNumber = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMethodName(String str) {
        this.methodName = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StackFrame stackFrame = (StackFrame) obj;
        if (Objects.equals(this.className, stackFrame.className) && Objects.equals(this.methodName, stackFrame.methodName) && Objects.equals(this.lineNumber, stackFrame.lineNumber)) {
            return Objects.equals(this.fileName, stackFrame.fileName);
        }
        return false;
    }

    public int hashCode() {
        String str = this.className;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.methodName;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        Integer num = this.lineNumber;
        int iHashCode3 = num != null ? num.hashCode() : 0;
        String str3 = this.fileName;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean isNativeMethod() {
        return this.lineNumber.intValue() == -2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClassName());
        sb.append(JwtUtilsKt.JWT_DELIMITER);
        sb.append(this.methodName);
        if (isNativeMethod()) {
            sb.append("(Native Method)");
        } else if (this.fileName != null) {
            if (this.lineNumber.intValue() >= 0) {
                sb.append("(");
                sb.append(this.fileName);
                sb.append(":");
                sb.append(this.lineNumber);
                sb.append(")");
            } else {
                sb.append("(");
                sb.append(this.fileName);
                sb.append(")");
            }
        } else if (this.lineNumber.intValue() >= 0) {
            sb.append("(Unknown Source:");
            sb.append(this.lineNumber);
            sb.append(")");
        } else {
            sb.append("(Unknown Source)");
        }
        return sb.toString();
    }
}
