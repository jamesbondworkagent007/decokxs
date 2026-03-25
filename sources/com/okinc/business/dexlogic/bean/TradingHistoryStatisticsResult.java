package com.okinc.business.dexlogic.bean;

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
public final class TradingHistoryStatisticsResult {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String boughtAvgPrice;
    public final String buyAmount;
    public final String buyCount;
    public final String buyValue;
    public final int chainId;
    public final String explorerUrl;
    public final String holdAmount;
    public final String holdAmountPercentage;
    public final String holdVolume;
    public final String lastTradeTime;
    public final String maxHoldAmount;
    public final String sellAmount;
    public final String sellCount;
    public final String sellValue;
    public final String soldAvgPrice;
    public final String tokenAddress;
    public final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradingHistoryStatisticsResult() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingHistoryStatisticsResult AEQbTJ(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        return new TradingHistoryStatisticsResult(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.holdAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.sellAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.maxHoldAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.boughtAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.buyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.buyValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.buyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.lastTradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradingHistoryStatisticsResult)) {
            return false;
        }
        TradingHistoryStatisticsResult tradingHistoryStatisticsResult = (TradingHistoryStatisticsResult) obj;
        return this.chainId == tradingHistoryStatisticsResult.chainId && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) tradingHistoryStatisticsResult.tokenAddress) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) tradingHistoryStatisticsResult.walletAddress) && Intrinsics.EZpvd((Object) this.lastTradeTime, (Object) tradingHistoryStatisticsResult.lastTradeTime) && Intrinsics.EZpvd((Object) this.buyCount, (Object) tradingHistoryStatisticsResult.buyCount) && Intrinsics.EZpvd((Object) this.buyAmount, (Object) tradingHistoryStatisticsResult.buyAmount) && Intrinsics.EZpvd((Object) this.buyValue, (Object) tradingHistoryStatisticsResult.buyValue) && Intrinsics.EZpvd((Object) this.boughtAvgPrice, (Object) tradingHistoryStatisticsResult.boughtAvgPrice) && Intrinsics.EZpvd((Object) this.sellCount, (Object) tradingHistoryStatisticsResult.sellCount) && Intrinsics.EZpvd((Object) this.sellAmount, (Object) tradingHistoryStatisticsResult.sellAmount) && Intrinsics.EZpvd((Object) this.sellValue, (Object) tradingHistoryStatisticsResult.sellValue) && Intrinsics.EZpvd((Object) this.soldAvgPrice, (Object) tradingHistoryStatisticsResult.soldAvgPrice) && Intrinsics.EZpvd((Object) this.holdAmount, (Object) tradingHistoryStatisticsResult.holdAmount) && Intrinsics.EZpvd((Object) this.maxHoldAmount, (Object) tradingHistoryStatisticsResult.maxHoldAmount) && Intrinsics.EZpvd((Object) this.holdVolume, (Object) tradingHistoryStatisticsResult.holdVolume) && Intrinsics.EZpvd((Object) this.holdAmountPercentage, (Object) tradingHistoryStatisticsResult.holdAmountPercentage) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) tradingHistoryStatisticsResult.explorerUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.sellValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.holdVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((Integer.hashCode(this.chainId) * 31) + this.tokenAddress.hashCode()) * 31) + this.walletAddress.hashCode()) * 31) + this.lastTradeTime.hashCode()) * 31) + this.buyCount.hashCode()) * 31) + this.buyAmount.hashCode()) * 31) + this.buyValue.hashCode()) * 31) + this.boughtAvgPrice.hashCode()) * 31) + this.sellCount.hashCode()) * 31) + this.sellAmount.hashCode()) * 31) + this.sellValue.hashCode()) * 31) + this.soldAvgPrice.hashCode()) * 31) + this.holdAmount.hashCode()) * 31) + this.maxHoldAmount.hashCode()) * 31) + this.holdVolume.hashCode()) * 31) + this.holdAmountPercentage.hashCode()) * 31) + this.explorerUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.sellCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradingHistoryStatisticsResult(chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", walletAddress=" + this.walletAddress + ", lastTradeTime=" + this.lastTradeTime + ", buyCount=" + this.buyCount + ", buyAmount=" + this.buyAmount + ", buyValue=" + this.buyValue + ", boughtAvgPrice=" + this.boughtAvgPrice + ", sellCount=" + this.sellCount + ", sellAmount=" + this.sellAmount + ", sellValue=" + this.sellValue + ", soldAvgPrice=" + this.soldAvgPrice + ", holdAmount=" + this.holdAmount + ", maxHoldAmount=" + this.maxHoldAmount + ", holdVolume=" + this.holdVolume + ", holdAmountPercentage=" + this.holdAmountPercentage + ", explorerUrl=" + this.explorerUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.holdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.soldAvgPrice;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.TradingHistoryStatisticsResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradingHistoryStatisticsResult> serializer() {
            return TradingHistoryStatisticsResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradingHistoryStatisticsResult(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str;
        }
        if ((i & 4) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str2;
        }
        if ((i & 8) == 0) {
            this.lastTradeTime = "";
        } else {
            this.lastTradeTime = str3;
        }
        if ((i & 16) == 0) {
            this.buyCount = "";
        } else {
            this.buyCount = str4;
        }
        if ((i & 32) == 0) {
            this.buyAmount = "";
        } else {
            this.buyAmount = str5;
        }
        if ((i & 64) == 0) {
            this.buyValue = "";
        } else {
            this.buyValue = str6;
        }
        if ((i & 128) == 0) {
            this.boughtAvgPrice = "";
        } else {
            this.boughtAvgPrice = str7;
        }
        if ((i & 256) == 0) {
            this.sellCount = "";
        } else {
            this.sellCount = str8;
        }
        if ((i & 512) == 0) {
            this.sellAmount = "";
        } else {
            this.sellAmount = str9;
        }
        if ((i & 1024) == 0) {
            this.sellValue = "";
        } else {
            this.sellValue = str10;
        }
        if ((i & 2048) == 0) {
            this.soldAvgPrice = "";
        } else {
            this.soldAvgPrice = str11;
        }
        if ((i & 4096) == 0) {
            this.holdAmount = "";
        } else {
            this.holdAmount = str12;
        }
        if ((i & 8192) == 0) {
            this.maxHoldAmount = "";
        } else {
            this.maxHoldAmount = str13;
        }
        if ((i & 16384) == 0) {
            this.holdVolume = "";
        } else {
            this.holdVolume = str14;
        }
        if ((32768 & i) == 0) {
            this.holdAmountPercentage = "";
        } else {
            this.holdAmountPercentage = str15;
        }
        if ((i & 65536) == 0) {
            this.explorerUrl = "";
        } else {
            this.explorerUrl = str16;
        }
    }

    public static final /* synthetic */ void KWHzl(TradingHistoryStatisticsResult tradingHistoryStatisticsResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tradingHistoryStatisticsResult.chainId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, tradingHistoryStatisticsResult.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradingHistoryStatisticsResult.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradingHistoryStatisticsResult.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.lastTradeTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradingHistoryStatisticsResult.lastTradeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.buyCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradingHistoryStatisticsResult.buyCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.buyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tradingHistoryStatisticsResult.buyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.buyValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tradingHistoryStatisticsResult.buyValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.boughtAvgPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tradingHistoryStatisticsResult.boughtAvgPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.sellCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tradingHistoryStatisticsResult.sellCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.sellAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tradingHistoryStatisticsResult.sellAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.sellValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tradingHistoryStatisticsResult.sellValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.soldAvgPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tradingHistoryStatisticsResult.soldAvgPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.holdAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, tradingHistoryStatisticsResult.holdAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.maxHoldAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, tradingHistoryStatisticsResult.maxHoldAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.holdVolume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tradingHistoryStatisticsResult.holdVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.holdAmountPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, tradingHistoryStatisticsResult.holdAmountPercentage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) tradingHistoryStatisticsResult.explorerUrl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, tradingHistoryStatisticsResult.explorerUrl);
    }

    public TradingHistoryStatisticsResult(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        this.chainId = i;
        this.tokenAddress = str;
        this.walletAddress = str2;
        this.lastTradeTime = str3;
        this.buyCount = str4;
        this.buyAmount = str5;
        this.buyValue = str6;
        this.boughtAvgPrice = str7;
        this.sellCount = str8;
        this.sellAmount = str9;
        this.sellValue = str10;
        this.soldAvgPrice = str11;
        this.holdAmount = str12;
        this.maxHoldAmount = str13;
        this.holdVolume = str14;
        this.holdAmountPercentage = str15;
        this.explorerUrl = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ba: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
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
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:335) call: com.okinc.business.dexlogic.bean.TradingHistoryStatisticsResult.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradingHistoryStatisticsResult(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? "" : str9, (i2 & 1024) != 0 ? "" : str10, (i2 & 2048) != 0 ? "" : str11, (i2 & 4096) != 0 ? "" : str12, (i2 & 8192) != 0 ? "" : str13, (i2 & 16384) != 0 ? "" : str14, (i2 & 32768) != 0 ? "" : str15, (i2 & 65536) != 0 ? "" : str16);
    }
}
