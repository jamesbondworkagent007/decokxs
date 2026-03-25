package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* JADX INFO: loaded from: classes2.dex */
public class InvalidAccountTypeException extends ServiceException {
    private final Throwable cause;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public InvalidAccountTypeException(Throwable th) {
        super("The account type you have configured doesn't support this operation.", "Update your Auth configuration to an account type which supports this operation.", th);
        this.cause = th;
    }
}
