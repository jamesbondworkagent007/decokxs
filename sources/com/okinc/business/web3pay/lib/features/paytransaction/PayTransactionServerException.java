package com.okinc.business.web3pay.lib.features.paytransaction;

import com.okinc.business.web3pay.lib.core.model.PayTransactionErrorType;
import com.okinc.network.okg.response.OKServerException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class PayTransactionServerException extends Exception {
    public static final int $stable = 0;
    private final PayTransactionErrorType payTransactionErrorType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PayTransactionErrorType getPayTransactionErrorType() {
        return this.payTransactionErrorType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayTransactionServerException(@NotNull OKServerException oKServerException, @NotNull PayTransactionErrorType payTransactionErrorType) {
        super(oKServerException.getMessage(), oKServerException);
        Intrinsics.checkNotNullParameter(oKServerException, "");
        Intrinsics.checkNotNullParameter(payTransactionErrorType, "");
        this.payTransactionErrorType = payTransactionErrorType;
    }
}
