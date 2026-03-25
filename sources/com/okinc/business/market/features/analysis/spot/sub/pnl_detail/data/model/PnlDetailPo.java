package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class PnlDetailPo {
    public static final int $stable = 8;

    @SerializedName("holdingPnl")
    private String holdingPnl;

    @SerializedName("pnlList")
    private List<PnlListItem> pnlList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.analysis.spot.sub.pnl_detail.data.model.PnlDetailPo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PnlDetailPo copy$default(PnlDetailPo pnlDetailPo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pnlDetailPo.holdingPnl;
        }
        if ((i & 2) != 0) {
            list = pnlDetailPo.pnlList;
        }
        return pnlDetailPo.copy(str, list);
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
    public final PnlDetailPo copy(String str, @NotNull List<PnlListItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new PnlDetailPo(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnlDetailPo)) {
            return false;
        }
        PnlDetailPo pnlDetailPo = (PnlDetailPo) obj;
        return Intrinsics.EZpvd((Object) this.holdingPnl, (Object) pnlDetailPo.holdingPnl) && Intrinsics.EZpvd(this.pnlList, pnlDetailPo.pnlList);
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
        return "PnlDetailPo(holdingPnl=" + this.holdingPnl + ", pnlList=" + this.pnlList + ")";
    }

    public PnlDetailPo(String str, @NotNull List<PnlListItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.holdingPnl = str;
        this.pnlList = list;
    }

    public static final class PnlListItem {
        public static final int $stable = 0;

        @SerializedName("balance")
        private final String balance;

        @SerializedName("costPrice")
        private final String costPrice;

        @SerializedName("name")
        private final String name;

        @SerializedName("pnl")
        private final String pnl;

        @SerializedName("pnlRate")
        private final String pnlRate;

        @SerializedName("positionMarketValue")
        private final String positionMarketValue;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PnlListItem copy$default(PnlListItem pnlListItem, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pnlListItem.name;
            }
            if ((i & 2) != 0) {
                str2 = pnlListItem.balance;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = pnlListItem.pnl;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = pnlListItem.pnlRate;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = pnlListItem.positionMarketValue;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = pnlListItem.costPrice;
            }
            return pnlListItem.copy(str, str7, str8, str9, str10, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.balance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.pnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.pnlRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.positionMarketValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.costPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PnlListItem copy(String str, String str2, String str3, String str4, String str5, String str6) {
            return new PnlListItem(str, str2, str3, str4, str5, str6);
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
            return Intrinsics.EZpvd((Object) this.name, (Object) pnlListItem.name) && Intrinsics.EZpvd((Object) this.balance, (Object) pnlListItem.balance) && Intrinsics.EZpvd((Object) this.pnl, (Object) pnlListItem.pnl) && Intrinsics.EZpvd((Object) this.pnlRate, (Object) pnlListItem.pnlRate) && Intrinsics.EZpvd((Object) this.positionMarketValue, (Object) pnlListItem.positionMarketValue) && Intrinsics.EZpvd((Object) this.costPrice, (Object) pnlListItem.costPrice);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBalance() {
            return this.balance;
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
        public final String getPnl() {
            return this.pnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPnlRate() {
            return this.pnlRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPositionMarketValue() {
            return this.positionMarketValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.name;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.balance;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.pnl;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.pnlRate;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.positionMarketValue;
            int iHashCode5 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.costPrice;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PnlListItem(name=" + this.name + ", balance=" + this.balance + ", pnl=" + this.pnl + ", pnlRate=" + this.pnlRate + ", positionMarketValue=" + this.positionMarketValue + ", costPrice=" + this.costPrice + ")";
        }

        public PnlListItem(String str, String str2, String str3, String str4, String str5, String str6) {
            this.name = str;
            this.balance = str2;
            this.pnl = str3;
            this.pnlRate = str4;
            this.positionMarketValue = str5;
            this.costPrice = str6;
        }
    }
}
