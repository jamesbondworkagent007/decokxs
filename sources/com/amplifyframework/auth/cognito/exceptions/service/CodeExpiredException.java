package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* JADX INFO: loaded from: classes21.dex */
public class CodeExpiredException extends ServiceException {
    public CodeExpiredException(Throwable th) {
        super("Confirmation code has expired.", "Resend a new confirmation code and then retry operation with it.", th);
    }
}
