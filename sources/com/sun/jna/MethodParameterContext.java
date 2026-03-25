package com.sun.jna;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes17.dex */
public class MethodParameterContext extends FunctionParameterContext {
    private Method method;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Method getMethod() {
        return this.method;
    }

    public MethodParameterContext(Function function, Object[] objArr, int i, Method method) {
        super(function, objArr, i);
        this.method = method;
    }
}
