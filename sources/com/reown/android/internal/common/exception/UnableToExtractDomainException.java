package com.reown.android.internal.common.exception;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class UnableToExtractDomainException extends WalletConnectException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnableToExtractDomainException(@NotNull String str) {
        super("Unable to extract domain from: " + str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
