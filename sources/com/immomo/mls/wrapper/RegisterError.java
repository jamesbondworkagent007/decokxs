package com.immomo.mls.wrapper;

/* JADX INFO: loaded from: classes3.dex */
public class RegisterError extends Error {
    public RegisterError(Throwable th) {
        super(th);
    }

    public RegisterError(String str) {
        super(str);
    }

    public RegisterError(String str, Throwable th) {
        super(str, th);
    }
}
