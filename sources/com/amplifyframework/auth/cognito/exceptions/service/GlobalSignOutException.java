package com.amplifyframework.auth.cognito.exceptions.service;

import com.amplifyframework.auth.exceptions.ServiceException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public class GlobalSignOutException extends ServiceException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSignOutException(@NotNull Throwable th) {
        super("Failed to sign out globally", "See attached exception for more details. GlobalSignOut can be retried using the CognitoIdentityProviderClient accessible from the escape hatch.", th);
        Intrinsics.checkNotNullParameter(th, "");
    }
}
