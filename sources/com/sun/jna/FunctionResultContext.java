package com.sun.jna;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionResultContext extends FromNativeContext {
    private Object[] args;
    private Function function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object[] getArguments() {
        return this.args;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Function getFunction() {
        return this.function;
    }

    public FunctionResultContext(Class<?> cls, Function function, Object[] objArr) {
        super(cls);
        this.function = function;
        this.args = objArr;
    }
}
