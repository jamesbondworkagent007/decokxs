package com.immomo.mls.utils;

/* JADX INFO: loaded from: classes3.dex */
public enum ERROR {
    FILE_NOT_FOUND(404, "fileNotFound"),
    FILE_UNKONWN(-1, "fileUnknown"),
    UNKNOWN_ERROR(-2, "unknownError"),
    PRELOAD_FAILED(-3, "preload file failed"),
    READ_FILE_FAILED(-4, "readFileFailed"),
    COMPILE_FAILED(-5, "compileFailed"),
    GLOBALS_DESTROY(-6, "globals is destroy"),
    TIMEOUT(-7, "timeout");

    int code;
    String msg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getCode() {
        return this.code;
    }

    ERROR(int i, String str) {
        this.code = i;
        this.msg = str;
    }
}
