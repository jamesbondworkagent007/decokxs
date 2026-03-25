package com.okinc.okex.lite_market_api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class DexPriceTickerData {
    private String chainId;
    private String chainLogo;
    private String chainName;
    private boolean communityRecognized;
    private String liquidity;
    private String marketCap;
    private String price;
    private String priceChange;
    private String priceChangeRatio;
    private int riskLevel;
    private String tokenContractAddress;
    private String tokenLogo;
    private String tokenName;
    private String tokenSymbol;
    private String turnOver;
    private String uniqueId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexPriceTickerData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.uniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.priceChangeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.priceChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.turnOver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexPriceTickerData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, int i, boolean z) {
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
        return new DexPriceTickerData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexPriceTickerData)) {
            return false;
        }
        DexPriceTickerData dexPriceTickerData = (DexPriceTickerData) obj;
        return Intrinsics.EZpvd((Object) this.uniqueId, (Object) dexPriceTickerData.uniqueId) && Intrinsics.EZpvd((Object) this.chainId, (Object) dexPriceTickerData.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) dexPriceTickerData.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) dexPriceTickerData.chainLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) dexPriceTickerData.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) dexPriceTickerData.tokenName) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) dexPriceTickerData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) dexPriceTickerData.tokenLogo) && Intrinsics.EZpvd((Object) this.price, (Object) dexPriceTickerData.price) && Intrinsics.EZpvd((Object) this.priceChangeRatio, (Object) dexPriceTickerData.priceChangeRatio) && Intrinsics.EZpvd((Object) this.priceChange, (Object) dexPriceTickerData.priceChange) && Intrinsics.EZpvd((Object) this.liquidity, (Object) dexPriceTickerData.liquidity) && Intrinsics.EZpvd((Object) this.turnOver, (Object) dexPriceTickerData.turnOver) && Intrinsics.EZpvd((Object) this.marketCap, (Object) dexPriceTickerData.marketCap) && this.riskLevel == dexPriceTickerData.riskLevel && this.communityRecognized == dexPriceTickerData.communityRecognized;
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
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChange() {
        return this.priceChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChangeRatio() {
        return this.priceChangeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRiskLevel() {
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
    public final String getTurnOver() {
        return this.turnOver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniqueId() {
        return this.uniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((this.uniqueId.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenLogo.hashCode()) * 31) + this.price.hashCode()) * 31) + this.priceChangeRatio.hashCode()) * 31) + this.priceChange.hashCode()) * 31) + this.liquidity.hashCode()) * 31) + this.turnOver.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + Integer.hashCode(this.riskLevel)) * 31) + Boolean.hashCode(this.communityRecognized);
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
    public final void setMarketCap(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.marketCap = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChange(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceChange = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChangeRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceChangeRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskLevel(int i) {
        this.riskLevel = i;
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
    public final void setTurnOver(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.turnOver = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uniqueId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexPriceTickerData(uniqueId=" + this.uniqueId + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogo=" + this.tokenLogo + ", price=" + this.price + ", priceChangeRatio=" + this.priceChangeRatio + ", priceChange=" + this.priceChange + ", liquidity=" + this.liquidity + ", turnOver=" + this.turnOver + ", marketCap=" + this.marketCap + ", riskLevel=" + this.riskLevel + ", communityRecognized=" + this.communityRecognized + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite_market_api.bean.DexPriceTickerData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexPriceTickerData> serializer() {
            return DexPriceTickerData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexPriceTickerData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.uniqueId = "";
        } else {
            this.uniqueId = str;
        }
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str2;
        }
        if ((i & 4) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str3;
        }
        if ((i & 8) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str4;
        }
        if ((i & 16) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str5;
        }
        if ((i & 32) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str6;
        }
        if ((i & 64) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str7;
        }
        if ((i & 128) == 0) {
            this.tokenLogo = "";
        } else {
            this.tokenLogo = str8;
        }
        if ((i & 256) == 0) {
            this.price = "";
        } else {
            this.price = str9;
        }
        if ((i & 512) == 0) {
            this.priceChangeRatio = "";
        } else {
            this.priceChangeRatio = str10;
        }
        if ((i & 1024) == 0) {
            this.priceChange = "";
        } else {
            this.priceChange = str11;
        }
        if ((i & 2048) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str12;
        }
        if ((i & 4096) == 0) {
            this.turnOver = "";
        } else {
            this.turnOver = str13;
        }
        if ((i & 8192) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str14;
        }
        if ((i & 16384) == 0) {
            this.riskLevel = 0;
        } else {
            this.riskLevel = i2;
        }
        if ((i & 32768) == 0) {
            this.communityRecognized = false;
        } else {
            this.communityRecognized = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarketLite_market_lite_api(DexPriceTickerData dexPriceTickerData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexPriceTickerData.uniqueId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexPriceTickerData.uniqueId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexPriceTickerData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexPriceTickerData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexPriceTickerData.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexPriceTickerData.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexPriceTickerData.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexPriceTickerData.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexPriceTickerData.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexPriceTickerData.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexPriceTickerData.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexPriceTickerData.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexPriceTickerData.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexPriceTickerData.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dexPriceTickerData.tokenLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dexPriceTickerData.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dexPriceTickerData.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dexPriceTickerData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dexPriceTickerData.priceChangeRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, dexPriceTickerData.priceChangeRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) dexPriceTickerData.priceChange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, dexPriceTickerData.priceChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) dexPriceTickerData.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, dexPriceTickerData.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) dexPriceTickerData.turnOver, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, dexPriceTickerData.turnOver);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) dexPriceTickerData.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, dexPriceTickerData.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || dexPriceTickerData.riskLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 14, dexPriceTickerData.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || dexPriceTickerData.communityRecognized) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, dexPriceTickerData.communityRecognized);
        }
    }

    public DexPriceTickerData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, int i, boolean z) {
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
        this.uniqueId = str;
        this.chainId = str2;
        this.chainName = str3;
        this.chainLogo = str4;
        this.tokenSymbol = str5;
        this.tokenName = str6;
        this.tokenContractAddress = str7;
        this.tokenLogo = str8;
        this.price = str9;
        this.priceChangeRatio = str10;
        this.priceChange = str11;
        this.liquidity = str12;
        this.turnOver = str13;
        this.marketCap = str14;
        this.riskLevel = i;
        this.communityRecognized = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00aa: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r35v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r35v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r32v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0073: ARITH (r35v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r33v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0081: ARITH (r35v0 int) & (32768 int) A[WRAPPED]) == (0 int)) ? (r34v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean):void (m)] (LINE:8) call: com.okinc.okex.lite_market_api.bean.DexPriceTickerData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean):void type: THIS */
    public /* synthetic */ DexPriceTickerData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? "" : str11, (i2 & 2048) != 0 ? "" : str12, (i2 & 4096) != 0 ? "" : str13, (i2 & 8192) == 0 ? str14 : "", (i2 & 16384) != 0 ? 0 : i, (i2 & 32768) == 0 ? z : false);
    }
}
