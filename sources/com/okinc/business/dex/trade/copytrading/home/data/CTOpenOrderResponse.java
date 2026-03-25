package com.okinc.business.dex.trade.copytrading.home.data;

import com.okinc.business.dex.trade.copytrading.home.data.CTOpenOrderResponse;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dex.trade.order.domain.model.TokenInfo;
import com.okinc.business.dex.trade.order.domain.model.TokenInfo$$serializer;
import com.okinc.business.dex.trade.order.domain.model.TriggerInfo;
import com.okinc.business.dex.trade.order.domain.model.TriggerInfo$$serializer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CTOpenOrderResponse {
    private final boolean canResume;
    private final String chainId;
    private final String chainLogoUrl;
    private final String chainName;
    private final String chainSymbol;
    private final String createTime;
    private final int exchangeDirection;
    private final String expireTime;
    private final TokenInfo fromToken;
    private final String orderId;
    private final InterfaceC56387yDm orderSubStatus$delegate;
    private final int orderType;
    private final PnLDetail realizedPnl;
    private final int status;
    private final int strategyMode;
    private final TokenInfo toToken;
    private final TriggerInfo triggerInfo;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.canResume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDetail component12() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo component15() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TriggerInfo component16() {
        return this.triggerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo component9() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTOpenOrderResponse copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull String str6, @NotNull TokenInfo tokenInfo, @NotNull String str7, int i2, PnLDetail pnLDetail, int i3, int i4, @NotNull TokenInfo tokenInfo2, @NotNull TriggerInfo triggerInfo, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(tokenInfo2, "");
        Intrinsics.checkNotNullParameter(triggerInfo, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new CTOpenOrderResponse(z, str, str2, str3, str4, str5, i, str6, tokenInfo, str7, i2, pnLDetail, i3, i4, tokenInfo2, triggerInfo, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTOpenOrderResponse)) {
            return false;
        }
        CTOpenOrderResponse cTOpenOrderResponse = (CTOpenOrderResponse) obj;
        return this.canResume == cTOpenOrderResponse.canResume && Intrinsics.EZpvd((Object) this.chainId, (Object) cTOpenOrderResponse.chainId) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) cTOpenOrderResponse.chainLogoUrl) && Intrinsics.EZpvd((Object) this.chainName, (Object) cTOpenOrderResponse.chainName) && Intrinsics.EZpvd((Object) this.chainSymbol, (Object) cTOpenOrderResponse.chainSymbol) && Intrinsics.EZpvd((Object) this.createTime, (Object) cTOpenOrderResponse.createTime) && this.exchangeDirection == cTOpenOrderResponse.exchangeDirection && Intrinsics.EZpvd((Object) this.expireTime, (Object) cTOpenOrderResponse.expireTime) && Intrinsics.EZpvd(this.fromToken, cTOpenOrderResponse.fromToken) && Intrinsics.EZpvd((Object) this.orderId, (Object) cTOpenOrderResponse.orderId) && this.orderType == cTOpenOrderResponse.orderType && Intrinsics.EZpvd(this.realizedPnl, cTOpenOrderResponse.realizedPnl) && this.status == cTOpenOrderResponse.status && this.strategyMode == cTOpenOrderResponse.strategyMode && Intrinsics.EZpvd(this.toToken, cTOpenOrderResponse.toToken) && Intrinsics.EZpvd(this.triggerInfo, cTOpenOrderResponse.triggerInfo) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) cTOpenOrderResponse.userWalletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanResume() {
        return this.canResume;
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
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainSymbol() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getExchangeDirection() {
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
    public final PnLDetail getRealizedPnl() {
        return this.realizedPnl;
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
    public final TokenInfo getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TriggerInfo getTriggerInfo() {
        return this.triggerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.canResume);
        int iHashCode2 = this.chainId.hashCode();
        int iHashCode3 = this.chainLogoUrl.hashCode();
        int iHashCode4 = this.chainName.hashCode();
        int iHashCode5 = this.chainSymbol.hashCode();
        int iHashCode6 = this.createTime.hashCode();
        int iHashCode7 = Integer.hashCode(this.exchangeDirection);
        int iHashCode8 = this.expireTime.hashCode();
        int iHashCode9 = this.fromToken.hashCode();
        int iHashCode10 = this.orderId.hashCode();
        int iHashCode11 = Integer.hashCode(this.orderType);
        PnLDetail pnLDetail = this.realizedPnl;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (pnLDetail == null ? 0 : pnLDetail.hashCode())) * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.strategyMode)) * 31) + this.toToken.hashCode()) * 31) + this.triggerInfo.hashCode()) * 31) + this.userWalletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTOpenOrderResponse(canResume=" + this.canResume + ", chainId=" + this.chainId + ", chainLogoUrl=" + this.chainLogoUrl + ", chainName=" + this.chainName + ", chainSymbol=" + this.chainSymbol + ", createTime=" + this.createTime + ", exchangeDirection=" + this.exchangeDirection + ", expireTime=" + this.expireTime + ", fromToken=" + this.fromToken + ", orderId=" + this.orderId + ", orderType=" + this.orderType + ", realizedPnl=" + this.realizedPnl + ", status=" + this.status + ", strategyMode=" + this.strategyMode + ", toToken=" + this.toToken + ", triggerInfo=" + this.triggerInfo + ", userWalletAddress=" + this.userWalletAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CTOpenOrderResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTOpenOrderResponse> serializer() {
            return CTOpenOrderResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CTOpenOrderResponse(int i, boolean z, String str, String str2, String str3, String str4, String str5, int i2, String str6, TokenInfo tokenInfo, String str7, int i3, PnLDetail pnLDetail, int i4, int i5, TokenInfo tokenInfo2, TriggerInfo triggerInfo, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (1088 != (i & 1088)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1088, CTOpenOrderResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.canResume = false;
        } else {
            this.canResume = z;
        }
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 4) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str2;
        }
        if ((i & 8) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str3;
        }
        if ((i & 16) == 0) {
            this.chainSymbol = "";
        } else {
            this.chainSymbol = str4;
        }
        if ((i & 32) == 0) {
            this.createTime = "";
        } else {
            this.createTime = str5;
        }
        this.exchangeDirection = i2;
        if ((i & 128) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str6;
        }
        this.fromToken = (i & 256) == 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo;
        if ((i & 512) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str7;
        }
        this.orderType = i3;
        this.realizedPnl = (i & 2048) == 0 ? null : pnLDetail;
        if ((i & 4096) == 0) {
            this.status = 0;
        } else {
            this.status = i4;
        }
        if ((i & 8192) == 0) {
            this.strategyMode = 0;
        } else {
            this.strategyMode = i5;
        }
        this.toToken = (i & 16384) == 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo2;
        this.triggerInfo = (32768 & i) == 0 ? new TriggerInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : triggerInfo;
        if ((i & 65536) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str8;
        }
        this.orderSubStatus$delegate = C56392yDr.copydefault(new Function0() { // from class: o.gUN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CTOpenOrderResponse._init_$lambda$1(this.AEQbTJ);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [210=4] */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CTOpenOrderResponse cTOpenOrderResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cTOpenOrderResponse.canResume) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, cTOpenOrderResponse.canResume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) cTOpenOrderResponse.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, cTOpenOrderResponse.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) cTOpenOrderResponse.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, cTOpenOrderResponse.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) cTOpenOrderResponse.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, cTOpenOrderResponse.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) cTOpenOrderResponse.chainSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, cTOpenOrderResponse.chainSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) cTOpenOrderResponse.createTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, cTOpenOrderResponse.createTime);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, cTOpenOrderResponse.exchangeDirection);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) cTOpenOrderResponse.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, cTOpenOrderResponse.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(cTOpenOrderResponse.fromToken, new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, TokenInfo$$serializer.INSTANCE, cTOpenOrderResponse.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) cTOpenOrderResponse.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, cTOpenOrderResponse.orderId);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 10, cTOpenOrderResponse.orderType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || cTOpenOrderResponse.realizedPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, PnLDetail$$serializer.INSTANCE, cTOpenOrderResponse.realizedPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || cTOpenOrderResponse.status != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, cTOpenOrderResponse.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || cTOpenOrderResponse.strategyMode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, cTOpenOrderResponse.strategyMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(cTOpenOrderResponse.toToken, new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, TokenInfo$$serializer.INSTANCE, cTOpenOrderResponse.toToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(cTOpenOrderResponse.triggerInfo, new TriggerInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 15, TriggerInfo$$serializer.INSTANCE, cTOpenOrderResponse.triggerInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) cTOpenOrderResponse.userWalletAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, cTOpenOrderResponse.userWalletAddress);
    }

    public CTOpenOrderResponse(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull String str6, @NotNull TokenInfo tokenInfo, @NotNull String str7, int i2, PnLDetail pnLDetail, int i3, int i4, @NotNull TokenInfo tokenInfo2, @NotNull TriggerInfo triggerInfo, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(tokenInfo2, "");
        Intrinsics.checkNotNullParameter(triggerInfo, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.canResume = z;
        this.chainId = str;
        this.chainLogoUrl = str2;
        this.chainName = str3;
        this.chainSymbol = str4;
        this.createTime = str5;
        this.exchangeDirection = i;
        this.expireTime = str6;
        this.fromToken = tokenInfo;
        this.orderId = str7;
        this.orderType = i2;
        this.realizedPnl = pnLDetail;
        this.status = i3;
        this.strategyMode = i4;
        this.toToken = tokenInfo2;
        this.triggerInfo = triggerInfo;
        this.userWalletAddress = str8;
        this.orderSubStatus$delegate = C56392yDr.copydefault(new Function0() { // from class: o.gUQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CTOpenOrderResponse.orderSubStatus_delegate$lambda$0(this.KWHzl);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00df: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r50v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r50v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r50v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r50v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r50v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r50v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (r39v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r50v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.order.domain.model.TokenInfo:?: TERNARY null = ((wrap:int:0x003d: ARITH (r50v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005b: CONSTRUCTOR 
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:221) call: com.okinc.business.dex.trade.order.domain.model.TokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r41v0 com.okinc.business.dex.trade.order.domain.model.TokenInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0061: ARITH (r50v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (r43v0 int)
  (wrap:com.okinc.business.dex.trade.copytrading.home.data.PnLDetail:?: TERNARY null = ((wrap:int:0x0069: ARITH (r50v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.copytrading.home.data.PnLDetail) : (r44v0 com.okinc.business.dex.trade.copytrading.home.data.PnLDetail))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0072: ARITH (r50v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r45v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x007b: ARITH (r50v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r46v0 int))
  (wrap:com.okinc.business.dex.trade.order.domain.model.TokenInfo:?: TERNARY null = ((wrap:int:0x0084: ARITH (r50v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a6: CONSTRUCTOR 
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:227) call: com.okinc.business.dex.trade.order.domain.model.TokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r47v0 com.okinc.business.dex.trade.order.domain.model.TokenInfo))
  (wrap:com.okinc.business.dex.trade.order.domain.model.TriggerInfo:?: TERNARY null = ((wrap:int:0x00af: ARITH (32768 int) & (r50v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ca: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:228) call: com.okinc.business.dex.trade.order.domain.model.TriggerInfo.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r48v0 com.okinc.business.dex.trade.order.domain.model.TriggerInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r50v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, com.okinc.business.dex.trade.order.domain.model.TokenInfo, java.lang.String, int, com.okinc.business.dex.trade.copytrading.home.data.PnLDetail, int, int, com.okinc.business.dex.trade.order.domain.model.TokenInfo, com.okinc.business.dex.trade.order.domain.model.TriggerInfo, java.lang.String):void (m)] (LINE:212) call: com.okinc.business.dex.trade.copytrading.home.data.CTOpenOrderResponse.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, com.okinc.business.dex.trade.order.domain.model.TokenInfo, java.lang.String, int, com.okinc.business.dex.trade.copytrading.home.data.PnLDetail, int, int, com.okinc.business.dex.trade.order.domain.model.TokenInfo, com.okinc.business.dex.trade.order.domain.model.TriggerInfo, java.lang.String):void type: THIS */
    public /* synthetic */ CTOpenOrderResponse(boolean z, String str, String str2, String str3, String str4, String str5, int i, String str6, TokenInfo tokenInfo, String str7, int i2, PnLDetail pnLDetail, int i3, int i4, TokenInfo tokenInfo2, TriggerInfo triggerInfo, String str8, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? false : z, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? "" : str2, (i5 & 8) != 0 ? "" : str3, (i5 & 16) != 0 ? "" : str4, (i5 & 32) != 0 ? "" : str5, i, (i5 & 128) != 0 ? "" : str6, (i5 & 256) != 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo, (i5 & 512) != 0 ? "" : str7, i2, (i5 & 2048) != 0 ? null : pnLDetail, (i5 & 4096) != 0 ? 0 : i3, (i5 & 8192) != 0 ? 0 : i4, (i5 & 16384) != 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo2, (32768 & i5) != 0 ? new TriggerInfo((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : triggerInfo, (i5 & 65536) != 0 ? "" : str8);
    }

    public final OrderSubStatus getOrderSubStatus() {
        return (OrderSubStatus) this.orderSubStatus$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderSubStatus _init_$lambda$1(CTOpenOrderResponse cTOpenOrderResponse) {
        return OrderSubStatus.Companion.KWHzl(cTOpenOrderResponse.status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderSubStatus orderSubStatus_delegate$lambda$0(CTOpenOrderResponse cTOpenOrderResponse) {
        return OrderSubStatus.Companion.KWHzl(cTOpenOrderResponse.status);
    }
}
