package com.sun.jna;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes17.dex */
public class CallbackResultContext extends ToNativeContext {
    private Method method;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Method getMethod() {
        return this.method;
    }

    public CallbackResultContext(Method method) {
        this.method = method;
    }
}
