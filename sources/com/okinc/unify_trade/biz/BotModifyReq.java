package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotModifyReq {
    public static final int $stable = 0;
    private final String algoId;
    private final String algoOrdType;
    private final String state;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotModifyReq copy$default(BotModifyReq botModifyReq, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botModifyReq.state;
        }
        if ((i & 2) != 0) {
            str2 = botModifyReq.algoOrdType;
        }
        if ((i & 4) != 0) {
            str3 = botModifyReq.algoId;
        }
        return botModifyReq.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotModifyReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new BotModifyReq(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotModifyReq)) {
            return false;
        }
        BotModifyReq botModifyReq = (BotModifyReq) obj;
        return Intrinsics.EZpvd((Object) this.state, (Object) botModifyReq.state) && Intrinsics.EZpvd((Object) this.algoOrdType, (Object) botModifyReq.algoOrdType) && Intrinsics.EZpvd((Object) this.algoId, (Object) botModifyReq.algoId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoOrdType() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.state.hashCode() * 31) + this.algoOrdType.hashCode()) * 31) + this.algoId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotModifyReq(state=" + this.state + ", algoOrdType=" + this.algoOrdType + ", algoId=" + this.algoId + ")";
    }

    public BotModifyReq(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.state = str;
        this.algoOrdType = str2;
        this.algoId = str3;
    }
}
