package com.okinc.business.dex.trade.copytrading.home.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class StrategyTokenInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainId;
    private final String chainLogoUrl;
    private final int decimals;
    private final int isNativeToken;
    private final String tokenAmount;
    private final String tokenContractAddress;
    private final boolean tokenIsCurrency;
    private final String tokenLogoUrl;
    private final String tokenName;
    private final String tokenSymbol;
    private final String tokenUsd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StrategyTokenInfo() {
        this((String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, (String) null, (String) null, false, 2047, (DefaultConstructorMarker) null);
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("chainLogoUrl")
    public static /* synthetic */ void getChainLogoUrl$annotations() {
    }

    @SerialName("decimals")
    public static /* synthetic */ void getDecimals$annotations() {
    }

    @SerialName("tokenAmount")
    public static /* synthetic */ void getTokenAmount$annotations() {
    }

    @SerialName("tokenContractAddress")
    public static /* synthetic */ void getTokenContractAddress$annotations() {
    }

    @SerialName("tokenIsCurrency")
    public static /* synthetic */ void getTokenIsCurrency$annotations() {
    }

    @SerialName("tokenLogoUrl")
    public static /* synthetic */ void getTokenLogoUrl$annotations() {
    }

    @SerialName("tokenName")
    public static /* synthetic */ void getTokenName$annotations() {
    }

    @SerialName("tokenSymbol")
    public static /* synthetic */ void getTokenSymbol$annotations() {
    }

    @SerialName("tokenUsd")
    public static /* synthetic */ void getTokenUsd$annotations() {
    }

    @SerialName("isNativeToken")
    public static /* synthetic */ void isNativeToken$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.tokenIsCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyTokenInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i2, @NotNull String str7, @NotNull String str8, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new StrategyTokenInfo(str, str2, str3, i, str4, str5, str6, i2, str7, str8, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyTokenInfo)) {
            return false;
        }
        StrategyTokenInfo strategyTokenInfo = (StrategyTokenInfo) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) strategyTokenInfo.chainId) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) strategyTokenInfo.chainLogoUrl) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) strategyTokenInfo.tokenContractAddress) && this.isNativeToken == strategyTokenInfo.isNativeToken && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) strategyTokenInfo.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenName, (Object) strategyTokenInfo.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) strategyTokenInfo.tokenSymbol) && this.decimals == strategyTokenInfo.decimals && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) strategyTokenInfo.tokenAmount) && Intrinsics.EZpvd((Object) this.tokenUsd, (Object) strategyTokenInfo.tokenUsd) && this.tokenIsCurrency == strategyTokenInfo.tokenIsCurrency;
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
    public final int getDecimals() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTokenIsCurrency() {
        return this.tokenIsCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenUsd() {
        return this.tokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.chainId.hashCode() * 31) + this.chainLogoUrl.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + Integer.hashCode(this.isNativeToken)) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + Integer.hashCode(this.decimals)) * 31) + this.tokenAmount.hashCode()) * 31) + this.tokenUsd.hashCode()) * 31) + Boolean.hashCode(this.tokenIsCurrency);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isNativeToken() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyTokenInfo(chainId=" + this.chainId + ", chainLogoUrl=" + this.chainLogoUrl + ", tokenContractAddress=" + this.tokenContractAddress + ", isNativeToken=" + this.isNativeToken + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ", decimals=" + this.decimals + ", tokenAmount=" + this.tokenAmount + ", tokenUsd=" + this.tokenUsd + ", tokenIsCurrency=" + this.tokenIsCurrency + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.StrategyTokenInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyTokenInfo> serializer() {
            return StrategyTokenInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyTokenInfo(int i, String str, String str2, String str3, int i2, String str4, String str5, String str6, int i3, String str7, String str8, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str3;
        }
        if ((i & 8) == 0) {
            this.isNativeToken = 0;
        } else {
            this.isNativeToken = i2;
        }
        if ((i & 16) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str4;
        }
        if ((i & 32) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str5;
        }
        if ((i & 64) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str6;
        }
        if ((i & 128) == 0) {
            this.decimals = 0;
        } else {
            this.decimals = i3;
        }
        if ((i & 256) == 0) {
            this.tokenAmount = "";
        } else {
            this.tokenAmount = str7;
        }
        if ((i & 512) == 0) {
            this.tokenUsd = "";
        } else {
            this.tokenUsd = str8;
        }
        if ((i & 1024) == 0) {
            this.tokenIsCurrency = false;
        } else {
            this.tokenIsCurrency = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(StrategyTokenInfo strategyTokenInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) strategyTokenInfo.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, strategyTokenInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) strategyTokenInfo.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, strategyTokenInfo.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) strategyTokenInfo.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, strategyTokenInfo.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || strategyTokenInfo.isNativeToken != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, strategyTokenInfo.isNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) strategyTokenInfo.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, strategyTokenInfo.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) strategyTokenInfo.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, strategyTokenInfo.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) strategyTokenInfo.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, strategyTokenInfo.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || strategyTokenInfo.decimals != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, strategyTokenInfo.decimals);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) strategyTokenInfo.tokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, strategyTokenInfo.tokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) strategyTokenInfo.tokenUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, strategyTokenInfo.tokenUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || strategyTokenInfo.tokenIsCurrency) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, strategyTokenInfo.tokenIsCurrency);
        }
    }

    public StrategyTokenInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i2, @NotNull String str7, @NotNull String str8, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.chainId = str;
        this.chainLogoUrl = str2;
        this.tokenContractAddress = str3;
        this.isNativeToken = i;
        this.tokenLogoUrl = str4;
        this.tokenName = str5;
        this.tokenSymbol = str6;
        this.decimals = i2;
        this.tokenAmount = str7;
        this.tokenUsd = str8;
        this.tokenIsCurrency = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003b: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r25v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r24v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, boolean):void (m)] (LINE:151) call: com.okinc.business.dex.trade.copytrading.home.data.StrategyTokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ StrategyTokenInfo(String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, String str7, String str8, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? "" : str7, (i3 & 512) == 0 ? str8 : "", (i3 & 1024) == 0 ? z : false);
    }
}
