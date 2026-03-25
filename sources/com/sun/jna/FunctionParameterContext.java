package com.sun.jna;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionParameterContext extends ToNativeContext {
    private Object[] args;
    private Function function;
    private int index;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Function getFunction() {
        return this.function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getParameterIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object[] getParameters() {
        return this.args;
    }

    public FunctionParameterContext(Function function, Object[] objArr, int i) {
        this.function = function;
        this.args = objArr;
        this.index = i;
    }
}
