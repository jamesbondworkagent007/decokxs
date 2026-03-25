package com.ibm.icu.util;

/* JADX INFO: loaded from: classes22.dex */
public class IllformedLocaleException extends RuntimeException {
    private static final long serialVersionUID = 1;
    private int _errIdx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getErrorIndex() {
        return this._errIdx;
    }

    public IllformedLocaleException() {
        this._errIdx = -1;
    }

    public IllformedLocaleException(String str) {
        super(str);
        this._errIdx = -1;
    }

    public IllformedLocaleException(String str, int i) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (i < 0) {
            str2 = "";
        } else {
            str2 = " [at index " + i + "]";
        }
        sb.append(str2);
        super(sb.toString());
        this._errIdx = i;
    }
}
