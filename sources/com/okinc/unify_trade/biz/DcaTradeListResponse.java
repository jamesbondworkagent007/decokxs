package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class DcaTradeListResponse {
    private String avgPx;
    private boolean currentCycle;
    private String cycleId;
    private String endTime;
    private String fillManualAddOrds;
    private String fillSafetyOrds;
    private String investmentAmt;
    private String investmentCcy;
    private String isTerminateCycle;
    private String maxSafetyOrds;
    private String quoteProfit;
    private String startTime;
    private String tpPx;
    private String tradeQuoteCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DcaTradeListResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fillManualAddOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.quoteProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.currentCycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.isTerminateCycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tpPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.investmentAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.investmentCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.fillSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaTradeListResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z, @NotNull String str12, String str13) {
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
        return new DcaTradeListResponse(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z, str12, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DcaTradeListResponse)) {
            return false;
        }
        DcaTradeListResponse dcaTradeListResponse = (DcaTradeListResponse) obj;
        return Intrinsics.EZpvd((Object) this.cycleId, (Object) dcaTradeListResponse.cycleId) && Intrinsics.EZpvd((Object) this.startTime, (Object) dcaTradeListResponse.startTime) && Intrinsics.EZpvd((Object) this.endTime, (Object) dcaTradeListResponse.endTime) && Intrinsics.EZpvd((Object) this.avgPx, (Object) dcaTradeListResponse.avgPx) && Intrinsics.EZpvd((Object) this.tpPx, (Object) dcaTradeListResponse.tpPx) && Intrinsics.EZpvd((Object) this.investmentAmt, (Object) dcaTradeListResponse.investmentAmt) && Intrinsics.EZpvd((Object) this.investmentCcy, (Object) dcaTradeListResponse.investmentCcy) && Intrinsics.EZpvd((Object) this.maxSafetyOrds, (Object) dcaTradeListResponse.maxSafetyOrds) && Intrinsics.EZpvd((Object) this.fillSafetyOrds, (Object) dcaTradeListResponse.fillSafetyOrds) && Intrinsics.EZpvd((Object) this.fillManualAddOrds, (Object) dcaTradeListResponse.fillManualAddOrds) && Intrinsics.EZpvd((Object) this.quoteProfit, (Object) dcaTradeListResponse.quoteProfit) && this.currentCycle == dcaTradeListResponse.currentCycle && Intrinsics.EZpvd((Object) this.isTerminateCycle, (Object) dcaTradeListResponse.isTerminateCycle) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) dcaTradeListResponse.tradeQuoteCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPx() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCurrentCycle() {
        return this.currentCycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCycleId() {
        return this.cycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillManualAddOrds() {
        return this.fillManualAddOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillSafetyOrds() {
        return this.fillSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentAmt() {
        return this.investmentAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentCcy() {
        return this.investmentCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSafetyOrds() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteProfit() {
        return this.quoteProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpPx() {
        return this.tpPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.cycleId.hashCode();
        int iHashCode2 = this.startTime.hashCode();
        int iHashCode3 = this.endTime.hashCode();
        int iHashCode4 = this.avgPx.hashCode();
        int iHashCode5 = this.tpPx.hashCode();
        int iHashCode6 = this.investmentAmt.hashCode();
        int iHashCode7 = this.investmentCcy.hashCode();
        int iHashCode8 = this.maxSafetyOrds.hashCode();
        int iHashCode9 = this.fillSafetyOrds.hashCode();
        int iHashCode10 = this.fillManualAddOrds.hashCode();
        int iHashCode11 = this.quoteProfit.hashCode();
        int iHashCode12 = Boolean.hashCode(this.currentCycle);
        int iHashCode13 = this.isTerminateCycle.hashCode();
        String str = this.tradeQuoteCcy;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isTerminateCycle() {
        return this.isTerminateCycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.avgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentCycle(boolean z) {
        this.currentCycle = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCycleId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cycleId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.endTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillManualAddOrds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillManualAddOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillSafetyOrds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fillSafetyOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investmentAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investmentCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSafetyOrds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxSafetyOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStartTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.startTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTerminateCycle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isTerminateCycle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DcaTradeListResponse(cycleId=" + this.cycleId + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", avgPx=" + this.avgPx + ", tpPx=" + this.tpPx + ", investmentAmt=" + this.investmentAmt + ", investmentCcy=" + this.investmentCcy + ", maxSafetyOrds=" + this.maxSafetyOrds + ", fillSafetyOrds=" + this.fillSafetyOrds + ", fillManualAddOrds=" + this.fillManualAddOrds + ", quoteProfit=" + this.quoteProfit + ", currentCycle=" + this.currentCycle + ", isTerminateCycle=" + this.isTerminateCycle + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DcaTradeListResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DcaTradeListResponse> serializer() {
            return DcaTradeListResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DcaTradeListResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cycleId = "";
        } else {
            this.cycleId = str;
        }
        if ((i & 2) == 0) {
            this.startTime = "";
        } else {
            this.startTime = str2;
        }
        if ((i & 4) == 0) {
            this.endTime = "";
        } else {
            this.endTime = str3;
        }
        if ((i & 8) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str4;
        }
        if ((i & 16) == 0) {
            this.tpPx = "";
        } else {
            this.tpPx = str5;
        }
        if ((i & 32) == 0) {
            this.investmentAmt = "";
        } else {
            this.investmentAmt = str6;
        }
        if ((i & 64) == 0) {
            this.investmentCcy = "";
        } else {
            this.investmentCcy = str7;
        }
        if ((i & 128) == 0) {
            this.maxSafetyOrds = "";
        } else {
            this.maxSafetyOrds = str8;
        }
        if ((i & 256) == 0) {
            this.fillSafetyOrds = "";
        } else {
            this.fillSafetyOrds = str9;
        }
        if ((i & 512) == 0) {
            this.fillManualAddOrds = "";
        } else {
            this.fillManualAddOrds = str10;
        }
        if ((i & 1024) == 0) {
            this.quoteProfit = "";
        } else {
            this.quoteProfit = str11;
        }
        this.currentCycle = (i & 2048) == 0 ? false : z;
        if ((i & 4096) == 0) {
            this.isTerminateCycle = "";
        } else {
            this.isTerminateCycle = str12;
        }
        this.tradeQuoteCcy = (i & 8192) == 0 ? null : str13;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DcaTradeListResponse dcaTradeListResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dcaTradeListResponse.cycleId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dcaTradeListResponse.cycleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dcaTradeListResponse.startTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dcaTradeListResponse.startTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dcaTradeListResponse.endTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dcaTradeListResponse.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dcaTradeListResponse.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dcaTradeListResponse.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dcaTradeListResponse.tpPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dcaTradeListResponse.tpPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dcaTradeListResponse.investmentAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dcaTradeListResponse.investmentAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dcaTradeListResponse.investmentCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dcaTradeListResponse.investmentCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dcaTradeListResponse.maxSafetyOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dcaTradeListResponse.maxSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dcaTradeListResponse.fillSafetyOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dcaTradeListResponse.fillSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dcaTradeListResponse.fillManualAddOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, dcaTradeListResponse.fillManualAddOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) dcaTradeListResponse.quoteProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, dcaTradeListResponse.quoteProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || dcaTradeListResponse.currentCycle) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, dcaTradeListResponse.currentCycle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) dcaTradeListResponse.isTerminateCycle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, dcaTradeListResponse.isTerminateCycle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && dcaTradeListResponse.tradeQuoteCcy == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, dcaTradeListResponse.tradeQuoteCcy);
    }

    public DcaTradeListResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z, @NotNull String str12, String str13) {
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
        this.cycleId = str;
        this.startTime = str2;
        this.endTime = str3;
        this.avgPx = str4;
        this.tpPx = str5;
        this.investmentAmt = str6;
        this.investmentCcy = str7;
        this.maxSafetyOrds = str8;
        this.fillSafetyOrds = str9;
        this.fillManualAddOrds = str10;
        this.quoteProfit = str11;
        this.currentCycle = z;
        this.isTerminateCycle = str12;
        this.tradeQuoteCcy = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:1935) call: com.okinc.unify_trade.biz.DcaTradeListResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DcaTradeListResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? false : z, (i & 4096) == 0 ? str12 : "", (i & 8192) != 0 ? null : str13);
    }
}
