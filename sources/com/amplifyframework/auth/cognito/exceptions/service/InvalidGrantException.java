package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.AuthException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class InvalidGrantException extends AuthException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidGrantException(@NotNull String str, String str2) {
        super(str, str2 == null ? "Sorry, we don't have a suggested fix for this error yet." : str2, null, 4, null);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
