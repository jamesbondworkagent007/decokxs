package com.amplifyframework.api.aws.sigv4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ApiGatewayIamSigner extends AWS4Signer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiGatewayIamSigner(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
