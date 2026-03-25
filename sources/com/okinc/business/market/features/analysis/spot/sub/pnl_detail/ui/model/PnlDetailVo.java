package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model;

import com.okinc.market.ext.UpDownColor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class PnlDetailVo {
    public static final int $stable = 8;
    private String holdingPnl;
    private List<PnlListItem> pnlList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PnlDetailVo copy$default(PnlDetailVo pnlDetailVo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pnlDetailVo.holdingPnl;
        }
        if ((i & 2) != 0) {
            list = pnlDetailVo.pnlList;
        }
        return pnlDetailVo.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.holdingPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PnlListItem> component2() {
        return this.pnlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnlDetailVo copy(String str, @NotNull List<PnlListItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new PnlDetailVo(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnlDetailVo)) {
            return false;
        }
        PnlDetailVo pnlDetailVo = (PnlDetailVo) obj;
        return Intrinsics.EZpvd((Object) this.holdingPnl, (Object) pnlDetailVo.holdingPnl) && Intrinsics.EZpvd(this.pnlList, pnlDetailVo.pnlList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldingPnl() {
        return this.holdingPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PnlListItem> getPnlList() {
        return this.pnlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.holdingPnl;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.pnlList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoldingPnl(String str) {
        this.holdingPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlList(@NotNull List<PnlListItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.pnlList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PnlDetailVo(holdingPnl=" + this.holdingPnl + ", pnlList=" + this.pnlList + ")";
    }

    public PnlDetailVo(String str, @NotNull List<PnlListItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.holdingPnl = str;
        this.pnlList = list;
    }

    public static final class PnlListItem {
        public static final int $stable = 0;
        private final String balance;
        private final UpDownColor balanceColor;
        private final String coinUrl;
        private final String costPrice;
        private final String name;
        private final String originBalance;
        private final String originPnl;
        private final String originPnlRate;
        private final String originPositionMarketValue;
        private final String pnl;
        private final UpDownColor pnlColor;
        private final String pnlRate;
        private final UpDownColor pnlRateColor;
        private final String positionMarketValue;
        private final UpDownColor positionMarketValueColor;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UpDownColor component10() {
            return this.pnlRateColor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.originPnlRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component12() {
            return this.positionMarketValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UpDownColor component13() {
            return this.positionMarketValueColor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component14() {
            return this.originPositionMarketValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component15() {
            return this.costPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.coinUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.balance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UpDownColor component4() {
            return this.balanceColor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.originBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.pnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UpDownColor component7() {
            return this.pnlColor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.originPnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.pnlRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PnlListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull UpDownColor upDownColor, String str4, @NotNull String str5, @NotNull UpDownColor upDownColor2, String str6, @NotNull String str7, @NotNull UpDownColor upDownColor3, String str8, @NotNull String str9, @NotNull UpDownColor upDownColor4, String str10, String str11) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(upDownColor, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(upDownColor2, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(upDownColor3, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(upDownColor4, "");
            return new PnlListItem(str, str2, str3, upDownColor, str4, str5, upDownColor2, str6, str7, upDownColor3, str8, str9, upDownColor4, str10, str11);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PnlListItem)) {
                return false;
            }
            PnlListItem pnlListItem = (PnlListItem) obj;
            return Intrinsics.EZpvd((Object) this.name, (Object) pnlListItem.name) && Intrinsics.EZpvd((Object) this.coinUrl, (Object) pnlListItem.coinUrl) && Intrinsics.EZpvd((Object) this.balance, (Object) pnlListItem.balance) && this.balanceColor == pnlListItem.balanceColor && Intrinsics.EZpvd((Object) this.originBalance, (Object) pnlListItem.originBalance) && Intrinsics.EZpvd((Object) this.pnl, (Object) pnlListItem.pnl) && this.pnlColor == pnlListItem.pnlColor && Intrinsics.EZpvd((Object) this.originPnl, (Object) pnlListItem.originPnl) && Intrinsics.EZpvd((Object) this.pnlRate, (Object) pnlListItem.pnlRate) && this.pnlRateColor == pnlListItem.pnlRateColor && Intrinsics.EZpvd((Object) this.originPnlRate, (Object) pnlListItem.originPnlRate) && Intrinsics.EZpvd((Object) this.positionMarketValue, (Object) pnlListItem.positionMarketValue) && this.positionMarketValueColor == pnlListItem.positionMarketValueColor && Intrinsics.EZpvd((Object) this.originPositionMarketValue, (Object) pnlListItem.originPositionMarketValue) && Intrinsics.EZpvd((Object) this.costPrice, (Object) pnlListItem.costPrice);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBalance() {
            return this.balance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UpDownColor getBalanceColor() {
            return this.balanceColor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCoinUrl() {
            return this.coinUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCostPrice() {
            return this.costPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOriginBalance() {
            return this.originBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOriginPnl() {
            return this.originPnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOriginPnlRate() {
            return this.originPnlRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOriginPositionMarketValue() {
            return this.originPositionMarketValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPnl() {
            return this.pnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UpDownColor getPnlColor() {
            return this.pnlColor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPnlRate() {
            return this.pnlRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UpDownColor getPnlRateColor() {
            return this.pnlRateColor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPositionMarketValue() {
            return this.positionMarketValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UpDownColor getPositionMarketValueColor() {
            return this.positionMarketValueColor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.name.hashCode();
            int iHashCode2 = this.coinUrl.hashCode();
            int iHashCode3 = this.balance.hashCode();
            int iHashCode4 = this.balanceColor.hashCode();
            String str = this.originBalance;
            int iHashCode5 = str == null ? 0 : str.hashCode();
            int iHashCode6 = this.pnl.hashCode();
            int iHashCode7 = this.pnlColor.hashCode();
            String str2 = this.originPnl;
            int iHashCode8 = str2 == null ? 0 : str2.hashCode();
            int iHashCode9 = this.pnlRate.hashCode();
            int iHashCode10 = this.pnlRateColor.hashCode();
            String str3 = this.originPnlRate;
            int iHashCode11 = str3 == null ? 0 : str3.hashCode();
            int iHashCode12 = this.positionMarketValue.hashCode();
            int iHashCode13 = this.positionMarketValueColor.hashCode();
            String str4 = this.originPositionMarketValue;
            int iHashCode14 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.costPrice;
            return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str5 == null ? 0 : str5.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PnlListItem(name=" + this.name + ", coinUrl=" + this.coinUrl + ", balance=" + this.balance + ", balanceColor=" + this.balanceColor + ", originBalance=" + this.originBalance + ", pnl=" + this.pnl + ", pnlColor=" + this.pnlColor + ", originPnl=" + this.originPnl + ", pnlRate=" + this.pnlRate + ", pnlRateColor=" + this.pnlRateColor + ", originPnlRate=" + this.originPnlRate + ", positionMarketValue=" + this.positionMarketValue + ", positionMarketValueColor=" + this.positionMarketValueColor + ", originPositionMarketValue=" + this.originPositionMarketValue + ", costPrice=" + this.costPrice + ")";
        }

        public PnlListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull UpDownColor upDownColor, String str4, @NotNull String str5, @NotNull UpDownColor upDownColor2, String str6, @NotNull String str7, @NotNull UpDownColor upDownColor3, String str8, @NotNull String str9, @NotNull UpDownColor upDownColor4, String str10, String str11) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(upDownColor, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(upDownColor2, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(upDownColor3, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(upDownColor4, "");
            this.name = str;
            this.coinUrl = str2;
            this.balance = str3;
            this.balanceColor = upDownColor;
            this.originBalance = str4;
            this.pnl = str5;
            this.pnlColor = upDownColor2;
            this.originPnl = str6;
            this.pnlRate = str7;
            this.pnlRateColor = upDownColor3;
            this.originPnlRate = str8;
            this.positionMarketValue = str9;
            this.positionMarketValueColor = upDownColor4;
            this.originPositionMarketValue = str10;
            this.costPrice = str11;
        }
    }
}
