package com.okinc.business.dex.tee.common.ws.data.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class TeeWsToastData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String exploreUrl;
    private final int failedCount;
    private final String fromAmount;
    private final String fromTokenSymbol;
    private final boolean isOldVersion;
    private final String orderId;
    private final String orderType;
    private final String strategyId;
    private final int strategyMode;
    private final String strategyName;
    private final int strategyType;
    private final int successCount;
    private final String surplusAmount;
    private final String surplusUsdValue;
    private final String toAmount;
    private final String toTokenSymbol;
    private final int toastType;
    private final String tpSlTradeMinUSD;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TeeWsToastData() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, (String) null, 0, false, 262143, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.toastType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.surplusUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.successCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.failedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tpSlTradeMinUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.isOldVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.strategyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.surplusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeWsToastData copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i2, @NotNull String str10, @NotNull String str11, int i3, int i4, @NotNull String str12, int i5, boolean z) {
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
        return new TeeWsToastData(i, str, str2, str3, str4, str5, str6, str7, str8, str9, i2, str10, str11, i3, i4, str12, i5, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeWsToastData)) {
            return false;
        }
        TeeWsToastData teeWsToastData = (TeeWsToastData) obj;
        return this.toastType == teeWsToastData.toastType && Intrinsics.EZpvd((Object) this.fromTokenSymbol, (Object) teeWsToastData.fromTokenSymbol) && Intrinsics.EZpvd((Object) this.orderId, (Object) teeWsToastData.orderId) && Intrinsics.EZpvd((Object) this.orderType, (Object) teeWsToastData.orderType) && Intrinsics.EZpvd((Object) this.toTokenSymbol, (Object) teeWsToastData.toTokenSymbol) && Intrinsics.EZpvd((Object) this.exploreUrl, (Object) teeWsToastData.exploreUrl) && Intrinsics.EZpvd((Object) this.strategyId, (Object) teeWsToastData.strategyId) && Intrinsics.EZpvd((Object) this.strategyName, (Object) teeWsToastData.strategyName) && Intrinsics.EZpvd((Object) this.surplusAmount, (Object) teeWsToastData.surplusAmount) && Intrinsics.EZpvd((Object) this.surplusUsdValue, (Object) teeWsToastData.surplusUsdValue) && this.strategyMode == teeWsToastData.strategyMode && Intrinsics.EZpvd((Object) this.fromAmount, (Object) teeWsToastData.fromAmount) && Intrinsics.EZpvd((Object) this.toAmount, (Object) teeWsToastData.toAmount) && this.successCount == teeWsToastData.successCount && this.failedCount == teeWsToastData.failedCount && Intrinsics.EZpvd((Object) this.tpSlTradeMinUSD, (Object) teeWsToastData.tpSlTradeMinUSD) && this.strategyType == teeWsToastData.strategyType && this.isOldVersion == teeWsToastData.isOldVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExploreUrl() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFailedCount() {
        return this.failedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenSymbol() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyId() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStrategyMode() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyName() {
        return this.strategyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSuccessCount() {
        return this.successCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSurplusAmount() {
        return this.surplusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSurplusUsdValue() {
        return this.surplusUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenSymbol() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getToastType() {
        return this.toastType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpSlTradeMinUSD() {
        return this.tpSlTradeMinUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((Integer.hashCode(this.toastType) * 31) + this.fromTokenSymbol.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.orderType.hashCode()) * 31) + this.toTokenSymbol.hashCode()) * 31) + this.exploreUrl.hashCode()) * 31) + this.strategyId.hashCode()) * 31) + this.strategyName.hashCode()) * 31) + this.surplusAmount.hashCode()) * 31) + this.surplusUsdValue.hashCode()) * 31) + Integer.hashCode(this.strategyMode)) * 31) + this.fromAmount.hashCode()) * 31) + this.toAmount.hashCode()) * 31) + Integer.hashCode(this.successCount)) * 31) + Integer.hashCode(this.failedCount)) * 31) + this.tpSlTradeMinUSD.hashCode()) * 31) + Integer.hashCode(this.strategyType)) * 31) + Boolean.hashCode(this.isOldVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOldVersion() {
        return this.isOldVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeWsToastData(toastType=" + this.toastType + ", fromTokenSymbol=" + this.fromTokenSymbol + ", orderId=" + this.orderId + ", orderType=" + this.orderType + ", toTokenSymbol=" + this.toTokenSymbol + ", exploreUrl=" + this.exploreUrl + ", strategyId=" + this.strategyId + ", strategyName=" + this.strategyName + ", surplusAmount=" + this.surplusAmount + ", surplusUsdValue=" + this.surplusUsdValue + ", strategyMode=" + this.strategyMode + ", fromAmount=" + this.fromAmount + ", toAmount=" + this.toAmount + ", successCount=" + this.successCount + ", failedCount=" + this.failedCount + ", tpSlTradeMinUSD=" + this.tpSlTradeMinUSD + ", strategyType=" + this.strategyType + ", isOldVersion=" + this.isOldVersion + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TeeWsToastData> serializer() {
            return TeeWsToastData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TeeWsToastData(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i3, String str10, String str11, int i4, int i5, String str12, int i6, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.toastType = 0;
        } else {
            this.toastType = i2;
        }
        if ((i & 2) == 0) {
            this.fromTokenSymbol = "";
        } else {
            this.fromTokenSymbol = str;
        }
        if ((i & 4) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str2;
        }
        if ((i & 8) == 0) {
            this.orderType = "";
        } else {
            this.orderType = str3;
        }
        if ((i & 16) == 0) {
            this.toTokenSymbol = "";
        } else {
            this.toTokenSymbol = str4;
        }
        if ((i & 32) == 0) {
            this.exploreUrl = "";
        } else {
            this.exploreUrl = str5;
        }
        if ((i & 64) == 0) {
            this.strategyId = "";
        } else {
            this.strategyId = str6;
        }
        if ((i & 128) == 0) {
            this.strategyName = "";
        } else {
            this.strategyName = str7;
        }
        if ((i & 256) == 0) {
            this.surplusAmount = "";
        } else {
            this.surplusAmount = str8;
        }
        if ((i & 512) == 0) {
            this.surplusUsdValue = "";
        } else {
            this.surplusUsdValue = str9;
        }
        if ((i & 1024) == 0) {
            this.strategyMode = -1;
        } else {
            this.strategyMode = i3;
        }
        if ((i & 2048) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str10;
        }
        if ((i & 4096) == 0) {
            this.toAmount = "";
        } else {
            this.toAmount = str11;
        }
        if ((i & 8192) == 0) {
            this.successCount = -1;
        } else {
            this.successCount = i4;
        }
        if ((i & 16384) == 0) {
            this.failedCount = -1;
        } else {
            this.failedCount = i5;
        }
        if ((32768 & i) == 0) {
            this.tpSlTradeMinUSD = "";
        } else {
            this.tpSlTradeMinUSD = str12;
        }
        this.strategyType = (65536 & i) == 0 ? 8 : i6;
        if ((i & 131072) == 0) {
            this.isOldVersion = false;
        } else {
            this.isOldVersion = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TeeWsToastData teeWsToastData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || teeWsToastData.toastType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, teeWsToastData.toastType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) teeWsToastData.fromTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, teeWsToastData.fromTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) teeWsToastData.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, teeWsToastData.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) teeWsToastData.orderType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, teeWsToastData.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) teeWsToastData.toTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, teeWsToastData.toTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) teeWsToastData.exploreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, teeWsToastData.exploreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) teeWsToastData.strategyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, teeWsToastData.strategyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) teeWsToastData.strategyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, teeWsToastData.strategyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) teeWsToastData.surplusAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, teeWsToastData.surplusAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) teeWsToastData.surplusUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, teeWsToastData.surplusUsdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || teeWsToastData.strategyMode != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, teeWsToastData.strategyMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) teeWsToastData.fromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, teeWsToastData.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) teeWsToastData.toAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, teeWsToastData.toAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || teeWsToastData.successCount != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, teeWsToastData.successCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || teeWsToastData.failedCount != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 14, teeWsToastData.failedCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) teeWsToastData.tpSlTradeMinUSD, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, teeWsToastData.tpSlTradeMinUSD);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || teeWsToastData.strategyType != 8) {
            compositeEncoder.encodeIntElement(serialDescriptor, 16, teeWsToastData.strategyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || teeWsToastData.isOldVersion) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, teeWsToastData.isOldVersion);
        }
    }

    public TeeWsToastData(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i2, @NotNull String str10, @NotNull String str11, int i3, int i4, @NotNull String str12, int i5, boolean z) {
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
        this.toastType = i;
        this.fromTokenSymbol = str;
        this.orderId = str2;
        this.orderType = str3;
        this.toTokenSymbol = str4;
        this.exploreUrl = str5;
        this.strategyId = str6;
        this.strategyName = str7;
        this.surplusAmount = str8;
        this.surplusUsdValue = str9;
        this.strategyMode = i2;
        this.fromAmount = str10;
        this.toAmount = str11;
        this.successCount = i3;
        this.failedCount = i4;
        this.tpSlTradeMinUSD = str12;
        this.strategyType = i5;
        this.isOldVersion = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c3: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0054: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r30v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x006c: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r33v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0076: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r34v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0081: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) == (0 int)) ? (r35v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x008a: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (8 int) : (r36v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0095: ARITH (r38v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? false : (r37v0 boolean))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, int, java.lang.String, int, boolean):void (m)] (LINE:62) call: com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastData.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, int, java.lang.String, int, boolean):void type: THIS */
    public /* synthetic */ TeeWsToastData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, String str10, String str11, int i3, int i4, String str12, int i5, boolean z, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? "" : str3, (i6 & 16) != 0 ? "" : str4, (i6 & 32) != 0 ? "" : str5, (i6 & 64) != 0 ? "" : str6, (i6 & 128) != 0 ? "" : str7, (i6 & 256) != 0 ? "" : str8, (i6 & 512) != 0 ? "" : str9, (i6 & 1024) != 0 ? -1 : i2, (i6 & 2048) != 0 ? "" : str10, (i6 & 4096) != 0 ? "" : str11, (i6 & 8192) != 0 ? -1 : i3, (i6 & 16384) != 0 ? -1 : i4, (i6 & 32768) == 0 ? str12 : "", (i6 & 65536) != 0 ? 8 : i5, (i6 & 131072) != 0 ? false : z);
    }

    public final TeeWsToastType getType() {
        return TeeWsToastType.Companion.EZpvd(this.toastType);
    }

    public final TeeWsStrategyType getTradeDirection() {
        return TeeWsStrategyType.Companion.copydefault(this.strategyType);
    }

    public final boolean hasSurplus() {
        return !C33129mqd.OLrzqt((Object) this.surplusAmount, (Object) 0);
    }
}
