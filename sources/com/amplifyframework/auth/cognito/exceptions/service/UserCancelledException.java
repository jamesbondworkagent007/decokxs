package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public class UserCancelledException extends ServiceException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCancelledException(@NotNull String str, @NotNull String str2) {
        super(str, str2, null, 4, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }
}
