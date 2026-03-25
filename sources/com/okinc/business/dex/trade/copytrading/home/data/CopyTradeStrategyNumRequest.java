package com.okinc.business.dex.trade.copytrading.home.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradeStrategyNumRequest {
    public static final int $stable = 0;
    private final String accountId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CopyTradeStrategyNumRequest copy$default(CopyTradeStrategyNumRequest copyTradeStrategyNumRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = copyTradeStrategyNumRequest.accountId;
        }
        return copyTradeStrategyNumRequest.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradeStrategyNumRequest copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CopyTradeStrategyNumRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CopyTradeStrategyNumRequest) && Intrinsics.EZpvd((Object) this.accountId, (Object) ((CopyTradeStrategyNumRequest) obj).accountId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.accountId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CopyTradeStrategyNumRequest(accountId=" + this.accountId + ")";
    }

    public CopyTradeStrategyNumRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
    }
}
