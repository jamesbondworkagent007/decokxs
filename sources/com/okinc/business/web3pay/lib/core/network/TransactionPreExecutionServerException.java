package com.okinc.business.web3pay.lib.core.network;

import com.okinc.network.okg.response.OKServerException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TransactionPreExecutionServerException extends Exception {
    public static final int $stable = OKServerException.$stable;
    private final OKServerException originException;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKServerException getOriginException() {
        return this.originException;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPreExecutionServerException(@NotNull OKServerException oKServerException) {
        super(oKServerException.getMessage(), oKServerException);
        Intrinsics.checkNotNullParameter(oKServerException, "");
        this.originException = oKServerException;
    }
}
