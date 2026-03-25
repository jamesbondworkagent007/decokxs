package com.sun.jna;

/* JADX INFO: loaded from: classes12.dex */
public class FromNativeContext {
    private Class<?> type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Class<?> getTargetType() {
        return this.type;
    }

    public FromNativeContext(Class<?> cls) {
        this.type = cls;
    }
}
