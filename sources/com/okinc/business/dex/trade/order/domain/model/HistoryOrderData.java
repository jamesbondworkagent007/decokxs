package com.okinc.business.dex.trade.order.domain.model;

import com.okinc.business.dex.trade.order.domain.model.HistoryOrderData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class HistoryOrderData {
    private final String chainId;
    private final String chainLogoUrl;
    private final String createTime;
    private final String exchangeDirection;
    private final String expireTime;
    private final TokenInfo fromToken;
    private final int isHasSaving;
    private final int isHasSurplus;
    private final String orderId;
    private final InterfaceC56387yDm orderSubStatus$delegate;
    private final int orderType;
    private final int status;
    private final int strategyMode;
    private final String strategyType;
    private final String surplusAmount;
    private final String surplusValueUSD;
    private final TokenInfo toToken;
    private final TriggerInfo triggerInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HistoryOrderData() {
        this((String) null, (TokenInfo) null, (TokenInfo) null, (TriggerInfo) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.isHasSaving;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.isHasSurplus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.surplusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.surplusValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo component2() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo component3() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TriggerInfo component4() {
        return this.triggerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryOrderData copy(@NotNull String str, @NotNull TokenInfo tokenInfo, @NotNull TokenInfo tokenInfo2, TriggerInfo triggerInfo, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, int i2, int i3, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i4, int i5, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(tokenInfo2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new HistoryOrderData(str, tokenInfo, tokenInfo2, triggerInfo, str2, str3, str4, i, i2, i3, str5, str6, str7, i4, i5, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryOrderData)) {
            return false;
        }
        HistoryOrderData historyOrderData = (HistoryOrderData) obj;
        return Intrinsics.EZpvd((Object) this.expireTime, (Object) historyOrderData.expireTime) && Intrinsics.EZpvd(this.fromToken, historyOrderData.fromToken) && Intrinsics.EZpvd(this.toToken, historyOrderData.toToken) && Intrinsics.EZpvd(this.triggerInfo, historyOrderData.triggerInfo) && Intrinsics.EZpvd((Object) this.chainId, (Object) historyOrderData.chainId) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) historyOrderData.chainLogoUrl) && Intrinsics.EZpvd((Object) this.createTime, (Object) historyOrderData.createTime) && this.status == historyOrderData.status && this.orderType == historyOrderData.orderType && this.strategyMode == historyOrderData.strategyMode && Intrinsics.EZpvd((Object) this.exchangeDirection, (Object) historyOrderData.exchangeDirection) && Intrinsics.EZpvd((Object) this.orderId, (Object) historyOrderData.orderId) && Intrinsics.EZpvd((Object) this.strategyType, (Object) historyOrderData.strategyType) && this.isHasSaving == historyOrderData.isHasSaving && this.isHasSurplus == historyOrderData.isHasSurplus && Intrinsics.EZpvd((Object) this.surplusAmount, (Object) historyOrderData.surplusAmount) && Intrinsics.EZpvd((Object) this.surplusValueUSD, (Object) historyOrderData.surplusValueUSD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExchangeDirection() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStrategyMode() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSurplusAmount() {
        return this.surplusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSurplusValueUSD() {
        return this.surplusValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TriggerInfo getTriggerInfo() {
        return this.triggerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.expireTime.hashCode();
        int iHashCode2 = this.fromToken.hashCode();
        int iHashCode3 = this.toToken.hashCode();
        TriggerInfo triggerInfo = this.triggerInfo;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (triggerInfo == null ? 0 : triggerInfo.hashCode())) * 31) + this.chainId.hashCode()) * 31) + this.chainLogoUrl.hashCode()) * 31) + this.createTime.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.orderType)) * 31) + Integer.hashCode(this.strategyMode)) * 31) + this.exchangeDirection.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.strategyType.hashCode()) * 31) + Integer.hashCode(this.isHasSaving)) * 31) + Integer.hashCode(this.isHasSurplus)) * 31) + this.surplusAmount.hashCode()) * 31) + this.surplusValueUSD.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isHasSaving() {
        return this.isHasSaving;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isHasSurplus() {
        return this.isHasSurplus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean orderHasSurplus() {
        return this.isHasSurplus == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryOrderData(expireTime=" + this.expireTime + ", fromToken=" + this.fromToken + ", toToken=" + this.toToken + ", triggerInfo=" + this.triggerInfo + ", chainId=" + this.chainId + ", chainLogoUrl=" + this.chainLogoUrl + ", createTime=" + this.createTime + ", status=" + this.status + ", orderType=" + this.orderType + ", strategyMode=" + this.strategyMode + ", exchangeDirection=" + this.exchangeDirection + ", orderId=" + this.orderId + ", strategyType=" + this.strategyType + ", isHasSaving=" + this.isHasSaving + ", isHasSurplus=" + this.isHasSurplus + ", surplusAmount=" + this.surplusAmount + ", surplusValueUSD=" + this.surplusValueUSD + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.HistoryOrderData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HistoryOrderData> serializer() {
            return HistoryOrderData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HistoryOrderData(int i, String str, TokenInfo tokenInfo, TokenInfo tokenInfo2, TriggerInfo triggerInfo, String str2, String str3, String str4, int i2, int i3, int i4, String str5, String str6, String str7, int i5, int i6, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str;
        }
        this.fromToken = (i & 2) == 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo;
        this.toToken = (i & 4) == 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo2;
        this.triggerInfo = (i & 8) == 0 ? null : triggerInfo;
        if ((i & 16) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str2;
        }
        if ((i & 32) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str3;
        }
        if ((i & 64) == 0) {
            this.createTime = "";
        } else {
            this.createTime = str4;
        }
        if ((i & 128) == 0) {
            this.status = 0;
        } else {
            this.status = i2;
        }
        this.orderType = (i & 256) == 0 ? -1 : i3;
        if ((i & 512) == 0) {
            this.strategyMode = 0;
        } else {
            this.strategyMode = i4;
        }
        if ((i & 1024) == 0) {
            this.exchangeDirection = "";
        } else {
            this.exchangeDirection = str5;
        }
        if ((i & 2048) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str6;
        }
        if ((i & 4096) == 0) {
            this.strategyType = "";
        } else {
            this.strategyType = str7;
        }
        if ((i & 8192) == 0) {
            this.isHasSaving = 0;
        } else {
            this.isHasSaving = i5;
        }
        if ((i & 16384) == 0) {
            this.isHasSurplus = 0;
        } else {
            this.isHasSurplus = i6;
        }
        if ((32768 & i) == 0) {
            this.surplusAmount = "";
        } else {
            this.surplusAmount = str8;
        }
        if ((i & 65536) == 0) {
            this.surplusValueUSD = "";
        } else {
            this.surplusValueUSD = str9;
        }
        this.orderSubStatus$delegate = C56392yDr.copydefault(new Function0() { // from class: o.gZf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HistoryOrderData._init_$lambda$1(this.OLrzqt);
            }
        });
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(HistoryOrderData historyOrderData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) historyOrderData.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, historyOrderData.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(historyOrderData.fromToken, new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, TokenInfo$$serializer.INSTANCE, historyOrderData.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(historyOrderData.toToken, new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, TokenInfo$$serializer.INSTANCE, historyOrderData.toToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || historyOrderData.triggerInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, TriggerInfo$$serializer.INSTANCE, historyOrderData.triggerInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) historyOrderData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, historyOrderData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) historyOrderData.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, historyOrderData.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) historyOrderData.createTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, historyOrderData.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || historyOrderData.status != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, historyOrderData.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || historyOrderData.orderType != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, historyOrderData.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || historyOrderData.strategyMode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, historyOrderData.strategyMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) historyOrderData.exchangeDirection, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, historyOrderData.exchangeDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) historyOrderData.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, historyOrderData.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) historyOrderData.strategyType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, historyOrderData.strategyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || historyOrderData.isHasSaving != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, historyOrderData.isHasSaving);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || historyOrderData.isHasSurplus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 14, historyOrderData.isHasSurplus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) historyOrderData.surplusAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, historyOrderData.surplusAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) historyOrderData.surplusValueUSD, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, historyOrderData.surplusValueUSD);
    }

    public HistoryOrderData(@NotNull String str, @NotNull TokenInfo tokenInfo, @NotNull TokenInfo tokenInfo2, TriggerInfo triggerInfo, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, int i2, int i3, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i4, int i5, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(tokenInfo2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.expireTime = str;
        this.fromToken = tokenInfo;
        this.toToken = tokenInfo2;
        this.triggerInfo = triggerInfo;
        this.chainId = str2;
        this.chainLogoUrl = str3;
        this.createTime = str4;
        this.status = i;
        this.orderType = i2;
        this.strategyMode = i3;
        this.exchangeDirection = str5;
        this.orderId = str6;
        this.strategyType = str7;
        this.isHasSaving = i4;
        this.isHasSurplus = i5;
        this.surplusAmount = str8;
        this.surplusValueUSD = str9;
        this.orderSubStatus$delegate = C56392yDr.copydefault(new Function0() { // from class: o.gZg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HistoryOrderData.orderSubStatus_delegate$lambda$0(this.OLrzqt);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.order.domain.model.TokenInfo:?: TERNARY null = ((wrap:int:0x000c: ARITH (r37v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (2047 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:52) call: com.okinc.business.dex.trade.order.domain.model.TokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r21v0 com.okinc.business.dex.trade.order.domain.model.TokenInfo))
  (wrap:com.okinc.business.dex.trade.order.domain.model.TokenInfo:?: TERNARY null = ((wrap:int:0x0028: ARITH (r37v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (2047 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:53) call: com.okinc.business.dex.trade.order.domain.model.TokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r22v0 com.okinc.business.dex.trade.order.domain.model.TokenInfo))
  (wrap:com.okinc.business.dex.trade.order.domain.model.TriggerInfo:?: TERNARY null = ((wrap:int:0x0045: ARITH (r37v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.order.domain.model.TriggerInfo) : (r23v0 com.okinc.business.dex.trade.order.domain.model.TriggerInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r37v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0065: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x006d: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r28v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0075: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r37v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0095: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r33v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009f: ARITH (r37v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r34v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r37v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b5: ARITH (r37v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.dex.trade.order.domain.model.TokenInfo, com.okinc.business.dex.trade.order.domain.model.TokenInfo, com.okinc.business.dex.trade.order.domain.model.TriggerInfo, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String):void (m)] (LINE:50) call: com.okinc.business.dex.trade.order.domain.model.HistoryOrderData.<init>(java.lang.String, com.okinc.business.dex.trade.order.domain.model.TokenInfo, com.okinc.business.dex.trade.order.domain.model.TokenInfo, com.okinc.business.dex.trade.order.domain.model.TriggerInfo, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HistoryOrderData(String str, TokenInfo tokenInfo, TokenInfo tokenInfo2, TriggerInfo triggerInfo, String str2, String str3, String str4, int i, int i2, int i3, String str5, String str6, String str7, int i4, int i5, String str8, String str9, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo, (i6 & 4) != 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo2, (i6 & 8) != 0 ? null : triggerInfo, (i6 & 16) != 0 ? "" : str2, (i6 & 32) != 0 ? "" : str3, (i6 & 64) != 0 ? "" : str4, (i6 & 128) != 0 ? 0 : i, (i6 & 256) != 0 ? -1 : i2, (i6 & 512) != 0 ? 0 : i3, (i6 & 1024) != 0 ? "" : str5, (i6 & 2048) != 0 ? "" : str6, (i6 & 4096) != 0 ? "" : str7, (i6 & 8192) != 0 ? 0 : i4, (i6 & 16384) != 0 ? 0 : i5, (i6 & 32768) != 0 ? "" : str8, (i6 & 65536) != 0 ? "" : str9);
    }

    public final OrderSubStatus getOrderSubStatus() {
        return (OrderSubStatus) this.orderSubStatus$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderSubStatus _init_$lambda$1(HistoryOrderData historyOrderData) {
        return OrderSubStatus.Companion.KWHzl(historyOrderData.status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderSubStatus orderSubStatus_delegate$lambda$0(HistoryOrderData historyOrderData) {
        return OrderSubStatus.Companion.KWHzl(historyOrderData.status);
    }
}
