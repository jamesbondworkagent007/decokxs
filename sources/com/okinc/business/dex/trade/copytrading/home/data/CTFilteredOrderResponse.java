package com.okinc.business.dex.trade.copytrading.home.data;

import com.okinc.business.dex.trade.order.domain.model.TokenInfo;
import com.okinc.business.dex.trade.order.domain.model.TokenInfo$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CTFilteredOrderResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainId;
    private final String chainLogoUrl;
    private final String chainName;
    private final String chainSymbol;
    private final int exchangeDirection;
    private final String filteredReason;
    private final String filteredTime;
    private final TokenInfo fromToken;
    private final int orderType;
    private final TokenInfo toToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CTFilteredOrderResponse() {
        this((String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (TokenInfo) null, 0, (TokenInfo) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo component10() {
        return this.toToken;
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
    public final String component4() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.filteredReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.filteredTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo component8() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTFilteredOrderResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull String str6, @NotNull TokenInfo tokenInfo, int i2, @NotNull TokenInfo tokenInfo2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(tokenInfo2, "");
        return new CTFilteredOrderResponse(str, str2, str3, str4, i, str5, str6, tokenInfo, i2, tokenInfo2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTFilteredOrderResponse)) {
            return false;
        }
        CTFilteredOrderResponse cTFilteredOrderResponse = (CTFilteredOrderResponse) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) cTFilteredOrderResponse.chainId) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) cTFilteredOrderResponse.chainLogoUrl) && Intrinsics.EZpvd((Object) this.chainName, (Object) cTFilteredOrderResponse.chainName) && Intrinsics.EZpvd((Object) this.chainSymbol, (Object) cTFilteredOrderResponse.chainSymbol) && this.exchangeDirection == cTFilteredOrderResponse.exchangeDirection && Intrinsics.EZpvd((Object) this.filteredReason, (Object) cTFilteredOrderResponse.filteredReason) && Intrinsics.EZpvd((Object) this.filteredTime, (Object) cTFilteredOrderResponse.filteredTime) && Intrinsics.EZpvd(this.fromToken, cTFilteredOrderResponse.fromToken) && this.orderType == cTFilteredOrderResponse.orderType && Intrinsics.EZpvd(this.toToken, cTFilteredOrderResponse.toToken);
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
    public final int getExchangeDirection() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilteredReason() {
        return this.filteredReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilteredTime() {
        return this.filteredTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.chainId.hashCode() * 31) + this.chainLogoUrl.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.chainSymbol.hashCode()) * 31) + Integer.hashCode(this.exchangeDirection)) * 31) + this.filteredReason.hashCode()) * 31) + this.filteredTime.hashCode()) * 31) + this.fromToken.hashCode()) * 31) + Integer.hashCode(this.orderType)) * 31) + this.toToken.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTFilteredOrderResponse(chainId=" + this.chainId + ", chainLogoUrl=" + this.chainLogoUrl + ", chainName=" + this.chainName + ", chainSymbol=" + this.chainSymbol + ", exchangeDirection=" + this.exchangeDirection + ", filteredReason=" + this.filteredReason + ", filteredTime=" + this.filteredTime + ", fromToken=" + this.fromToken + ", orderType=" + this.orderType + ", toToken=" + this.toToken + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CTFilteredOrderResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTFilteredOrderResponse> serializer() {
            return CTFilteredOrderResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CTFilteredOrderResponse(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6, TokenInfo tokenInfo, int i3, TokenInfo tokenInfo2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str2;
        }
        if ((i & 4) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str3;
        }
        if ((i & 8) == 0) {
            this.chainSymbol = "";
        } else {
            this.chainSymbol = str4;
        }
        if ((i & 16) == 0) {
            this.exchangeDirection = 0;
        } else {
            this.exchangeDirection = i2;
        }
        if ((i & 32) == 0) {
            this.filteredReason = "";
        } else {
            this.filteredReason = str5;
        }
        if ((i & 64) == 0) {
            this.filteredTime = "";
        } else {
            this.filteredTime = str6;
        }
        this.fromToken = (i & 128) == 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo;
        if ((i & 256) == 0) {
            this.orderType = 0;
        } else {
            this.orderType = i3;
        }
        this.toToken = (i & 512) == 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo2;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CTFilteredOrderResponse cTFilteredOrderResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) cTFilteredOrderResponse.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, cTFilteredOrderResponse.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) cTFilteredOrderResponse.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, cTFilteredOrderResponse.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) cTFilteredOrderResponse.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, cTFilteredOrderResponse.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) cTFilteredOrderResponse.chainSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, cTFilteredOrderResponse.chainSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || cTFilteredOrderResponse.exchangeDirection != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, cTFilteredOrderResponse.exchangeDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) cTFilteredOrderResponse.filteredReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, cTFilteredOrderResponse.filteredReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) cTFilteredOrderResponse.filteredTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, cTFilteredOrderResponse.filteredTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(cTFilteredOrderResponse.fromToken, new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, TokenInfo$$serializer.INSTANCE, cTFilteredOrderResponse.fromToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || cTFilteredOrderResponse.orderType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, cTFilteredOrderResponse.orderType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd(cTFilteredOrderResponse.toToken, new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, TokenInfo$$serializer.INSTANCE, cTFilteredOrderResponse.toToken);
    }

    public CTFilteredOrderResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull String str6, @NotNull TokenInfo tokenInfo, int i2, @NotNull TokenInfo tokenInfo2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(tokenInfo2, "");
        this.chainId = str;
        this.chainLogoUrl = str2;
        this.chainName = str3;
        this.chainSymbol = str4;
        this.exchangeDirection = i;
        this.filteredReason = str5;
        this.filteredTime = str6;
        this.fromToken = tokenInfo;
        this.orderType = i2;
        this.toToken = tokenInfo2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r35v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r35v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r35v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
  (wrap:com.okinc.business.dex.trade.order.domain.model.TokenInfo:?: TERNARY null = ((wrap:int:0x003c: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0058: CONSTRUCTOR 
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:256) call: com.okinc.business.dex.trade.order.domain.model.TokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r32v0 com.okinc.business.dex.trade.order.domain.model.TokenInfo))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005e: ARITH (r35v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r33v0 int) : (0 int))
  (wrap:com.okinc.business.dex.trade.order.domain.model.TokenInfo:?: TERNARY null = ((wrap:int:0x0065: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0081: CONSTRUCTOR 
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:258) call: com.okinc.business.dex.trade.order.domain.model.TokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r34v0 com.okinc.business.dex.trade.order.domain.model.TokenInfo))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, com.okinc.business.dex.trade.order.domain.model.TokenInfo, int, com.okinc.business.dex.trade.order.domain.model.TokenInfo):void (m)] (LINE:248) call: com.okinc.business.dex.trade.copytrading.home.data.CTFilteredOrderResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, com.okinc.business.dex.trade.order.domain.model.TokenInfo, int, com.okinc.business.dex.trade.order.domain.model.TokenInfo):void type: THIS */
    public /* synthetic */ CTFilteredOrderResponse(String str, String str2, String str3, String str4, int i, String str5, String str6, TokenInfo tokenInfo, int i2, TokenInfo tokenInfo2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? "" : str5, (i3 & 64) == 0 ? str6 : "", (i3 & 128) != 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo, (i3 & 256) == 0 ? i2 : 0, (i3 & 512) != 0 ? new TokenInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, 2047, (DefaultConstructorMarker) null) : tokenInfo2);
    }
}
