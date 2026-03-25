package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;

/* JADX INFO: loaded from: classes21.dex */
public class TooManyRequestsException extends ServiceException {
    public TooManyRequestsException(Throwable th) {
        super("Failed since the user made too many requests.", "Make sure the requests send are controlled and the errors are properly handled.", th);
    }
}
