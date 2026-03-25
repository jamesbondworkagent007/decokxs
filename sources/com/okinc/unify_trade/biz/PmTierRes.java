package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class PmTierRes {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String coinMaxPosQty;
    private final String coinOrderAmount;
    private final String coinOrderSheet;
    private final String coinPositionOrderAmount;
    private final String imr;
    private final String instrumentOrderSheet;
    private final String instrumentPositionOrderAmount;
    private final String maxAmount;
    private final String maxLeverage;
    private final String maxPosQty;
    private final String minAmount;
    private final String mmr;
    private final String optionMarginFactor;
    private final String preLiquidRatio;
    private final String quoteMaxBorrow;
    private final String singleOrderAmount;
    private final String tier;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PmTierRes() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.maxPosQty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.singleOrderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.instrumentOrderSheet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.coinOrderSheet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.coinOrderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.instrumentPositionOrderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.coinPositionOrderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.coinMaxPosQty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.preLiquidRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.maxLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.quoteMaxBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.optionMarginFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PmTierRes copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
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
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        return new PmTierRes(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PmTierRes)) {
            return false;
        }
        PmTierRes pmTierRes = (PmTierRes) obj;
        return Intrinsics.EZpvd((Object) this.tier, (Object) pmTierRes.tier) && Intrinsics.EZpvd((Object) this.minAmount, (Object) pmTierRes.minAmount) && Intrinsics.EZpvd((Object) this.maxAmount, (Object) pmTierRes.maxAmount) && Intrinsics.EZpvd((Object) this.preLiquidRatio, (Object) pmTierRes.preLiquidRatio) && Intrinsics.EZpvd((Object) this.mmr, (Object) pmTierRes.mmr) && Intrinsics.EZpvd((Object) this.imr, (Object) pmTierRes.imr) && Intrinsics.EZpvd((Object) this.maxLeverage, (Object) pmTierRes.maxLeverage) && Intrinsics.EZpvd((Object) this.quoteMaxBorrow, (Object) pmTierRes.quoteMaxBorrow) && Intrinsics.EZpvd((Object) this.optionMarginFactor, (Object) pmTierRes.optionMarginFactor) && Intrinsics.EZpvd((Object) this.maxPosQty, (Object) pmTierRes.maxPosQty) && Intrinsics.EZpvd((Object) this.singleOrderAmount, (Object) pmTierRes.singleOrderAmount) && Intrinsics.EZpvd((Object) this.instrumentOrderSheet, (Object) pmTierRes.instrumentOrderSheet) && Intrinsics.EZpvd((Object) this.coinOrderSheet, (Object) pmTierRes.coinOrderSheet) && Intrinsics.EZpvd((Object) this.coinOrderAmount, (Object) pmTierRes.coinOrderAmount) && Intrinsics.EZpvd((Object) this.instrumentPositionOrderAmount, (Object) pmTierRes.instrumentPositionOrderAmount) && Intrinsics.EZpvd((Object) this.coinPositionOrderAmount, (Object) pmTierRes.coinPositionOrderAmount) && Intrinsics.EZpvd((Object) this.coinMaxPosQty, (Object) pmTierRes.coinMaxPosQty);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinMaxPosQty() {
        return this.coinMaxPosQty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinOrderAmount() {
        return this.coinOrderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinOrderSheet() {
        return this.coinOrderSheet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinPositionOrderAmount() {
        return this.coinPositionOrderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImr() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstrumentOrderSheet() {
        return this.instrumentOrderSheet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstrumentPositionOrderAmount() {
        return this.instrumentPositionOrderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAmount() {
        return this.maxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLeverage() {
        return this.maxLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPosQty() {
        return this.maxPosQty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmount() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMmr() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOptionMarginFactor() {
        return this.optionMarginFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreLiquidRatio() {
        return this.preLiquidRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteMaxBorrow() {
        return this.quoteMaxBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSingleOrderAmount() {
        return this.singleOrderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTier() {
        return this.tier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.tier.hashCode() * 31) + this.minAmount.hashCode()) * 31) + this.maxAmount.hashCode()) * 31) + this.preLiquidRatio.hashCode()) * 31) + this.mmr.hashCode()) * 31) + this.imr.hashCode()) * 31) + this.maxLeverage.hashCode()) * 31) + this.quoteMaxBorrow.hashCode()) * 31) + this.optionMarginFactor.hashCode()) * 31) + this.maxPosQty.hashCode()) * 31) + this.singleOrderAmount.hashCode()) * 31) + this.instrumentOrderSheet.hashCode()) * 31) + this.coinOrderSheet.hashCode()) * 31) + this.coinOrderAmount.hashCode()) * 31) + this.instrumentPositionOrderAmount.hashCode()) * 31) + this.coinPositionOrderAmount.hashCode()) * 31) + this.coinMaxPosQty.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PmTierRes(tier=" + this.tier + ", minAmount=" + this.minAmount + ", maxAmount=" + this.maxAmount + ", preLiquidRatio=" + this.preLiquidRatio + ", mmr=" + this.mmr + ", imr=" + this.imr + ", maxLeverage=" + this.maxLeverage + ", quoteMaxBorrow=" + this.quoteMaxBorrow + ", optionMarginFactor=" + this.optionMarginFactor + ", maxPosQty=" + this.maxPosQty + ", singleOrderAmount=" + this.singleOrderAmount + ", instrumentOrderSheet=" + this.instrumentOrderSheet + ", coinOrderSheet=" + this.coinOrderSheet + ", coinOrderAmount=" + this.coinOrderAmount + ", instrumentPositionOrderAmount=" + this.instrumentPositionOrderAmount + ", coinPositionOrderAmount=" + this.coinPositionOrderAmount + ", coinMaxPosQty=" + this.coinMaxPosQty + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.PmTierRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PmTierRes> serializer() {
            return PmTierRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PmTierRes(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tier = "";
        } else {
            this.tier = str;
        }
        if ((i & 2) == 0) {
            this.minAmount = "";
        } else {
            this.minAmount = str2;
        }
        if ((i & 4) == 0) {
            this.maxAmount = "";
        } else {
            this.maxAmount = str3;
        }
        if ((i & 8) == 0) {
            this.preLiquidRatio = "";
        } else {
            this.preLiquidRatio = str4;
        }
        if ((i & 16) == 0) {
            this.mmr = "";
        } else {
            this.mmr = str5;
        }
        if ((i & 32) == 0) {
            this.imr = "";
        } else {
            this.imr = str6;
        }
        if ((i & 64) == 0) {
            this.maxLeverage = "";
        } else {
            this.maxLeverage = str7;
        }
        if ((i & 128) == 0) {
            this.quoteMaxBorrow = "";
        } else {
            this.quoteMaxBorrow = str8;
        }
        if ((i & 256) == 0) {
            this.optionMarginFactor = "";
        } else {
            this.optionMarginFactor = str9;
        }
        if ((i & 512) == 0) {
            this.maxPosQty = "";
        } else {
            this.maxPosQty = str10;
        }
        if ((i & 1024) == 0) {
            this.singleOrderAmount = "";
        } else {
            this.singleOrderAmount = str11;
        }
        if ((i & 2048) == 0) {
            this.instrumentOrderSheet = "";
        } else {
            this.instrumentOrderSheet = str12;
        }
        if ((i & 4096) == 0) {
            this.coinOrderSheet = "";
        } else {
            this.coinOrderSheet = str13;
        }
        if ((i & 8192) == 0) {
            this.coinOrderAmount = "";
        } else {
            this.coinOrderAmount = str14;
        }
        if ((i & 16384) == 0) {
            this.instrumentPositionOrderAmount = "";
        } else {
            this.instrumentPositionOrderAmount = str15;
        }
        if ((32768 & i) == 0) {
            this.coinPositionOrderAmount = "";
        } else {
            this.coinPositionOrderAmount = str16;
        }
        if ((i & 65536) == 0) {
            this.coinMaxPosQty = "";
        } else {
            this.coinMaxPosQty = str17;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PmTierRes pmTierRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) pmTierRes.tier, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, pmTierRes.tier);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) pmTierRes.minAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, pmTierRes.minAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) pmTierRes.maxAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, pmTierRes.maxAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) pmTierRes.preLiquidRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, pmTierRes.preLiquidRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) pmTierRes.mmr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, pmTierRes.mmr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) pmTierRes.imr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, pmTierRes.imr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) pmTierRes.maxLeverage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, pmTierRes.maxLeverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) pmTierRes.quoteMaxBorrow, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, pmTierRes.quoteMaxBorrow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) pmTierRes.optionMarginFactor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, pmTierRes.optionMarginFactor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) pmTierRes.maxPosQty, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, pmTierRes.maxPosQty);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) pmTierRes.singleOrderAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, pmTierRes.singleOrderAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) pmTierRes.instrumentOrderSheet, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, pmTierRes.instrumentOrderSheet);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) pmTierRes.coinOrderSheet, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, pmTierRes.coinOrderSheet);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) pmTierRes.coinOrderAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, pmTierRes.coinOrderAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) pmTierRes.instrumentPositionOrderAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, pmTierRes.instrumentPositionOrderAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) pmTierRes.coinPositionOrderAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, pmTierRes.coinPositionOrderAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) pmTierRes.coinMaxPosQty, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, pmTierRes.coinMaxPosQty);
    }

    public PmTierRes(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
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
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        this.tier = str;
        this.minAmount = str2;
        this.maxAmount = str3;
        this.preLiquidRatio = str4;
        this.mmr = str5;
        this.imr = str6;
        this.maxLeverage = str7;
        this.quoteMaxBorrow = str8;
        this.optionMarginFactor = str9;
        this.maxPosQty = str10;
        this.singleOrderAmount = str11;
        this.instrumentOrderSheet = str12;
        this.coinOrderSheet = str13;
        this.coinOrderAmount = str14;
        this.instrumentPositionOrderAmount = str15;
        this.coinPositionOrderAmount = str16;
        this.coinMaxPosQty = str17;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ba: CONSTRUCTOR 
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
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2341) call: com.okinc.unify_trade.biz.PmTierRes.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PmTierRes(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17);
    }
}
