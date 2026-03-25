package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.AuthException;

/* JADX INFO: loaded from: classes21.dex */
public class EnableSoftwareTokenMFAException extends AuthException {
    public EnableSoftwareTokenMFAException(Throwable th) {
        super("Unable to enable software token MFA", "Enable the software token MFA for the user.", th);
    }
}
