package com.okinc.business.dexlogic.main.limmitorder.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C23311hvo;
import o.C23313hvq;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class LimitCalResult {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainId;
    private final String exchangeRate;
    private final String fromAmount;
    private final String fromTokenAddress;
    private final String fromTokenPrice;
    private final String fromTokenUsd;
    private final String minimumReceived;
    private final String toAmount;
    private final String toTokenAddress;
    private final String toTokenPrice;
    private final String toTokenUsd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitCalResult() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.toTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.exchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.toTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitCalResult copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
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
        return new LimitCalResult(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitCalResult)) {
            return false;
        }
        LimitCalResult limitCalResult = (LimitCalResult) obj;
        return Intrinsics.EZpvd((Object) this.fromAmount, (Object) limitCalResult.fromAmount) && Intrinsics.EZpvd((Object) this.toAmount, (Object) limitCalResult.toAmount) && Intrinsics.EZpvd((Object) this.chainId, (Object) limitCalResult.chainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) limitCalResult.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) limitCalResult.toTokenAddress) && Intrinsics.EZpvd((Object) this.exchangeRate, (Object) limitCalResult.exchangeRate) && Intrinsics.EZpvd((Object) this.fromTokenUsd, (Object) limitCalResult.fromTokenUsd) && Intrinsics.EZpvd((Object) this.toTokenUsd, (Object) limitCalResult.toTokenUsd) && Intrinsics.EZpvd((Object) this.fromTokenPrice, (Object) limitCalResult.fromTokenPrice) && Intrinsics.EZpvd((Object) this.toTokenPrice, (Object) limitCalResult.toTokenPrice) && Intrinsics.EZpvd((Object) this.minimumReceived, (Object) limitCalResult.minimumReceived);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExchangeRate() {
        return this.exchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenPrice() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenUsd() {
        return this.fromTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimumReceived() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenPrice() {
        return this.toTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenUsd() {
        return this.toTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.fromAmount.hashCode() * 31) + this.toAmount.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.fromTokenAddress.hashCode()) * 31) + this.toTokenAddress.hashCode()) * 31) + this.exchangeRate.hashCode()) * 31) + this.fromTokenUsd.hashCode()) * 31) + this.toTokenUsd.hashCode()) * 31) + this.fromTokenPrice.hashCode()) * 31) + this.toTokenPrice.hashCode()) * 31) + this.minimumReceived.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitCalResult(fromAmount=" + this.fromAmount + ", toAmount=" + this.toAmount + ", chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", exchangeRate=" + this.exchangeRate + ", fromTokenUsd=" + this.fromTokenUsd + ", toTokenUsd=" + this.toTokenUsd + ", fromTokenPrice=" + this.fromTokenPrice + ", toTokenPrice=" + this.toTokenPrice + ", minimumReceived=" + this.minimumReceived + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitCalResult> serializer() {
            return LimitCalResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitCalResult(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str;
        }
        if ((i & 2) == 0) {
            this.toAmount = "";
        } else {
            this.toAmount = str2;
        }
        if ((i & 4) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str3;
        }
        if ((i & 8) == 0) {
            this.fromTokenAddress = "";
        } else {
            this.fromTokenAddress = str4;
        }
        if ((i & 16) == 0) {
            this.toTokenAddress = "";
        } else {
            this.toTokenAddress = str5;
        }
        if ((i & 32) == 0) {
            this.exchangeRate = "";
        } else {
            this.exchangeRate = str6;
        }
        if ((i & 64) == 0) {
            this.fromTokenUsd = "";
        } else {
            this.fromTokenUsd = str7;
        }
        if ((i & 128) == 0) {
            this.toTokenUsd = "";
        } else {
            this.toTokenUsd = str8;
        }
        if ((i & 256) == 0) {
            this.fromTokenPrice = "";
        } else {
            this.fromTokenPrice = str9;
        }
        if ((i & 512) == 0) {
            this.toTokenPrice = "";
        } else {
            this.toTokenPrice = str10;
        }
        if ((i & 1024) == 0) {
            this.minimumReceived = "";
        } else {
            this.minimumReceived = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitCalResult limitCalResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) limitCalResult.fromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, limitCalResult.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) limitCalResult.toAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, limitCalResult.toAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) limitCalResult.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, limitCalResult.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) limitCalResult.fromTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, limitCalResult.fromTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) limitCalResult.toTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, limitCalResult.toTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) limitCalResult.exchangeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, limitCalResult.exchangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) limitCalResult.fromTokenUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, limitCalResult.fromTokenUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) limitCalResult.toTokenUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, limitCalResult.toTokenUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) limitCalResult.fromTokenPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, limitCalResult.fromTokenPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) limitCalResult.toTokenPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, limitCalResult.toTokenPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) limitCalResult.minimumReceived, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, limitCalResult.minimumReceived);
    }

    public LimitCalResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
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
        this.fromAmount = str;
        this.toAmount = str2;
        this.chainId = str3;
        this.fromTokenAddress = str4;
        this.toTokenAddress = str5;
        this.exchangeRate = str6;
        this.fromTokenUsd = str7;
        this.toTokenUsd = str8;
        this.fromTokenPrice = str9;
        this.toTokenPrice = str10;
        this.minimumReceived = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:138) call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LimitCalResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) == 0 ? str11 : "");
    }

    public final String getPriceDiffAmount() {
        String strDivCheckS$default = C23313hvq.divCheckS$default(this.toTokenUsd, this.fromTokenUsd, Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
        return (this.toTokenUsd.length() == 0) | (C23313hvq.copydefault(strDivCheckS$default, 0) | (this.fromTokenUsd.length() == 0)) ? "" : C23313hvq.subCheckS$default(strDivCheckS$default, 1, Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
    }

    public final String getPriceDiffAmountShow() {
        String priceDiffAmount = getPriceDiffAmount();
        if (priceDiffAmount.length() == 0 || (C23313hvq.OLrzqt(priceDiffAmount, Double.valueOf(-1.0E-4d)) && C23313hvq.KWHzl(priceDiffAmount, Double.valueOf(1.0E-4d)))) {
            return "";
        }
        if (C23313hvq.OLrzqt(priceDiffAmount, Double.valueOf(9.99d))) {
            return "(>" + C23311hvo.formatPercentWithSymbol$default("9.99", false, 0, 0, null, null, 31, null) + ")";
        }
        if (C23313hvq.KWHzl(priceDiffAmount, Double.valueOf(-9.99d))) {
            return "(<" + C23311hvo.formatPercentWithSymbol$default("-9.99", false, 0, 0, null, null, 31, null) + ")";
        }
        if (C23313hvq.OLrzqt(priceDiffAmount, 0) & C23313hvq.KWHzl(priceDiffAmount, Double.valueOf(0.1d))) {
            return "(" + C23311hvo.formatPercentWithSymbol$default(priceDiffAmount, false, 0, 0, null, null, 31, null) + ")";
        }
        if (C23313hvq.OLrzqt(priceDiffAmount, 0) & C23313hvq.EZpvd(priceDiffAmount, Double.valueOf(0.1d))) {
            return "(" + C23311hvo.formatPercentWithSymbol$default(priceDiffAmount, false, 0, 0, null, null, 31, null) + ")";
        }
        if (C23313hvq.KWHzl(priceDiffAmount, 0) & C23313hvq.EZpvd(priceDiffAmount, Double.valueOf(-0.1d))) {
            return "(" + C23311hvo.formatPercentWithSymbol$default(priceDiffAmount, false, 0, 0, null, null, 31, null) + ")";
        }
        if (C23313hvq.KWHzl(priceDiffAmount, 0) & C23313hvq.valueOf(priceDiffAmount, Double.valueOf(-0.1d))) {
            return "(" + C23311hvo.formatPercentWithSymbol$default(priceDiffAmount, false, 0, 0, null, null, 31, null) + ")";
        }
        return "(" + C23311hvo.formatPercentWithSymbol$default(priceDiffAmount, false, 0, 0, null, null, 31, null) + ")";
    }
}
