package com.okinc.social_trade_api.data;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class OrderShareDataBean {
    public static final int $stable = 8;
    private final String coinName;
    private final Context context;
    private final boolean isHistory;
    private final String lastPrice;
    private final String lever;
    private final String openPrice;
    private final String profitRate;
    private final String side;
    private final boolean sidePositive;
    private final String traderUniqueName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Context component1() {
        return this.context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.traderUniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.sidePositive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.profitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.openPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderShareDataBean copy(Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new OrderShareDataBean(context, str, str2, str3, z, str4, str5, str6, str7, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderShareDataBean)) {
            return false;
        }
        OrderShareDataBean orderShareDataBean = (OrderShareDataBean) obj;
        return Intrinsics.EZpvd(this.context, orderShareDataBean.context) && Intrinsics.EZpvd((Object) this.traderUniqueName, (Object) orderShareDataBean.traderUniqueName) && Intrinsics.EZpvd((Object) this.coinName, (Object) orderShareDataBean.coinName) && Intrinsics.EZpvd((Object) this.side, (Object) orderShareDataBean.side) && this.sidePositive == orderShareDataBean.sidePositive && Intrinsics.EZpvd((Object) this.lever, (Object) orderShareDataBean.lever) && Intrinsics.EZpvd((Object) this.profitRate, (Object) orderShareDataBean.profitRate) && Intrinsics.EZpvd((Object) this.openPrice, (Object) orderShareDataBean.openPrice) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) orderShareDataBean.lastPrice) && this.isHistory == orderShareDataBean.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinName() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Context getContext() {
        return this.context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenPrice() {
        return this.openPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitRate() {
        return this.profitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSidePositive() {
        return this.sidePositive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTraderUniqueName() {
        return this.traderUniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Context context = this.context;
        return ((((((((((((((((((context == null ? 0 : context.hashCode()) * 31) + this.traderUniqueName.hashCode()) * 31) + this.coinName.hashCode()) * 31) + this.side.hashCode()) * 31) + Boolean.hashCode(this.sidePositive)) * 31) + this.lever.hashCode()) * 31) + this.profitRate.hashCode()) * 31) + this.openPrice.hashCode()) * 31) + this.lastPrice.hashCode()) * 31) + Boolean.hashCode(this.isHistory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHistory() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderShareDataBean(context=" + this.context + ", traderUniqueName=" + this.traderUniqueName + ", coinName=" + this.coinName + ", side=" + this.side + ", sidePositive=" + this.sidePositive + ", lever=" + this.lever + ", profitRate=" + this.profitRate + ", openPrice=" + this.openPrice + ", lastPrice=" + this.lastPrice + ", isHistory=" + this.isHistory + ")";
    }

    public OrderShareDataBean(Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.context = context;
        this.traderUniqueName = str;
        this.coinName = str2;
        this.side = str3;
        this.sidePositive = z;
        this.lever = str4;
        this.profitRate = str5;
        this.openPrice = str6;
        this.lastPrice = str7;
        this.isHistory = z2;
    }
}
