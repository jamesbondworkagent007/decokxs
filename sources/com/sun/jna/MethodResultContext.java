package com.sun.jna;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes17.dex */
public class MethodResultContext extends FunctionResultContext {
    private final Method method;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Method getMethod() {
        return this.method;
    }

    public MethodResultContext(Class<?> cls, Function function, Object[] objArr, Method method) {
        super(cls, function, objArr);
        this.method = method;
    }
}
