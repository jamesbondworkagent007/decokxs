package com.okinc.business.market.data.model.position_pnl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class HoldingTransactionData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String blockBalance;
    private final String boughtAmount;
    private final String boughtAvgPrice;
    private final String boughtTxs;
    private final String boughtVolume;
    private final String chainId;
    private final String holdAvgPrice;
    private final String realizedCost;
    private final String realizedProfit;
    private final String soldAmount;
    private final String soldAvgPrice;
    private final String soldTxs;
    private final String soldVolume;
    private final String spotBalance;
    private final String tokenContractAddress;
    private final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HoldingTransactionData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 65535, (DefaultConstructorMarker) null);
    }

    @SerialName("blockBalance")
    public static /* synthetic */ void getBlockBalance$annotations() {
    }

    @SerialName("boughtAmount")
    public static /* synthetic */ void getBoughtAmount$annotations() {
    }

    @SerialName("boughtAvgPrice")
    public static /* synthetic */ void getBoughtAvgPrice$annotations() {
    }

    @SerialName("boughtTxs")
    public static /* synthetic */ void getBoughtTxs$annotations() {
    }

    @SerialName("boughtVolume")
    public static /* synthetic */ void getBoughtVolume$annotations() {
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("holdAvgPrice")
    public static /* synthetic */ void getHoldAvgPrice$annotations() {
    }

    @SerialName("realizedCost")
    public static /* synthetic */ void getRealizedCost$annotations() {
    }

    @SerialName("realizedProfit")
    public static /* synthetic */ void getRealizedProfit$annotations() {
    }

    @SerialName("soldAmount")
    public static /* synthetic */ void getSoldAmount$annotations() {
    }

    @SerialName("soldAvgPrice")
    public static /* synthetic */ void getSoldAvgPrice$annotations() {
    }

    @SerialName("soldTxs")
    public static /* synthetic */ void getSoldTxs$annotations() {
    }

    @SerialName("soldVolume")
    public static /* synthetic */ void getSoldVolume$annotations() {
    }

    @SerialName("spotBalance")
    public static /* synthetic */ void getSpotBalance$annotations() {
    }

    @SerialName("tokenContractAddress")
    public static /* synthetic */ void getTokenContractAddress$annotations() {
    }

    @SerialName("walletAddress")
    public static /* synthetic */ void getWalletAddress$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.blockBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.soldAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.boughtAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.soldTxs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.soldVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.spotBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.boughtAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.boughtTxs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.boughtVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.holdAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.realizedCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.realizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.soldAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HoldingTransactionData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        return new HoldingTransactionData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HoldingTransactionData)) {
            return false;
        }
        HoldingTransactionData holdingTransactionData = (HoldingTransactionData) obj;
        return Intrinsics.EZpvd((Object) this.blockBalance, (Object) holdingTransactionData.blockBalance) && Intrinsics.EZpvd((Object) this.boughtAmount, (Object) holdingTransactionData.boughtAmount) && Intrinsics.EZpvd((Object) this.boughtTxs, (Object) holdingTransactionData.boughtTxs) && Intrinsics.EZpvd((Object) this.boughtVolume, (Object) holdingTransactionData.boughtVolume) && Intrinsics.EZpvd((Object) this.chainId, (Object) holdingTransactionData.chainId) && Intrinsics.EZpvd((Object) this.holdAvgPrice, (Object) holdingTransactionData.holdAvgPrice) && Intrinsics.EZpvd((Object) this.realizedCost, (Object) holdingTransactionData.realizedCost) && Intrinsics.EZpvd((Object) this.realizedProfit, (Object) holdingTransactionData.realizedProfit) && Intrinsics.EZpvd((Object) this.soldAmount, (Object) holdingTransactionData.soldAmount) && Intrinsics.EZpvd((Object) this.soldAvgPrice, (Object) holdingTransactionData.soldAvgPrice) && Intrinsics.EZpvd((Object) this.boughtAvgPrice, (Object) holdingTransactionData.boughtAvgPrice) && Intrinsics.EZpvd((Object) this.soldTxs, (Object) holdingTransactionData.soldTxs) && Intrinsics.EZpvd((Object) this.soldVolume, (Object) holdingTransactionData.soldVolume) && Intrinsics.EZpvd((Object) this.spotBalance, (Object) holdingTransactionData.spotBalance) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) holdingTransactionData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) holdingTransactionData.walletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBlockBalance() {
        return this.blockBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoughtAmount() {
        return this.boughtAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoughtAvgPrice() {
        return this.boughtAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoughtTxs() {
        return this.boughtTxs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoughtVolume() {
        return this.boughtVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldAvgPrice() {
        return this.holdAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedCost() {
        return this.realizedCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedProfit() {
        return this.realizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSoldAmount() {
        return this.soldAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSoldAvgPrice() {
        return this.soldAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSoldTxs() {
        return this.soldTxs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSoldVolume() {
        return this.soldVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotBalance() {
        return this.spotBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((this.blockBalance.hashCode() * 31) + this.boughtAmount.hashCode()) * 31) + this.boughtTxs.hashCode()) * 31) + this.boughtVolume.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.holdAvgPrice.hashCode()) * 31) + this.realizedCost.hashCode()) * 31) + this.realizedProfit.hashCode()) * 31) + this.soldAmount.hashCode()) * 31) + this.soldAvgPrice.hashCode()) * 31) + this.boughtAvgPrice.hashCode()) * 31) + this.soldTxs.hashCode()) * 31) + this.soldVolume.hashCode()) * 31) + this.spotBalance.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.walletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HoldingTransactionData(blockBalance=" + this.blockBalance + ", boughtAmount=" + this.boughtAmount + ", boughtTxs=" + this.boughtTxs + ", boughtVolume=" + this.boughtVolume + ", chainId=" + this.chainId + ", holdAvgPrice=" + this.holdAvgPrice + ", realizedCost=" + this.realizedCost + ", realizedProfit=" + this.realizedProfit + ", soldAmount=" + this.soldAmount + ", soldAvgPrice=" + this.soldAvgPrice + ", boughtAvgPrice=" + this.boughtAvgPrice + ", soldTxs=" + this.soldTxs + ", soldVolume=" + this.soldVolume + ", spotBalance=" + this.spotBalance + ", tokenContractAddress=" + this.tokenContractAddress + ", walletAddress=" + this.walletAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.position_pnl.HoldingTransactionData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HoldingTransactionData> serializer() {
            return HoldingTransactionData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HoldingTransactionData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.blockBalance = "";
        } else {
            this.blockBalance = str;
        }
        if ((i & 2) == 0) {
            this.boughtAmount = "";
        } else {
            this.boughtAmount = str2;
        }
        if ((i & 4) == 0) {
            this.boughtTxs = "";
        } else {
            this.boughtTxs = str3;
        }
        if ((i & 8) == 0) {
            this.boughtVolume = "";
        } else {
            this.boughtVolume = str4;
        }
        if ((i & 16) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str5;
        }
        if ((i & 32) == 0) {
            this.holdAvgPrice = "";
        } else {
            this.holdAvgPrice = str6;
        }
        if ((i & 64) == 0) {
            this.realizedCost = "";
        } else {
            this.realizedCost = str7;
        }
        if ((i & 128) == 0) {
            this.realizedProfit = "";
        } else {
            this.realizedProfit = str8;
        }
        if ((i & 256) == 0) {
            this.soldAmount = "";
        } else {
            this.soldAmount = str9;
        }
        if ((i & 512) == 0) {
            this.soldAvgPrice = "";
        } else {
            this.soldAvgPrice = str10;
        }
        if ((i & 1024) == 0) {
            this.boughtAvgPrice = "";
        } else {
            this.boughtAvgPrice = str11;
        }
        if ((i & 2048) == 0) {
            this.soldTxs = "";
        } else {
            this.soldTxs = str12;
        }
        if ((i & 4096) == 0) {
            this.soldVolume = "";
        } else {
            this.soldVolume = str13;
        }
        if ((i & 8192) == 0) {
            this.spotBalance = "";
        } else {
            this.spotBalance = str14;
        }
        if ((i & 16384) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str15;
        }
        if ((i & 32768) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str16;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(HoldingTransactionData holdingTransactionData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) holdingTransactionData.blockBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, holdingTransactionData.blockBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) holdingTransactionData.boughtAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, holdingTransactionData.boughtAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) holdingTransactionData.boughtTxs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, holdingTransactionData.boughtTxs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) holdingTransactionData.boughtVolume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, holdingTransactionData.boughtVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) holdingTransactionData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, holdingTransactionData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) holdingTransactionData.holdAvgPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, holdingTransactionData.holdAvgPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) holdingTransactionData.realizedCost, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, holdingTransactionData.realizedCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) holdingTransactionData.realizedProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, holdingTransactionData.realizedProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) holdingTransactionData.soldAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, holdingTransactionData.soldAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) holdingTransactionData.soldAvgPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, holdingTransactionData.soldAvgPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) holdingTransactionData.boughtAvgPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, holdingTransactionData.boughtAvgPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) holdingTransactionData.soldTxs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, holdingTransactionData.soldTxs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) holdingTransactionData.soldVolume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, holdingTransactionData.soldVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) holdingTransactionData.spotBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, holdingTransactionData.spotBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) holdingTransactionData.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, holdingTransactionData.tokenContractAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd((Object) holdingTransactionData.walletAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 15, holdingTransactionData.walletAddress);
    }

    public HoldingTransactionData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        this.blockBalance = str;
        this.boughtAmount = str2;
        this.boughtTxs = str3;
        this.boughtVolume = str4;
        this.chainId = str5;
        this.holdAvgPrice = str6;
        this.realizedCost = str7;
        this.realizedProfit = str8;
        this.soldAmount = str9;
        this.soldAvgPrice = str10;
        this.boughtAvgPrice = str11;
        this.soldTxs = str12;
        this.soldVolume = str13;
        this.spotBalance = str14;
        this.tokenContractAddress = str15;
        this.walletAddress = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ad: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.business.market.data.model.position_pnl.HoldingTransactionData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HoldingTransactionData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16);
    }
}
