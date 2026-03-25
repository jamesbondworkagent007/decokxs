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
public final class TacticsRecInfoDetailItem {
    private String algoOrderType;
    private String avgPx;
    private String ccy;
    private String curNum;
    private String curRatio;
    private String initNum;
    private String instType;
    private String investCcy;
    private boolean isHistory;
    private final String maxPx;
    private final String minPx;
    private String mktCap;
    private String profit;
    private String px;
    private String ratio;
    private String totalAmt;
    private final String tradeQuoteCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsRecInfoDetailItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
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
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
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
    public final TacticsRecInfoDetailItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, boolean z, @NotNull String str14, @NotNull String str15, String str16) {
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
        Intrinsics.checkNotNullParameter(str15, "");
        return new TacticsRecInfoDetailItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, z, str14, str15, str16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TacticsRecInfoDetailItem)) {
            return false;
        }
        TacticsRecInfoDetailItem tacticsRecInfoDetailItem = (TacticsRecInfoDetailItem) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) tacticsRecInfoDetailItem.instType) && Intrinsics.EZpvd((Object) this.totalAmt, (Object) tacticsRecInfoDetailItem.totalAmt) && Intrinsics.EZpvd((Object) this.profit, (Object) tacticsRecInfoDetailItem.profit) && Intrinsics.EZpvd((Object) this.avgPx, (Object) tacticsRecInfoDetailItem.avgPx) && Intrinsics.EZpvd((Object) this.px, (Object) tacticsRecInfoDetailItem.px) && Intrinsics.EZpvd((Object) this.ccy, (Object) tacticsRecInfoDetailItem.ccy) && Intrinsics.EZpvd((Object) this.ratio, (Object) tacticsRecInfoDetailItem.ratio) && Intrinsics.EZpvd((Object) this.curRatio, (Object) tacticsRecInfoDetailItem.curRatio) && Intrinsics.EZpvd((Object) this.investCcy, (Object) tacticsRecInfoDetailItem.investCcy) && Intrinsics.EZpvd((Object) this.initNum, (Object) tacticsRecInfoDetailItem.initNum) && Intrinsics.EZpvd((Object) this.curNum, (Object) tacticsRecInfoDetailItem.curNum) && Intrinsics.EZpvd((Object) this.mktCap, (Object) tacticsRecInfoDetailItem.mktCap) && Intrinsics.EZpvd((Object) this.algoOrderType, (Object) tacticsRecInfoDetailItem.algoOrderType) && this.isHistory == tacticsRecInfoDetailItem.isHistory && Intrinsics.EZpvd((Object) this.minPx, (Object) tacticsRecInfoDetailItem.minPx) && Intrinsics.EZpvd((Object) this.maxPx, (Object) tacticsRecInfoDetailItem.maxPx) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) tacticsRecInfoDetailItem.tradeQuoteCcy);
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
    public final String getMaxPx() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPx() {
        return this.minPx;
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
        int iHashCode15 = this.minPx.hashCode();
        int iHashCode16 = this.maxPx.hashCode();
        String str = this.tradeQuoteCcy;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str == null ? 0 : str.hashCode());
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
    public String toString() {
        return "TacticsRecInfoDetailItem(instType=" + this.instType + ", totalAmt=" + this.totalAmt + ", profit=" + this.profit + ", avgPx=" + this.avgPx + ", px=" + this.px + ", ccy=" + this.ccy + ", ratio=" + this.ratio + ", curRatio=" + this.curRatio + ", investCcy=" + this.investCcy + ", initNum=" + this.initNum + ", curNum=" + this.curNum + ", mktCap=" + this.mktCap + ", algoOrderType=" + this.algoOrderType + ", isHistory=" + this.isHistory + ", minPx=" + this.minPx + ", maxPx=" + this.maxPx + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.TacticsRecInfoDetailItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TacticsRecInfoDetailItem> serializer() {
            return TacticsRecInfoDetailItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TacticsRecInfoDetailItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.minPx = "";
        } else {
            this.minPx = str14;
        }
        if ((32768 & i) == 0) {
            this.maxPx = "";
        } else {
            this.maxPx = str15;
        }
        this.tradeQuoteCcy = (i & 65536) == 0 ? null : str16;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TacticsRecInfoDetailItem tacticsRecInfoDetailItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tacticsRecInfoDetailItem.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tacticsRecInfoDetailItem.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tacticsRecInfoDetailItem.totalAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tacticsRecInfoDetailItem.totalAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tacticsRecInfoDetailItem.profit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tacticsRecInfoDetailItem.profit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tacticsRecInfoDetailItem.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tacticsRecInfoDetailItem.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tacticsRecInfoDetailItem.px, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tacticsRecInfoDetailItem.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tacticsRecInfoDetailItem.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tacticsRecInfoDetailItem.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tacticsRecInfoDetailItem.ratio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tacticsRecInfoDetailItem.ratio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tacticsRecInfoDetailItem.curRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tacticsRecInfoDetailItem.curRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tacticsRecInfoDetailItem.investCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tacticsRecInfoDetailItem.investCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tacticsRecInfoDetailItem.initNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tacticsRecInfoDetailItem.initNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tacticsRecInfoDetailItem.curNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tacticsRecInfoDetailItem.curNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tacticsRecInfoDetailItem.mktCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tacticsRecInfoDetailItem.mktCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tacticsRecInfoDetailItem.algoOrderType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, tacticsRecInfoDetailItem.algoOrderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || tacticsRecInfoDetailItem.isHistory) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, tacticsRecInfoDetailItem.isHistory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tacticsRecInfoDetailItem.minPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tacticsRecInfoDetailItem.minPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tacticsRecInfoDetailItem.maxPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, tacticsRecInfoDetailItem.maxPx);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && tacticsRecInfoDetailItem.tradeQuoteCcy == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, tacticsRecInfoDetailItem.tradeQuoteCcy);
    }

    public TacticsRecInfoDetailItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, boolean z, @NotNull String str14, @NotNull String str15, String str16) {
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
        Intrinsics.checkNotNullParameter(str15, "");
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
        this.minPx = str14;
        this.maxPx = str15;
        this.tradeQuoteCcy = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b9: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:995) call: com.okinc.unify_trade.bot.data.TacticsRecInfoDetailItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TacticsRecInfoDetailItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? null : str16);
    }
}
