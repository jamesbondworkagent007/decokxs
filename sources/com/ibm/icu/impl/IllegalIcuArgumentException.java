package com.ibm.icu.impl;

/* JADX INFO: loaded from: classes3.dex */
public class IllegalIcuArgumentException extends IllegalArgumentException {
    private static final long serialVersionUID = 3789261542830211225L;

    public IllegalIcuArgumentException(String str) {
        super(str);
    }

    public IllegalIcuArgumentException(Throwable th) {
        super(th);
    }

    public IllegalIcuArgumentException(String str, Throwable th) {
        super(str, th);
    }

    /* JADX DEBUG: Method merged with bridge method: initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable; */
    @Override // java.lang.Throwable
    public IllegalIcuArgumentException initCause(Throwable th) {
        IllegalIcuArgumentException illegalIcuArgumentException;
        synchronized (this) {
            illegalIcuArgumentException = (IllegalIcuArgumentException) super.initCause(th);
        }
        return illegalIcuArgumentException;
    }
}
