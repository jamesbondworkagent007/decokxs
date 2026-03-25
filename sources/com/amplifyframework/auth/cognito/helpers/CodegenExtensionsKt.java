package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.AuthProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CodegenExtensionsKt {
    public static final String getUserPoolProviderName(@NotNull AuthProvider authProvider) {
        Intrinsics.checkNotNullParameter(authProvider, "");
        if (Intrinsics.EZpvd(authProvider, AuthProvider.amazon())) {
            return "LoginWithAmazon";
        }
        if (Intrinsics.EZpvd(authProvider, AuthProvider.facebook())) {
            return "Facebook";
        }
        if (Intrinsics.EZpvd(authProvider, AuthProvider.google())) {
            return "Google";
        }
        if (Intrinsics.EZpvd(authProvider, AuthProvider.apple())) {
            return "SignInWithApple";
        }
        String providerKey = authProvider.getProviderKey();
        Intrinsics.checkNotNullExpressionValue(providerKey, "");
        return providerKey;
    }

    public static final String getIdentityProviderName(@NotNull AuthProvider authProvider) {
        Intrinsics.checkNotNullParameter(authProvider, "");
        if (Intrinsics.EZpvd(authProvider, AuthProvider.amazon())) {
            return "www.amazon.com";
        }
        if (Intrinsics.EZpvd(authProvider, AuthProvider.facebook())) {
            return "graph.facebook.com";
        }
        if (Intrinsics.EZpvd(authProvider, AuthProvider.google())) {
            return "accounts.google.com";
        }
        if (Intrinsics.EZpvd(authProvider, AuthProvider.apple())) {
            return "appleid.apple.com";
        }
        String providerKey = authProvider.getProviderKey();
        Intrinsics.checkNotNullExpressionValue(providerKey, "");
        return providerKey;
    }
}
