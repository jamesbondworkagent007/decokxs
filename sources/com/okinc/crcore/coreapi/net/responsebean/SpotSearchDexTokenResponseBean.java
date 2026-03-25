package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SpotSearchDexTokenResponseBean {
    private String chainId;
    private String chainLogo;
    private String chainName;
    private boolean communityRecognized;
    private String liquidity;
    private String price;
    private String priceChange1H;
    private String priceChange24H;
    private String priceChange4H;
    private final String riskLevel;
    private String tokenContractAddress;
    private String tokenLogo;
    private String tokenName;
    private String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotSearchDexTokenResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.priceChange4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.priceChange1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.priceChange24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotSearchDexTokenResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, boolean z, @NotNull String str13) {
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
        return new SpotSearchDexTokenResponseBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpotSearchDexTokenResponseBean)) {
            return false;
        }
        SpotSearchDexTokenResponseBean spotSearchDexTokenResponseBean = (SpotSearchDexTokenResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) spotSearchDexTokenResponseBean.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) spotSearchDexTokenResponseBean.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) spotSearchDexTokenResponseBean.chainLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) spotSearchDexTokenResponseBean.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) spotSearchDexTokenResponseBean.tokenName) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) spotSearchDexTokenResponseBean.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) spotSearchDexTokenResponseBean.tokenLogo) && Intrinsics.EZpvd((Object) this.price, (Object) spotSearchDexTokenResponseBean.price) && Intrinsics.EZpvd((Object) this.priceChange24H, (Object) spotSearchDexTokenResponseBean.priceChange24H) && Intrinsics.EZpvd((Object) this.priceChange4H, (Object) spotSearchDexTokenResponseBean.priceChange4H) && Intrinsics.EZpvd((Object) this.priceChange1H, (Object) spotSearchDexTokenResponseBean.priceChange1H) && Intrinsics.EZpvd((Object) this.liquidity, (Object) spotSearchDexTokenResponseBean.liquidity) && this.communityRecognized == spotSearchDexTokenResponseBean.communityRecognized && Intrinsics.EZpvd((Object) this.riskLevel, (Object) spotSearchDexTokenResponseBean.riskLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCommunityRecognized() {
        return this.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidity() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChange1H() {
        return this.priceChange1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChange24H() {
        return this.priceChange24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChange4H() {
        return this.priceChange4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskLevel() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
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
    public int hashCode() {
        return (((((((((((((((((((((((((this.chainId.hashCode() * 31) + this.chainName.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenLogo.hashCode()) * 31) + this.price.hashCode()) * 31) + this.priceChange24H.hashCode()) * 31) + this.priceChange4H.hashCode()) * 31) + this.priceChange1H.hashCode()) * 31) + this.liquidity.hashCode()) * 31) + Boolean.hashCode(this.communityRecognized)) * 31) + this.riskLevel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCommunityRecognized(boolean z) {
        this.communityRecognized = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiquidity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liquidity = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChange1H(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceChange1H = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChange24H(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceChange24H = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChange4H(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceChange4H = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenContractAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenContractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotSearchDexTokenResponseBean(chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogo=" + this.tokenLogo + ", price=" + this.price + ", priceChange24H=" + this.priceChange24H + ", priceChange4H=" + this.priceChange4H + ", priceChange1H=" + this.priceChange1H + ", liquidity=" + this.liquidity + ", communityRecognized=" + this.communityRecognized + ", riskLevel=" + this.riskLevel + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.SpotSearchDexTokenResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotSearchDexTokenResponseBean> serializer() {
            return SpotSearchDexTokenResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotSearchDexTokenResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
        if ((i & 4) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str3;
        }
        if ((i & 8) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str4;
        }
        if ((i & 16) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str5;
        }
        if ((i & 32) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str6;
        }
        if ((i & 64) == 0) {
            this.tokenLogo = "";
        } else {
            this.tokenLogo = str7;
        }
        if ((i & 128) == 0) {
            this.price = "";
        } else {
            this.price = str8;
        }
        if ((i & 256) == 0) {
            this.priceChange24H = "";
        } else {
            this.priceChange24H = str9;
        }
        if ((i & 512) == 0) {
            this.priceChange4H = "";
        } else {
            this.priceChange4H = str10;
        }
        if ((i & 1024) == 0) {
            this.priceChange1H = "";
        } else {
            this.priceChange1H = str11;
        }
        if ((i & 2048) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str12;
        }
        this.communityRecognized = (i & 4096) == 0 ? false : z;
        if ((i & 8192) == 0) {
            this.riskLevel = "";
        } else {
            this.riskLevel = str13;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SpotSearchDexTokenResponseBean spotSearchDexTokenResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) spotSearchDexTokenResponseBean.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, spotSearchDexTokenResponseBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) spotSearchDexTokenResponseBean.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, spotSearchDexTokenResponseBean.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) spotSearchDexTokenResponseBean.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, spotSearchDexTokenResponseBean.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) spotSearchDexTokenResponseBean.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, spotSearchDexTokenResponseBean.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) spotSearchDexTokenResponseBean.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, spotSearchDexTokenResponseBean.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) spotSearchDexTokenResponseBean.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, spotSearchDexTokenResponseBean.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) spotSearchDexTokenResponseBean.tokenLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, spotSearchDexTokenResponseBean.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) spotSearchDexTokenResponseBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, spotSearchDexTokenResponseBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) spotSearchDexTokenResponseBean.priceChange24H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, spotSearchDexTokenResponseBean.priceChange24H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) spotSearchDexTokenResponseBean.priceChange4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, spotSearchDexTokenResponseBean.priceChange4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) spotSearchDexTokenResponseBean.priceChange1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, spotSearchDexTokenResponseBean.priceChange1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) spotSearchDexTokenResponseBean.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, spotSearchDexTokenResponseBean.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || spotSearchDexTokenResponseBean.communityRecognized) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, spotSearchDexTokenResponseBean.communityRecognized);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) spotSearchDexTokenResponseBean.riskLevel, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, spotSearchDexTokenResponseBean.riskLevel);
    }

    public SpotSearchDexTokenResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, boolean z, @NotNull String str13) {
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
        this.chainId = str;
        this.chainName = str2;
        this.chainLogo = str3;
        this.tokenSymbol = str4;
        this.tokenName = str5;
        this.tokenContractAddress = str6;
        this.tokenLogo = str7;
        this.price = str8;
        this.priceChange24H = str9;
        this.priceChange4H = str10;
        this.priceChange1H = str11;
        this.liquidity = str12;
        this.communityRecognized = z;
        this.riskLevel = str13;
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
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0064: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.SpotSearchDexTokenResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ SpotSearchDexTokenResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? false : z, (i & 8192) == 0 ? str13 : "");
    }

    public final boolean isTradeable() {
        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(this.riskLevel);
        return intOrNull == null || intOrNull.intValue() <= 4;
    }
}
