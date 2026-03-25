package com.amplifyframework.auth;

import j$.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import o.C5171Hl;
import o.InterfaceC52697wV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSCredentialsKt {
    public static final InterfaceC52697wV toSdkCredentials(@NotNull AWSCredentials aWSCredentials) {
        Instant expiresAt;
        Intrinsics.checkNotNullParameter(aWSCredentials, "");
        InterfaceC52697wV.Activity activity = InterfaceC52697wV.copydefault;
        String accessKeyId = aWSCredentials.getAccessKeyId();
        String secretAccessKey = aWSCredentials.getSecretAccessKey();
        boolean z = aWSCredentials instanceof AWSTemporaryCredentials;
        AWSTemporaryCredentials aWSTemporaryCredentials = z ? (AWSTemporaryCredentials) aWSCredentials : null;
        String sessionToken = aWSTemporaryCredentials != null ? aWSTemporaryCredentials.getSessionToken() : null;
        AWSTemporaryCredentials aWSTemporaryCredentials2 = z ? (AWSTemporaryCredentials) aWSCredentials : null;
        return activity.copydefault(accessKeyId, secretAccessKey, (16 & 4) != 0 ? null : sessionToken, (16 & 8) != 0 ? null : (aWSTemporaryCredentials2 == null || (expiresAt = aWSTemporaryCredentials2.getExpiresAt()) == null) ? null : C5171Hl.OLrzqt(expiresAt), (16 & 16) != 0 ? null : null, (16 & 32) != 0 ? null : null);
    }
}
