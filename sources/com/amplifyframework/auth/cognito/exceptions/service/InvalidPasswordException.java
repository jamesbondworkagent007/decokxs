package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* JADX INFO: loaded from: classes21.dex */
public class InvalidPasswordException extends ServiceException {
    public InvalidPasswordException(Throwable th) {
        super("The password given is invalid.", "Enter correct password.", th);
    }
}
