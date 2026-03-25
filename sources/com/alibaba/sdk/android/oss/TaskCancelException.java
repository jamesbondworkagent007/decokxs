package com.alibaba.sdk.android.oss;

/* JADX INFO: loaded from: classes21.dex */
public class TaskCancelException extends Exception {
    public TaskCancelException() {
    }

    public TaskCancelException(String str) {
        super("[ErrorMessage]: " + str);
    }

    public TaskCancelException(Throwable th) {
        super(th);
    }
}
