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
public final class MarketInfoData {
    public final String circulatingSupply;
    public final String fdv;
    public final String holders;
    public final String lpTokenBurntRatio;
    public String marketCap;
    public final String maxSupply;
    public final String priceChange1H;
    public final String priceChange24H;
    public final String priceChange4H;
    public final String priceChange5M;
    public final String riskControlLevel;
    public final String snipersClear;
    public final String snipersTotal;
    public final String suspiciousRatio;
    public final String tokenCreateTime;
    public final String tokenCreatorAddress;
    public final String totalLiquidity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketInfoData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.circulatingSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.priceChange4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.maxSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.snipersTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.tokenCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.lpTokenBurntRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.fdv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.holders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketInfoData copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
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
        return new MarketInfoData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.priceChange24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketInfoData)) {
            return false;
        }
        MarketInfoData marketInfoData = (MarketInfoData) obj;
        return Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) marketInfoData.riskControlLevel) && Intrinsics.EZpvd((Object) this.holders, (Object) marketInfoData.holders) && Intrinsics.EZpvd((Object) this.circulatingSupply, (Object) marketInfoData.circulatingSupply) && Intrinsics.EZpvd((Object) this.maxSupply, (Object) marketInfoData.maxSupply) && Intrinsics.EZpvd((Object) this.totalLiquidity, (Object) marketInfoData.totalLiquidity) && Intrinsics.EZpvd((Object) this.marketCap, (Object) marketInfoData.marketCap) && Intrinsics.EZpvd((Object) this.priceChange24H, (Object) marketInfoData.priceChange24H) && Intrinsics.EZpvd((Object) this.priceChange4H, (Object) marketInfoData.priceChange4H) && Intrinsics.EZpvd((Object) this.priceChange1H, (Object) marketInfoData.priceChange1H) && Intrinsics.EZpvd((Object) this.priceChange5M, (Object) marketInfoData.priceChange5M) && Intrinsics.EZpvd((Object) this.fdv, (Object) marketInfoData.fdv) && Intrinsics.EZpvd((Object) this.tokenCreateTime, (Object) marketInfoData.tokenCreateTime) && Intrinsics.EZpvd((Object) this.tokenCreatorAddress, (Object) marketInfoData.tokenCreatorAddress) && Intrinsics.EZpvd((Object) this.lpTokenBurntRatio, (Object) marketInfoData.lpTokenBurntRatio) && Intrinsics.EZpvd((Object) this.snipersClear, (Object) marketInfoData.snipersClear) && Intrinsics.EZpvd((Object) this.snipersTotal, (Object) marketInfoData.snipersTotal) && Intrinsics.EZpvd((Object) this.suspiciousRatio, (Object) marketInfoData.suspiciousRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.totalLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.tokenCreatorAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.suspiciousRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.priceChange1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.riskControlLevel.hashCode() * 31) + this.holders.hashCode()) * 31) + this.circulatingSupply.hashCode()) * 31) + this.maxSupply.hashCode()) * 31) + this.totalLiquidity.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.priceChange24H.hashCode()) * 31) + this.priceChange4H.hashCode()) * 31) + this.priceChange1H.hashCode()) * 31) + this.priceChange5M.hashCode()) * 31) + this.fdv.hashCode()) * 31) + this.tokenCreateTime.hashCode()) * 31) + this.tokenCreatorAddress.hashCode()) * 31) + this.lpTokenBurntRatio.hashCode()) * 31) + this.snipersClear.hashCode()) * 31) + this.snipersTotal.hashCode()) * 31) + this.suspiciousRatio.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketInfoData(riskControlLevel=" + this.riskControlLevel + ", holders=" + this.holders + ", circulatingSupply=" + this.circulatingSupply + ", maxSupply=" + this.maxSupply + ", totalLiquidity=" + this.totalLiquidity + ", marketCap=" + this.marketCap + ", priceChange24H=" + this.priceChange24H + ", priceChange4H=" + this.priceChange4H + ", priceChange1H=" + this.priceChange1H + ", priceChange5M=" + this.priceChange5M + ", fdv=" + this.fdv + ", tokenCreateTime=" + this.tokenCreateTime + ", tokenCreatorAddress=" + this.tokenCreatorAddress + ", lpTokenBurntRatio=" + this.lpTokenBurntRatio + ", snipersClear=" + this.snipersClear + ", snipersTotal=" + this.snipersTotal + ", suspiciousRatio=" + this.suspiciousRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.priceChange5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.snipersClear;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.MarketInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarketInfoData> serializer() {
            return MarketInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarketInfoData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.riskControlLevel = "";
        } else {
            this.riskControlLevel = str;
        }
        if ((i & 2) == 0) {
            this.holders = "";
        } else {
            this.holders = str2;
        }
        if ((i & 4) == 0) {
            this.circulatingSupply = "";
        } else {
            this.circulatingSupply = str3;
        }
        if ((i & 8) == 0) {
            this.maxSupply = "";
        } else {
            this.maxSupply = str4;
        }
        if ((i & 16) == 0) {
            this.totalLiquidity = "";
        } else {
            this.totalLiquidity = str5;
        }
        if ((i & 32) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str6;
        }
        if ((i & 64) == 0) {
            this.priceChange24H = "";
        } else {
            this.priceChange24H = str7;
        }
        if ((i & 128) == 0) {
            this.priceChange4H = "";
        } else {
            this.priceChange4H = str8;
        }
        if ((i & 256) == 0) {
            this.priceChange1H = "";
        } else {
            this.priceChange1H = str9;
        }
        if ((i & 512) == 0) {
            this.priceChange5M = "";
        } else {
            this.priceChange5M = str10;
        }
        if ((i & 1024) == 0) {
            this.fdv = "";
        } else {
            this.fdv = str11;
        }
        if ((i & 2048) == 0) {
            this.tokenCreateTime = "";
        } else {
            this.tokenCreateTime = str12;
        }
        if ((i & 4096) == 0) {
            this.tokenCreatorAddress = "";
        } else {
            this.tokenCreatorAddress = str13;
        }
        if ((i & 8192) == 0) {
            this.lpTokenBurntRatio = "";
        } else {
            this.lpTokenBurntRatio = str14;
        }
        if ((i & 16384) == 0) {
            this.snipersClear = "";
        } else {
            this.snipersClear = str15;
        }
        if ((32768 & i) == 0) {
            this.snipersTotal = "";
        } else {
            this.snipersTotal = str16;
        }
        if ((i & 65536) == 0) {
            this.suspiciousRatio = "";
        } else {
            this.suspiciousRatio = str17;
        }
    }

    public static final /* synthetic */ void EZpvd(MarketInfoData marketInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) marketInfoData.riskControlLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, marketInfoData.riskControlLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) marketInfoData.holders, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, marketInfoData.holders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) marketInfoData.circulatingSupply, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, marketInfoData.circulatingSupply);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) marketInfoData.maxSupply, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, marketInfoData.maxSupply);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) marketInfoData.totalLiquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, marketInfoData.totalLiquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) marketInfoData.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, marketInfoData.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) marketInfoData.priceChange24H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, marketInfoData.priceChange24H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) marketInfoData.priceChange4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, marketInfoData.priceChange4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) marketInfoData.priceChange1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, marketInfoData.priceChange1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) marketInfoData.priceChange5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, marketInfoData.priceChange5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) marketInfoData.fdv, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, marketInfoData.fdv);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) marketInfoData.tokenCreateTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, marketInfoData.tokenCreateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) marketInfoData.tokenCreatorAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, marketInfoData.tokenCreatorAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) marketInfoData.lpTokenBurntRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, marketInfoData.lpTokenBurntRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) marketInfoData.snipersClear, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, marketInfoData.snipersClear);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) marketInfoData.snipersTotal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, marketInfoData.snipersTotal);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) marketInfoData.suspiciousRatio, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, marketInfoData.suspiciousRatio);
    }

    public MarketInfoData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
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
        this.riskControlLevel = str;
        this.holders = str2;
        this.circulatingSupply = str3;
        this.maxSupply = str4;
        this.totalLiquidity = str5;
        this.marketCap = str6;
        this.priceChange24H = str7;
        this.priceChange4H = str8;
        this.priceChange1H = str9;
        this.priceChange5M = str10;
        this.fdv = str11;
        this.tokenCreateTime = str12;
        this.tokenCreatorAddress = str13;
        this.lpTokenBurntRatio = str14;
        this.snipersClear = str15;
        this.snipersTotal = str16;
        this.suspiciousRatio = str17;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ba: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:55) call: com.okinc.business.market.data.model.MarketInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MarketInfoData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17);
    }
}
