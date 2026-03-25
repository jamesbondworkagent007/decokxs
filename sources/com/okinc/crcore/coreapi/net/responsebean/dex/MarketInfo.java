package com.okinc.crcore.coreapi.net.responsebean.dex;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class MarketInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String burntLiquidity;
    private final String circulatingSupply;
    private final String fdv;
    private final String holders;
    private final String lpTokenBurntRatio;
    private final String marketCap;
    private final String maxSupply;
    private final String priceChange1H;
    private final String priceChange24H;
    private final String priceChange4H;
    private final String priceChange5M;
    private final String riskControlLevel;
    private final String riskLevel;
    private final String snipersClear;
    private final String snipersTotal;
    private final String suspiciousRatio;
    private final String tokenCreateTime;
    private final String tokenCreatorAddress;
    private final String totalLiquidity;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524287, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.burntLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.priceChange4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.priceChange5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.snipersClear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.snipersTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.suspiciousRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.tokenCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.tokenCreatorAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.totalLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.circulatingSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fdv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.holders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.lpTokenBurntRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.maxSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.priceChange1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.priceChange24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19) {
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
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        return new MarketInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketInfo)) {
            return false;
        }
        MarketInfo marketInfo = (MarketInfo) obj;
        return Intrinsics.EZpvd((Object) this.burntLiquidity, (Object) marketInfo.burntLiquidity) && Intrinsics.EZpvd((Object) this.circulatingSupply, (Object) marketInfo.circulatingSupply) && Intrinsics.EZpvd((Object) this.fdv, (Object) marketInfo.fdv) && Intrinsics.EZpvd((Object) this.holders, (Object) marketInfo.holders) && Intrinsics.EZpvd((Object) this.lpTokenBurntRatio, (Object) marketInfo.lpTokenBurntRatio) && Intrinsics.EZpvd((Object) this.marketCap, (Object) marketInfo.marketCap) && Intrinsics.EZpvd((Object) this.maxSupply, (Object) marketInfo.maxSupply) && Intrinsics.EZpvd((Object) this.priceChange1H, (Object) marketInfo.priceChange1H) && Intrinsics.EZpvd((Object) this.priceChange24H, (Object) marketInfo.priceChange24H) && Intrinsics.EZpvd((Object) this.priceChange4H, (Object) marketInfo.priceChange4H) && Intrinsics.EZpvd((Object) this.priceChange5M, (Object) marketInfo.priceChange5M) && Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) marketInfo.riskControlLevel) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) marketInfo.riskLevel) && Intrinsics.EZpvd((Object) this.snipersClear, (Object) marketInfo.snipersClear) && Intrinsics.EZpvd((Object) this.snipersTotal, (Object) marketInfo.snipersTotal) && Intrinsics.EZpvd((Object) this.suspiciousRatio, (Object) marketInfo.suspiciousRatio) && Intrinsics.EZpvd((Object) this.tokenCreateTime, (Object) marketInfo.tokenCreateTime) && Intrinsics.EZpvd((Object) this.tokenCreatorAddress, (Object) marketInfo.tokenCreatorAddress) && Intrinsics.EZpvd((Object) this.totalLiquidity, (Object) marketInfo.totalLiquidity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBurntLiquidity() {
        return this.burntLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCirculatingSupply() {
        return this.circulatingSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFdv() {
        return this.fdv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHolders() {
        return this.holders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLpTokenBurntRatio() {
        return this.lpTokenBurntRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSupply() {
        return this.maxSupply;
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
    public final String getPriceChange5M() {
        return this.priceChange5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskControlLevel() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskLevel() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSnipersClear() {
        return this.snipersClear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSnipersTotal() {
        return this.snipersTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuspiciousRatio() {
        return this.suspiciousRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCreateTime() {
        return this.tokenCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCreatorAddress() {
        return this.tokenCreatorAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalLiquidity() {
        return this.totalLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.burntLiquidity.hashCode() * 31) + this.circulatingSupply.hashCode()) * 31) + this.fdv.hashCode()) * 31) + this.holders.hashCode()) * 31) + this.lpTokenBurntRatio.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.maxSupply.hashCode()) * 31) + this.priceChange1H.hashCode()) * 31) + this.priceChange24H.hashCode()) * 31) + this.priceChange4H.hashCode()) * 31) + this.priceChange5M.hashCode()) * 31) + this.riskControlLevel.hashCode()) * 31) + this.riskLevel.hashCode()) * 31) + this.snipersClear.hashCode()) * 31) + this.snipersTotal.hashCode()) * 31) + this.suspiciousRatio.hashCode()) * 31) + this.tokenCreateTime.hashCode()) * 31) + this.tokenCreatorAddress.hashCode()) * 31) + this.totalLiquidity.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketInfo(burntLiquidity=" + this.burntLiquidity + ", circulatingSupply=" + this.circulatingSupply + ", fdv=" + this.fdv + ", holders=" + this.holders + ", lpTokenBurntRatio=" + this.lpTokenBurntRatio + ", marketCap=" + this.marketCap + ", maxSupply=" + this.maxSupply + ", priceChange1H=" + this.priceChange1H + ", priceChange24H=" + this.priceChange24H + ", priceChange4H=" + this.priceChange4H + ", priceChange5M=" + this.priceChange5M + ", riskControlLevel=" + this.riskControlLevel + ", riskLevel=" + this.riskLevel + ", snipersClear=" + this.snipersClear + ", snipersTotal=" + this.snipersTotal + ", suspiciousRatio=" + this.suspiciousRatio + ", tokenCreateTime=" + this.tokenCreateTime + ", tokenCreatorAddress=" + this.tokenCreatorAddress + ", totalLiquidity=" + this.totalLiquidity + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.MarketInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarketInfo> serializer() {
            return MarketInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarketInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.burntLiquidity = "";
        } else {
            this.burntLiquidity = str;
        }
        if ((i & 2) == 0) {
            this.circulatingSupply = "0";
        } else {
            this.circulatingSupply = str2;
        }
        if ((i & 4) == 0) {
            this.fdv = "";
        } else {
            this.fdv = str3;
        }
        if ((i & 8) == 0) {
            this.holders = "";
        } else {
            this.holders = str4;
        }
        if ((i & 16) == 0) {
            this.lpTokenBurntRatio = "";
        } else {
            this.lpTokenBurntRatio = str5;
        }
        if ((i & 32) == 0) {
            this.marketCap = "0";
        } else {
            this.marketCap = str6;
        }
        if ((i & 64) == 0) {
            this.maxSupply = "";
        } else {
            this.maxSupply = str7;
        }
        if ((i & 128) == 0) {
            this.priceChange1H = "";
        } else {
            this.priceChange1H = str8;
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
            this.priceChange5M = "";
        } else {
            this.priceChange5M = str11;
        }
        if ((i & 2048) == 0) {
            this.riskControlLevel = "";
        } else {
            this.riskControlLevel = str12;
        }
        if ((i & 4096) == 0) {
            this.riskLevel = "";
        } else {
            this.riskLevel = str13;
        }
        if ((i & 8192) == 0) {
            this.snipersClear = "";
        } else {
            this.snipersClear = str14;
        }
        if ((i & 16384) == 0) {
            this.snipersTotal = "";
        } else {
            this.snipersTotal = str15;
        }
        if ((32768 & i) == 0) {
            this.suspiciousRatio = "";
        } else {
            this.suspiciousRatio = str16;
        }
        if ((65536 & i) == 0) {
            this.tokenCreateTime = "";
        } else {
            this.tokenCreateTime = str17;
        }
        if ((131072 & i) == 0) {
            this.tokenCreatorAddress = "";
        } else {
            this.tokenCreatorAddress = str18;
        }
        if ((i & 262144) == 0) {
            this.totalLiquidity = "";
        } else {
            this.totalLiquidity = str19;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(MarketInfo marketInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) marketInfo.burntLiquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, marketInfo.burntLiquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) marketInfo.circulatingSupply, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, marketInfo.circulatingSupply);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) marketInfo.fdv, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, marketInfo.fdv);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) marketInfo.holders, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, marketInfo.holders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) marketInfo.lpTokenBurntRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, marketInfo.lpTokenBurntRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) marketInfo.marketCap, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, marketInfo.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) marketInfo.maxSupply, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, marketInfo.maxSupply);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) marketInfo.priceChange1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, marketInfo.priceChange1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) marketInfo.priceChange24H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, marketInfo.priceChange24H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) marketInfo.priceChange4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, marketInfo.priceChange4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) marketInfo.priceChange5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, marketInfo.priceChange5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) marketInfo.riskControlLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, marketInfo.riskControlLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) marketInfo.riskLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, marketInfo.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) marketInfo.snipersClear, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, marketInfo.snipersClear);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) marketInfo.snipersTotal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, marketInfo.snipersTotal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) marketInfo.suspiciousRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, marketInfo.suspiciousRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) marketInfo.tokenCreateTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, marketInfo.tokenCreateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) marketInfo.tokenCreatorAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, marketInfo.tokenCreatorAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && Intrinsics.EZpvd((Object) marketInfo.totalLiquidity, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 18, marketInfo.totalLiquidity);
    }

    public MarketInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19) {
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
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        this.burntLiquidity = str;
        this.circulatingSupply = str2;
        this.fdv = str3;
        this.holders = str4;
        this.lpTokenBurntRatio = str5;
        this.marketCap = str6;
        this.maxSupply = str7;
        this.priceChange1H = str8;
        this.priceChange24H = str9;
        this.priceChange4H = str10;
        this.priceChange5M = str11;
        this.riskControlLevel = str12;
        this.riskLevel = str13;
        this.snipersClear = str14;
        this.snipersTotal = str15;
        this.suspiciousRatio = str16;
        this.tokenCreateTime = str17;
        this.tokenCreatorAddress = str18;
        this.totalLiquidity = str19;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00d5: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r40v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r40v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : ("0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (r40v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008e: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0099: ARITH (r40v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r40v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:51) call: com.okinc.crcore.coreapi.net.responsebean.dex.MarketInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MarketInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "0", (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19);
    }
}
