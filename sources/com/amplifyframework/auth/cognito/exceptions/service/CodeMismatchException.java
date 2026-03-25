package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* JADX INFO: loaded from: classes21.dex */
public class CodeMismatchException extends ServiceException {
    public CodeMismatchException(Throwable th) {
        super("Confirmation code entered is not correct.", "Enter correct confirmation code.", th);
    }
}
