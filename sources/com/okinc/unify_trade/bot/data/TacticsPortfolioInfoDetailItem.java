package com.okinc.unify_trade.bot.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TacticsPortfolioInfoDetailItem {
    private String algoOrderType;
    private String avgPx;
    private String ccy;
    private String curNum;
    private String curRatio;
    private final String displayId;
    private String initNum;
    private String instType;
    private String investCcy;
    private boolean isHistory;
    private String mktCap;
    private String profit;
    private String px;
    private String ratio;
    private String totalAmt;
    private String tradeQuoteCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsPortfolioInfoDetailItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.initNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.curNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.mktCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.algoOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.curRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsPortfolioInfoDetailItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, boolean z, @NotNull String str14, String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new TacticsPortfolioInfoDetailItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, z, str14, str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TacticsPortfolioInfoDetailItem)) {
            return false;
        }
        TacticsPortfolioInfoDetailItem tacticsPortfolioInfoDetailItem = (TacticsPortfolioInfoDetailItem) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) tacticsPortfolioInfoDetailItem.instType) && Intrinsics.EZpvd((Object) this.totalAmt, (Object) tacticsPortfolioInfoDetailItem.totalAmt) && Intrinsics.EZpvd((Object) this.profit, (Object) tacticsPortfolioInfoDetailItem.profit) && Intrinsics.EZpvd((Object) this.avgPx, (Object) tacticsPortfolioInfoDetailItem.avgPx) && Intrinsics.EZpvd((Object) this.px, (Object) tacticsPortfolioInfoDetailItem.px) && Intrinsics.EZpvd((Object) this.ccy, (Object) tacticsPortfolioInfoDetailItem.ccy) && Intrinsics.EZpvd((Object) this.ratio, (Object) tacticsPortfolioInfoDetailItem.ratio) && Intrinsics.EZpvd((Object) this.curRatio, (Object) tacticsPortfolioInfoDetailItem.curRatio) && Intrinsics.EZpvd((Object) this.investCcy, (Object) tacticsPortfolioInfoDetailItem.investCcy) && Intrinsics.EZpvd((Object) this.initNum, (Object) tacticsPortfolioInfoDetailItem.initNum) && Intrinsics.EZpvd((Object) this.curNum, (Object) tacticsPortfolioInfoDetailItem.curNum) && Intrinsics.EZpvd((Object) this.mktCap, (Object) tacticsPortfolioInfoDetailItem.mktCap) && Intrinsics.EZpvd((Object) this.algoOrderType, (Object) tacticsPortfolioInfoDetailItem.algoOrderType) && this.isHistory == tacticsPortfolioInfoDetailItem.isHistory && Intrinsics.EZpvd((Object) this.displayId, (Object) tacticsPortfolioInfoDetailItem.displayId) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) tacticsPortfolioInfoDetailItem.tradeQuoteCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoOrderType() {
        return this.algoOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPx() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurNum() {
        return this.curNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurRatio() {
        return this.curRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitNum() {
        return this.initNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestCcy() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMktCap() {
        return this.mktCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfit() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatio() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAmt() {
        return this.totalAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instType.hashCode();
        int iHashCode2 = this.totalAmt.hashCode();
        int iHashCode3 = this.profit.hashCode();
        int iHashCode4 = this.avgPx.hashCode();
        int iHashCode5 = this.px.hashCode();
        int iHashCode6 = this.ccy.hashCode();
        int iHashCode7 = this.ratio.hashCode();
        int iHashCode8 = this.curRatio.hashCode();
        int iHashCode9 = this.investCcy.hashCode();
        int iHashCode10 = this.initNum.hashCode();
        int iHashCode11 = this.curNum.hashCode();
        int iHashCode12 = this.mktCap.hashCode();
        int iHashCode13 = this.algoOrderType.hashCode();
        int iHashCode14 = Boolean.hashCode(this.isHistory);
        int iHashCode15 = this.displayId.hashCode();
        String str = this.tradeQuoteCcy;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHistory() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoOrderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.curNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.curRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHistory(boolean z) {
        this.isHistory = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.initNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMktCap(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mktCap = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.profit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.px = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ratio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TacticsPortfolioInfoDetailItem(instType=" + this.instType + ", totalAmt=" + this.totalAmt + ", profit=" + this.profit + ", avgPx=" + this.avgPx + ", px=" + this.px + ", ccy=" + this.ccy + ", ratio=" + this.ratio + ", curRatio=" + this.curRatio + ", investCcy=" + this.investCcy + ", initNum=" + this.initNum + ", curNum=" + this.curNum + ", mktCap=" + this.mktCap + ", algoOrderType=" + this.algoOrderType + ", isHistory=" + this.isHistory + ", displayId=" + this.displayId + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.TacticsPortfolioInfoDetailItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TacticsPortfolioInfoDetailItem> serializer() {
            return TacticsPortfolioInfoDetailItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TacticsPortfolioInfoDetailItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, String str14, String str15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = "";
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.totalAmt = "";
        } else {
            this.totalAmt = str2;
        }
        if ((i & 4) == 0) {
            this.profit = "";
        } else {
            this.profit = str3;
        }
        if ((i & 8) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str4;
        }
        if ((i & 16) == 0) {
            this.px = "";
        } else {
            this.px = str5;
        }
        if ((i & 32) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str6;
        }
        if ((i & 64) == 0) {
            this.ratio = "";
        } else {
            this.ratio = str7;
        }
        if ((i & 128) == 0) {
            this.curRatio = "";
        } else {
            this.curRatio = str8;
        }
        if ((i & 256) == 0) {
            this.investCcy = "";
        } else {
            this.investCcy = str9;
        }
        if ((i & 512) == 0) {
            this.initNum = "";
        } else {
            this.initNum = str10;
        }
        if ((i & 1024) == 0) {
            this.curNum = "";
        } else {
            this.curNum = str11;
        }
        if ((i & 2048) == 0) {
            this.mktCap = "";
        } else {
            this.mktCap = str12;
        }
        if ((i & 4096) == 0) {
            this.algoOrderType = "";
        } else {
            this.algoOrderType = str13;
        }
        this.isHistory = (i & 8192) == 0 ? false : z;
        if ((i & 16384) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str14;
        }
        this.tradeQuoteCcy = (i & 32768) == 0 ? null : str15;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TacticsPortfolioInfoDetailItem tacticsPortfolioInfoDetailItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tacticsPortfolioInfoDetailItem.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tacticsPortfolioInfoDetailItem.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tacticsPortfolioInfoDetailItem.totalAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tacticsPortfolioInfoDetailItem.totalAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tacticsPortfolioInfoDetailItem.profit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tacticsPortfolioInfoDetailItem.profit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tacticsPortfolioInfoDetailItem.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tacticsPortfolioInfoDetailItem.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tacticsPortfolioInfoDetailItem.px, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tacticsPortfolioInfoDetailItem.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tacticsPortfolioInfoDetailItem.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tacticsPortfolioInfoDetailItem.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tacticsPortfolioInfoDetailItem.ratio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tacticsPortfolioInfoDetailItem.ratio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tacticsPortfolioInfoDetailItem.curRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tacticsPortfolioInfoDetailItem.curRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tacticsPortfolioInfoDetailItem.investCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tacticsPortfolioInfoDetailItem.investCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tacticsPortfolioInfoDetailItem.initNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tacticsPortfolioInfoDetailItem.initNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tacticsPortfolioInfoDetailItem.curNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tacticsPortfolioInfoDetailItem.curNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tacticsPortfolioInfoDetailItem.mktCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tacticsPortfolioInfoDetailItem.mktCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tacticsPortfolioInfoDetailItem.algoOrderType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, tacticsPortfolioInfoDetailItem.algoOrderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || tacticsPortfolioInfoDetailItem.isHistory) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, tacticsPortfolioInfoDetailItem.isHistory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tacticsPortfolioInfoDetailItem.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tacticsPortfolioInfoDetailItem.displayId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && tacticsPortfolioInfoDetailItem.tradeQuoteCcy == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, tacticsPortfolioInfoDetailItem.tradeQuoteCcy);
    }

    public TacticsPortfolioInfoDetailItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, boolean z, @NotNull String str14, String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.instType = str;
        this.totalAmt = str2;
        this.profit = str3;
        this.avgPx = str4;
        this.px = str5;
        this.ccy = str6;
        this.ratio = str7;
        this.curRatio = str8;
        this.investCcy = str9;
        this.initNum = str10;
        this.curNum = str11;
        this.mktCap = str12;
        this.algoOrderType = str13;
        this.isHistory = z;
        this.displayId = str14;
        this.tradeQuoteCcy = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ac: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:974) call: com.okinc.unify_trade.bot.data.TacticsPortfolioInfoDetailItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TacticsPortfolioInfoDetailItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? null : str15);
    }
}
