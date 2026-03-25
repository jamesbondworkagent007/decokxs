package com.okinc.business.web3pay.lib.core.network;

import com.okinc.business.web3pay.lib.core.model.TransactionAlertType;
import com.okinc.network.okg.response.OKServerException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TransactionServerException extends Exception {
    public static final int $stable = 0;
    private final TransactionAlertType transactionAlertType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionAlertType getTransactionAlertType() {
        return this.transactionAlertType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionServerException(@NotNull OKServerException oKServerException, @NotNull TransactionAlertType transactionAlertType) {
        super(oKServerException.getMessage(), oKServerException);
        Intrinsics.checkNotNullParameter(oKServerException, "");
        Intrinsics.checkNotNullParameter(transactionAlertType, "");
        this.transactionAlertType = transactionAlertType;
    }
}
