package com.okinc.tradeapi.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SwitchCoinBean {
    public static final int $stable = 0;
    private final String instId;
    private final String instType;
    private final boolean isStrategyCheck;
    private final boolean needIocStatus;
    private final String strategyMode;
    private final String tradeMode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SwitchCoinBean copy$default(SwitchCoinBean switchCoinBean, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = switchCoinBean.tradeMode;
        }
        if ((i & 2) != 0) {
            str2 = switchCoinBean.strategyMode;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = switchCoinBean.instId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = switchCoinBean.instType;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = switchCoinBean.needIocStatus;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = switchCoinBean.isStrategyCheck;
        }
        return switchCoinBean.copy(str, str5, str6, str7, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.needIocStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isStrategyCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwitchCoinBean copy(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new SwitchCoinBean(str, str2, str3, str4, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchCoinBean)) {
            return false;
        }
        SwitchCoinBean switchCoinBean = (SwitchCoinBean) obj;
        return Intrinsics.EZpvd((Object) this.tradeMode, (Object) switchCoinBean.tradeMode) && Intrinsics.EZpvd((Object) this.strategyMode, (Object) switchCoinBean.strategyMode) && Intrinsics.EZpvd((Object) this.instId, (Object) switchCoinBean.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) switchCoinBean.instType) && this.needIocStatus == switchCoinBean.needIocStatus && this.isStrategyCheck == switchCoinBean.isStrategyCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedIocStatus() {
        return this.needIocStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyMode() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeMode() {
        return this.tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tradeMode.hashCode();
        String str = this.strategyMode;
        return (((((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.instId.hashCode()) * 31) + this.instType.hashCode()) * 31) + Boolean.hashCode(this.needIocStatus)) * 31) + Boolean.hashCode(this.isStrategyCheck);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isStrategyCheck() {
        return this.isStrategyCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwitchCoinBean(tradeMode=" + this.tradeMode + ", strategyMode=" + this.strategyMode + ", instId=" + this.instId + ", instType=" + this.instType + ", needIocStatus=" + this.needIocStatus + ", isStrategyCheck=" + this.isStrategyCheck + ")";
    }

    public SwitchCoinBean(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.tradeMode = str;
        this.strategyMode = str2;
        this.instId = str3;
        this.instType = str4;
        this.needIocStatus = z;
        this.isStrategyCheck = z2;
    }
}
