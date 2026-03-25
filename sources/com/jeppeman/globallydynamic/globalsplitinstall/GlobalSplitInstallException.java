package com.jeppeman.globallydynamic.globalsplitinstall;

/* JADX INFO: loaded from: classes14.dex */
public class GlobalSplitInstallException extends RuntimeException {
    private final int errorCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getErrorCode() {
        return this.errorCode;
    }

    public GlobalSplitInstallException(Throwable th) {
        this(-100, th.getMessage());
    }

    public GlobalSplitInstallException(int i, String str) {
        this(i, str, null);
    }

    public GlobalSplitInstallException(int i, String str, Throwable th) {
        super(str, th);
        this.errorCode = i;
    }
}
