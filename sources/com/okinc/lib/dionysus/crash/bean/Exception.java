package com.okinc.lib.dionysus.crash.bean;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class Exception {
    private List<StackFrame> frames = new ArrayList();
    private List<Exception> innerExceptions = new ArrayList();
    private String message;
    private String minidumpFilePath;
    private String stackTrace;
    private String type;
    private String wrapperSdkName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<StackFrame> getFrames() {
        return this.frames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<Exception> getInnerExceptions() {
        return this.innerExceptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMinidumpFilePath() {
        return this.minidumpFilePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getStackTrace() {
        return this.stackTrace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getWrapperSdkName() {
        return this.wrapperSdkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFrames(List<StackFrame> list) {
        this.frames = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setInnerExceptions(List<Exception> list) {
        this.innerExceptions = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMessage(String str) {
        this.message = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMinidumpFilePath(String str) {
        this.minidumpFilePath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setStackTrace(String str) {
        this.stackTrace = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setWrapperSdkName(String str) {
        this.wrapperSdkName = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Exception exception = (Exception) obj;
        String str = this.type;
        if (str == null ? exception.type != null : !str.equals(exception.type)) {
            return false;
        }
        String str2 = this.message;
        if (str2 == null ? exception.message != null : !str2.equals(exception.message)) {
            return false;
        }
        String str3 = this.stackTrace;
        if (str3 == null ? exception.stackTrace != null : !str3.equals(exception.stackTrace)) {
            return false;
        }
        List<StackFrame> list = this.frames;
        if (list == null ? exception.frames != null : !list.equals(exception.frames)) {
            return false;
        }
        List<Exception> list2 = this.innerExceptions;
        if (list2 == null ? exception.innerExceptions != null : !list2.equals(exception.innerExceptions)) {
            return false;
        }
        String str4 = this.wrapperSdkName;
        if (str4 == null ? exception.wrapperSdkName != null : !str4.equals(exception.wrapperSdkName)) {
            return false;
        }
        String str5 = this.minidumpFilePath;
        String str6 = exception.minidumpFilePath;
        return str5 != null ? str5.equals(str6) : str6 == null;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.message;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.stackTrace;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        List<StackFrame> list = this.frames;
        int iHashCode4 = list != null ? list.hashCode() : 0;
        List<Exception> list2 = this.innerExceptions;
        int iHashCode5 = list2 != null ? list2.hashCode() : 0;
        String str4 = this.wrapperSdkName;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.minidumpFilePath;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }
}
