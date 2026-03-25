package com.okinc.unify_trade.biz.subscribe;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class FundingRateItem {
    private final String formulaType;
    private String frequency;
    private String fundingRate;
    private final String impactValue;
    private String instId;
    private final String interestRate;
    private String maxFundingRate;
    private String method;
    private String minFundingRate;
    private String nextFundingRate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FundingRateItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.impactValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nextFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.minFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.maxFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.formulaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.interestRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingRateItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        return new FundingRateItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundingRateItem)) {
            return false;
        }
        FundingRateItem fundingRateItem = (FundingRateItem) obj;
        return Intrinsics.EZpvd((Object) this.fundingRate, (Object) fundingRateItem.fundingRate) && Intrinsics.EZpvd((Object) this.instId, (Object) fundingRateItem.instId) && Intrinsics.EZpvd((Object) this.nextFundingRate, (Object) fundingRateItem.nextFundingRate) && Intrinsics.EZpvd((Object) this.minFundingRate, (Object) fundingRateItem.minFundingRate) && Intrinsics.EZpvd((Object) this.maxFundingRate, (Object) fundingRateItem.maxFundingRate) && Intrinsics.EZpvd((Object) this.method, (Object) fundingRateItem.method) && Intrinsics.EZpvd((Object) this.frequency, (Object) fundingRateItem.frequency) && Intrinsics.EZpvd((Object) this.formulaType, (Object) fundingRateItem.formulaType) && Intrinsics.EZpvd((Object) this.interestRate, (Object) fundingRateItem.interestRate) && Intrinsics.EZpvd((Object) this.impactValue, (Object) fundingRateItem.impactValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFormulaType() {
        return this.formulaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingRate() {
        return this.fundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImpactValue() {
        return this.impactValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterestRate() {
        return this.interestRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxFundingRate() {
        return this.maxFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinFundingRate() {
        return this.minFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextFundingRate() {
        return this.nextFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.fundingRate.hashCode() * 31) + this.instId.hashCode()) * 31) + this.nextFundingRate.hashCode()) * 31) + this.minFundingRate.hashCode()) * 31) + this.maxFundingRate.hashCode()) * 31) + this.method.hashCode()) * 31) + this.frequency.hashCode()) * 31) + this.formulaType.hashCode()) * 31) + this.interestRate.hashCode()) * 31) + this.impactValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrequency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.frequency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFundingRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fundingRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxFundingRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxFundingRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.method = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinFundingRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minFundingRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNextFundingRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nextFundingRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FundingRateItem(fundingRate=" + this.fundingRate + ", instId=" + this.instId + ", nextFundingRate=" + this.nextFundingRate + ", minFundingRate=" + this.minFundingRate + ", maxFundingRate=" + this.maxFundingRate + ", method=" + this.method + ", frequency=" + this.frequency + ", formulaType=" + this.formulaType + ", interestRate=" + this.interestRate + ", impactValue=" + this.impactValue + ")";
    }

    public /* synthetic */ FundingRateItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fundingRate = "";
        } else {
            this.fundingRate = str;
        }
        if ((i & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.nextFundingRate = "";
        } else {
            this.nextFundingRate = str3;
        }
        if ((i & 8) == 0) {
            this.minFundingRate = "";
        } else {
            this.minFundingRate = str4;
        }
        if ((i & 16) == 0) {
            this.maxFundingRate = "";
        } else {
            this.maxFundingRate = str5;
        }
        if ((i & 32) == 0) {
            this.method = "";
        } else {
            this.method = str6;
        }
        if ((i & 64) == 0) {
            this.frequency = "";
        } else {
            this.frequency = str7;
        }
        if ((i & 128) == 0) {
            this.formulaType = "";
        } else {
            this.formulaType = str8;
        }
        if ((i & 256) == 0) {
            this.interestRate = "";
        } else {
            this.interestRate = str9;
        }
        if ((i & 512) == 0) {
            this.impactValue = "";
        } else {
            this.impactValue = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FundingRateItem fundingRateItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fundingRateItem.fundingRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fundingRateItem.fundingRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fundingRateItem.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fundingRateItem.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) fundingRateItem.nextFundingRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, fundingRateItem.nextFundingRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) fundingRateItem.minFundingRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, fundingRateItem.minFundingRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) fundingRateItem.maxFundingRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, fundingRateItem.maxFundingRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) fundingRateItem.method, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, fundingRateItem.method);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) fundingRateItem.frequency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, fundingRateItem.frequency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) fundingRateItem.formulaType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, fundingRateItem.formulaType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) fundingRateItem.interestRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, fundingRateItem.interestRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) fundingRateItem.impactValue, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, fundingRateItem.impactValue);
    }

    public FundingRateItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        this.fundingRate = str;
        this.instId = str2;
        this.nextFundingRate = str3;
        this.minFundingRate = str4;
        this.maxFundingRate = str5;
        this.method = str6;
        this.frequency = str7;
        this.formulaType = str8;
        this.interestRate = str9;
        this.impactValue = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:168) call: com.okinc.unify_trade.biz.subscribe.FundingRateItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FundingRateItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "");
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.FundingRateItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FundingRateItem> serializer() {
            return FundingRateItem$$serializer.INSTANCE;
        }
    }
}
