package com.okinc.business.market.features.analysis.futures.sub.funding.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SwapCoinPairPo {
    public static final int $stable = 0;

    @SerializedName("instId")
    private final String instId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SwapCoinPairPo copy$default(SwapCoinPairPo swapCoinPairPo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = swapCoinPairPo.instId;
        }
        return swapCoinPairPo.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapCoinPairPo copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SwapCoinPairPo(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SwapCoinPairPo) && Intrinsics.EZpvd((Object) this.instId, (Object) ((SwapCoinPairPo) obj).instId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.instId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwapCoinPairPo(instId=" + this.instId + ")";
    }

    public SwapCoinPairPo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }
}
