package com.okinc.business.web3pay.lib.core.network;

import com.okinc.network.okg.response.OKServerException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class GeneralServerException extends Exception {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralServerException(@NotNull OKServerException oKServerException) {
        super(oKServerException.getMessage(), oKServerException);
        Intrinsics.checkNotNullParameter(oKServerException, "");
    }
}
