package com.amplifyframework.api.aws.sigv4;

import aws.smithy.kotlin.runtime.auth.awssigning.AwsSignedBodyHeader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AppSyncV4Signer extends AWS4Signer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSyncV4Signer(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        setAwsSignedBodyHeaderType(AwsSignedBodyHeader.X_AMZ_CONTENT_SHA256);
    }
}
