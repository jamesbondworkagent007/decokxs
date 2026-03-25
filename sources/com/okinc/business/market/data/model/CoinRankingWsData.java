package com.okinc.business.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class CoinRankingWsData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainId;
    private final String change;
    private final String change1H;
    private final String change24H;
    private final String change4H;
    private final String change5M;
    private final String holders;
    private final String marketCap;
    private final String price;
    private final String riskControlLevel;
    private final String tokenContractAddress;
    private final String tokenLogoUrl;
    private final String tokenSymbol;
    private final String txs;
    private final String volume;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinRankingWsData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.txs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.holders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.change5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.change1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.change4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.change24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinRankingWsData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15) {
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
        return new CoinRankingWsData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinRankingWsData)) {
            return false;
        }
        CoinRankingWsData coinRankingWsData = (CoinRankingWsData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) coinRankingWsData.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) coinRankingWsData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) coinRankingWsData.tokenSymbol) && Intrinsics.EZpvd((Object) this.price, (Object) coinRankingWsData.price) && Intrinsics.EZpvd((Object) this.change, (Object) coinRankingWsData.change) && Intrinsics.EZpvd((Object) this.change5M, (Object) coinRankingWsData.change5M) && Intrinsics.EZpvd((Object) this.change1H, (Object) coinRankingWsData.change1H) && Intrinsics.EZpvd((Object) this.change4H, (Object) coinRankingWsData.change4H) && Intrinsics.EZpvd((Object) this.change24H, (Object) coinRankingWsData.change24H) && Intrinsics.EZpvd((Object) this.volume, (Object) coinRankingWsData.volume) && Intrinsics.EZpvd((Object) this.txs, (Object) coinRankingWsData.txs) && Intrinsics.EZpvd((Object) this.marketCap, (Object) coinRankingWsData.marketCap) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) coinRankingWsData.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.holders, (Object) coinRankingWsData.holders) && Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) coinRankingWsData.riskControlLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChange() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChange1H() {
        return this.change1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChange24H() {
        return this.change24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChange4H() {
        return this.change4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChange5M() {
        return this.change5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHolders() {
        return this.holders;
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
    public final String getRiskControlLevel() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxs() {
        return this.txs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.chainId.hashCode() * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.price.hashCode()) * 31) + this.change.hashCode()) * 31) + this.change5M.hashCode()) * 31) + this.change1H.hashCode()) * 31) + this.change4H.hashCode()) * 31) + this.change24H.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.txs.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.holders.hashCode()) * 31) + this.riskControlLevel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinRankingWsData(chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenSymbol=" + this.tokenSymbol + ", price=" + this.price + ", change=" + this.change + ", change5M=" + this.change5M + ", change1H=" + this.change1H + ", change4H=" + this.change4H + ", change24H=" + this.change24H + ", volume=" + this.volume + ", txs=" + this.txs + ", marketCap=" + this.marketCap + ", tokenLogoUrl=" + this.tokenLogoUrl + ", holders=" + this.holders + ", riskControlLevel=" + this.riskControlLevel + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.CoinRankingWsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinRankingWsData> serializer() {
            return CoinRankingWsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinRankingWsData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str2;
        }
        if ((i & 4) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str3;
        }
        if ((i & 8) == 0) {
            this.price = "";
        } else {
            this.price = str4;
        }
        if ((i & 16) == 0) {
            this.change = "";
        } else {
            this.change = str5;
        }
        if ((i & 32) == 0) {
            this.change5M = "";
        } else {
            this.change5M = str6;
        }
        if ((i & 64) == 0) {
            this.change1H = "";
        } else {
            this.change1H = str7;
        }
        if ((i & 128) == 0) {
            this.change4H = "";
        } else {
            this.change4H = str8;
        }
        if ((i & 256) == 0) {
            this.change24H = "";
        } else {
            this.change24H = str9;
        }
        if ((i & 512) == 0) {
            this.volume = "";
        } else {
            this.volume = str10;
        }
        if ((i & 1024) == 0) {
            this.txs = "";
        } else {
            this.txs = str11;
        }
        if ((i & 2048) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str12;
        }
        if ((i & 4096) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str13;
        }
        if ((i & 8192) == 0) {
            this.holders = "";
        } else {
            this.holders = str14;
        }
        if ((i & 16384) == 0) {
            this.riskControlLevel = "";
        } else {
            this.riskControlLevel = str15;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CoinRankingWsData coinRankingWsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) coinRankingWsData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, coinRankingWsData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) coinRankingWsData.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, coinRankingWsData.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) coinRankingWsData.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, coinRankingWsData.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) coinRankingWsData.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, coinRankingWsData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) coinRankingWsData.change, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, coinRankingWsData.change);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) coinRankingWsData.change5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, coinRankingWsData.change5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) coinRankingWsData.change1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, coinRankingWsData.change1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) coinRankingWsData.change4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, coinRankingWsData.change4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) coinRankingWsData.change24H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, coinRankingWsData.change24H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) coinRankingWsData.volume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, coinRankingWsData.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) coinRankingWsData.txs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, coinRankingWsData.txs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) coinRankingWsData.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, coinRankingWsData.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) coinRankingWsData.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, coinRankingWsData.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) coinRankingWsData.holders, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, coinRankingWsData.holders);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && Intrinsics.EZpvd((Object) coinRankingWsData.riskControlLevel, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 14, coinRankingWsData.riskControlLevel);
    }

    public CoinRankingWsData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15) {
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
        this.chainId = str;
        this.tokenContractAddress = str2;
        this.tokenSymbol = str3;
        this.price = str4;
        this.change = str5;
        this.change5M = str6;
        this.change1H = str7;
        this.change4H = str8;
        this.change24H = str9;
        this.volume = str10;
        this.txs = str11;
        this.marketCap = str12;
        this.tokenLogoUrl = str13;
        this.holders = str14;
        this.riskControlLevel = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0074: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.market.data.model.CoinRankingWsData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CoinRankingWsData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) == 0 ? str15 : "");
    }
}
