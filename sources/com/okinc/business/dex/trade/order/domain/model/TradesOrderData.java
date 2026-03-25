package com.okinc.business.dex.trade.order.domain.model;

import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import o.C20074gZy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TradesOrderData {
    private final long chainId;
    private final String chainLogoUrl;
    private final String chainName;
    private final TokenInfo fromToken;
    private final String nativeTokenSymbol;
    private final JsonElement networkFee;
    private final long orderId;
    private final int orderType;
    private final ServiceFeeInfo serviceFee;
    private final int status;
    private final int strategyMode;
    private final TokenInfo toToken;
    private final String tradeTime;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradesOrderData() {
        this(0L, (String) null, (String) null, (TokenInfo) null, (String) null, (JsonElement) null, 0L, 0, 0, 0, (TokenInfo) null, (String) null, (String) null, (ServiceFeeInfo) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo component11() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component14() {
        return this.serviceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo component4() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component6() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradesOrderData copy(long j, @NotNull String str, @NotNull String str2, @NotNull TokenInfo tokenInfo, @NotNull String str3, JsonElement jsonElement, long j2, int i, int i2, int i3, @NotNull TokenInfo tokenInfo2, @NotNull String str4, @NotNull String str5, ServiceFeeInfo serviceFeeInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tokenInfo2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new TradesOrderData(j, str, str2, tokenInfo, str3, jsonElement, j2, i, i2, i3, tokenInfo2, str4, str5, serviceFeeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradesOrderData)) {
            return false;
        }
        TradesOrderData tradesOrderData = (TradesOrderData) obj;
        return this.chainId == tradesOrderData.chainId && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) tradesOrderData.chainLogoUrl) && Intrinsics.EZpvd((Object) this.chainName, (Object) tradesOrderData.chainName) && Intrinsics.EZpvd(this.fromToken, tradesOrderData.fromToken) && Intrinsics.EZpvd((Object) this.nativeTokenSymbol, (Object) tradesOrderData.nativeTokenSymbol) && Intrinsics.EZpvd(this.networkFee, tradesOrderData.networkFee) && this.orderId == tradesOrderData.orderId && this.orderType == tradesOrderData.orderType && this.status == tradesOrderData.status && this.strategyMode == tradesOrderData.strategyMode && Intrinsics.EZpvd(this.toToken, tradesOrderData.toToken) && Intrinsics.EZpvd((Object) this.tradeTime, (Object) tradesOrderData.tradeTime) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) tradesOrderData.userWalletAddress) && Intrinsics.EZpvd(this.serviceFee, tradesOrderData.serviceFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
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
    public final TokenInfo getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenSymbol() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getNetworkFee() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo getServiceFee() {
        return this.serviceFee;
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
    public final String getTradeTime() {
        return this.tradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.chainId);
        int iHashCode2 = this.chainLogoUrl.hashCode();
        int iHashCode3 = this.chainName.hashCode();
        int iHashCode4 = this.fromToken.hashCode();
        int iHashCode5 = this.nativeTokenSymbol.hashCode();
        JsonElement jsonElement = this.networkFee;
        int iHashCode6 = jsonElement == null ? 0 : jsonElement.hashCode();
        int iHashCode7 = Long.hashCode(this.orderId);
        int iHashCode8 = Integer.hashCode(this.orderType);
        int iHashCode9 = Integer.hashCode(this.status);
        int iHashCode10 = Integer.hashCode(this.strategyMode);
        int iHashCode11 = this.toToken.hashCode();
        int iHashCode12 = this.tradeTime.hashCode();
        int iHashCode13 = this.userWalletAddress.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFee;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (serviceFeeInfo != null ? serviceFeeInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradesOrderData(chainId=" + this.chainId + ", chainLogoUrl=" + this.chainLogoUrl + ", chainName=" + this.chainName + ", fromToken=" + this.fromToken + ", nativeTokenSymbol=" + this.nativeTokenSymbol + ", networkFee=" + this.networkFee + ", orderId=" + this.orderId + ", orderType=" + this.orderType + ", status=" + this.status + ", strategyMode=" + this.strategyMode + ", toToken=" + this.toToken + ", tradeTime=" + this.tradeTime + ", userWalletAddress=" + this.userWalletAddress + ", serviceFee=" + this.serviceFee + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.TradesOrderData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradesOrderData> serializer() {
            return TradesOrderData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradesOrderData(int i, long j, String str, String str2, TokenInfo tokenInfo, String str3, JsonElement jsonElement, long j2, int i2, int i3, int i4, TokenInfo tokenInfo2, String str4, String str5, ServiceFeeInfo serviceFeeInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = 0L;
        } else {
            this.chainId = j;
        }
        if ((i & 2) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str;
        }
        if ((i & 4) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
        this.fromToken = (i & 8) == 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo;
        if ((i & 16) == 0) {
            this.nativeTokenSymbol = "";
        } else {
            this.nativeTokenSymbol = str3;
        }
        if ((i & 32) == 0) {
            this.networkFee = null;
        } else {
            this.networkFee = jsonElement;
        }
        if ((i & 64) == 0) {
            this.orderId = 0L;
        } else {
            this.orderId = j2;
        }
        if ((i & 128) == 0) {
            this.orderType = -1;
        } else {
            this.orderType = i2;
        }
        if ((i & 256) == 0) {
            this.status = -1;
        } else {
            this.status = i3;
        }
        if ((i & 512) == 0) {
            this.strategyMode = -1;
        } else {
            this.strategyMode = i4;
        }
        this.toToken = (i & 1024) == 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo2;
        if ((i & 2048) == 0) {
            this.tradeTime = "";
        } else {
            this.tradeTime = str4;
        }
        if ((i & 4096) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str5;
        }
        if ((i & 8192) == 0) {
            this.serviceFee = null;
        } else {
            this.serviceFee = serviceFeeInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TradesOrderData tradesOrderData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tradesOrderData.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, tradesOrderData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradesOrderData.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradesOrderData.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradesOrderData.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradesOrderData.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(tradesOrderData.fromToken, new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, TokenInfo$$serializer.INSTANCE, tradesOrderData.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradesOrderData.nativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradesOrderData.nativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tradesOrderData.networkFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, JsonElementSerializer.INSTANCE, tradesOrderData.networkFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tradesOrderData.orderId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, tradesOrderData.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || tradesOrderData.orderType != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, tradesOrderData.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tradesOrderData.status != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, tradesOrderData.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || tradesOrderData.strategyMode != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, tradesOrderData.strategyMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(tradesOrderData.toToken, new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, TokenInfo$$serializer.INSTANCE, tradesOrderData.toToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradesOrderData.tradeTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tradesOrderData.tradeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tradesOrderData.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, tradesOrderData.userWalletAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && tradesOrderData.serviceFee == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, ServiceFeeInfo$$serializer.INSTANCE, tradesOrderData.serviceFee);
    }

    public TradesOrderData(long j, @NotNull String str, @NotNull String str2, @NotNull TokenInfo tokenInfo, @NotNull String str3, JsonElement jsonElement, long j2, int i, int i2, int i3, @NotNull TokenInfo tokenInfo2, @NotNull String str4, @NotNull String str5, ServiceFeeInfo serviceFeeInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tokenInfo2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chainId = j;
        this.chainLogoUrl = str;
        this.chainName = str2;
        this.fromToken = tokenInfo;
        this.nativeTokenSymbol = str3;
        this.networkFee = jsonElement;
        this.orderId = j2;
        this.orderType = i;
        this.status = i2;
        this.strategyMode = i3;
        this.toToken = tokenInfo2;
        this.tradeTime = str4;
        this.userWalletAddress = str5;
        this.serviceFee = serviceFeeInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00cf: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r47v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r31v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r47v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r47v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.order.domain.model.TokenInfo:?: TERNARY null = ((wrap:int:0x001e: ARITH (r47v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: CONSTRUCTOR 
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:83) call: com.okinc.business.dex.trade.order.domain.model.TokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r35v0 com.okinc.business.dex.trade.order.domain.model.TokenInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r47v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:kotlinx.serialization.json.JsonElement:?: TERNARY null = ((wrap:int:0x0047: ARITH (r47v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonElement) : (r37v0 kotlinx.serialization.json.JsonElement))
  (wrap:long:?: TERNARY null = ((wrap:int:0x004f: ARITH (r47v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r38v0 long) : (0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0056: ARITH (r47v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r40v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005f: ARITH (r47v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r41v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0067: ARITH (r47v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r42v0 int) : (-1 int))
  (wrap:com.okinc.business.dex.trade.order.domain.model.TokenInfo:?: TERNARY null = ((wrap:int:0x006e: ARITH (r47v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0090: CONSTRUCTOR 
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:90) call: com.okinc.business.dex.trade.order.domain.model.TokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r43v0 com.okinc.business.dex.trade.order.domain.model.TokenInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0096: ARITH (r47v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a0: ARITH (r47v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r47v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r46v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
 A[MD:(long, java.lang.String, java.lang.String, com.okinc.business.dex.trade.order.domain.model.TokenInfo, java.lang.String, kotlinx.serialization.json.JsonElement, long, int, int, int, com.okinc.business.dex.trade.order.domain.model.TokenInfo, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo):void (m)] (LINE:79) call: com.okinc.business.dex.trade.order.domain.model.TradesOrderData.<init>(long, java.lang.String, java.lang.String, com.okinc.business.dex.trade.order.domain.model.TokenInfo, java.lang.String, kotlinx.serialization.json.JsonElement, long, int, int, int, com.okinc.business.dex.trade.order.domain.model.TokenInfo, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo):void type: THIS */
    public /* synthetic */ TradesOrderData(long j, String str, String str2, TokenInfo tokenInfo, String str3, JsonElement jsonElement, long j2, int i, int i2, int i3, TokenInfo tokenInfo2, String str4, String str5, ServiceFeeInfo serviceFeeInfo, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? null : jsonElement, (i4 & 64) == 0 ? j2 : 0L, (i4 & 128) != 0 ? -1 : i, (i4 & 256) != 0 ? -1 : i2, (i4 & 512) == 0 ? i3 : -1, (i4 & 1024) != 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo2, (i4 & 2048) != 0 ? "" : str4, (i4 & 4096) != 0 ? "" : str5, (i4 & 8192) != 0 ? null : serviceFeeInfo);
    }

    public final C20074gZy toUiData() {
        long j = this.orderId;
        OrderStrategyType orderStrategyTypeCopydefault = OrderStrategyType.Companion.copydefault(this.orderType);
        OrderSubStatus orderSubStatusKWHzl = OrderSubStatus.Companion.KWHzl(this.status);
        long j2 = this.chainId;
        String str = this.chainName;
        String tokenAmount = this.fromToken.getTokenAmount();
        String tokenSymbol = this.fromToken.getTokenSymbol();
        String tokenLogoUrl = this.fromToken.getTokenLogoUrl();
        int i = this.strategyMode;
        String tokenAmount2 = this.toToken.getTokenAmount();
        String tokenSymbol2 = this.toToken.getTokenSymbol();
        String tokenLogoUrl2 = this.toToken.getTokenLogoUrl();
        return new C20074gZy(String.valueOf(j), orderStrategyTypeCopydefault, orderSubStatusKWHzl, String.valueOf(j2), str, tokenAmount, tokenSymbol, tokenLogoUrl, tokenAmount2, tokenSymbol2, this.toToken.getTokenContractAddress(), tokenLogoUrl2, this.tradeTime, i, null, 16384, null);
    }
}
