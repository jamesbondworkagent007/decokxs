package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CeDefiGasResp {
    public static final int GAS_PAY_TYPE_FREE = 1;
    private final String feeTokenAddress;
    private String feeTokenBalance;
    private final String feeTokenCoinTypeNo;
    private final int feeTokenDecimal;
    private final int feeTokenDecimalNum;
    private final int feeTokenDisplayPrecision;
    private final String feeTokenImageUrl;
    private final String feeTokenPrice;
    private final boolean feeTokenStableCoin;
    private final String feeTokenSymbol;
    private final CeDefiSolGas gasFeeInfo;
    private final CeDefiEvmGasLimit gasLimit;
    private final int gasPayType;
    private final CeDefiEvmGasPrice gasPrice;
    private final String minTransferAmount;
    private final String nativeTokenCoinTypeNo;
    private final int nativeTokenDecimal;
    private final String nativeTokenPrice;
    private final int paymasterName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.gasPayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.nativeTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.nativeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.paymasterName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.feeTokenBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.feeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.nativeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiEvmGasLimit component16() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiEvmGasPrice component17() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiSolGas component18() {
        return this.gasFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.minTransferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feeTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.feeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.feeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.feeTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.feeTokenImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.feeTokenDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.feeTokenDisplayPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.feeTokenStableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiGasResp copy(int i, @NotNull String str, @NotNull String str2, int i2, @NotNull String str3, @NotNull String str4, int i3, int i4, boolean z, @NotNull String str5, int i5, int i6, @NotNull String str6, @NotNull String str7, @NotNull String str8, CeDefiEvmGasLimit ceDefiEvmGasLimit, CeDefiEvmGasPrice ceDefiEvmGasPrice, CeDefiSolGas ceDefiSolGas, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new CeDefiGasResp(i, str, str2, i2, str3, str4, i3, i4, z, str5, i5, i6, str6, str7, str8, ceDefiEvmGasLimit, ceDefiEvmGasPrice, ceDefiSolGas, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CeDefiGasResp)) {
            return false;
        }
        CeDefiGasResp ceDefiGasResp = (CeDefiGasResp) obj;
        return this.gasPayType == ceDefiGasResp.gasPayType && Intrinsics.EZpvd((Object) this.feeTokenAddress, (Object) ceDefiGasResp.feeTokenAddress) && Intrinsics.EZpvd((Object) this.feeTokenSymbol, (Object) ceDefiGasResp.feeTokenSymbol) && this.feeTokenDecimal == ceDefiGasResp.feeTokenDecimal && Intrinsics.EZpvd((Object) this.feeTokenCoinTypeNo, (Object) ceDefiGasResp.feeTokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.feeTokenImageUrl, (Object) ceDefiGasResp.feeTokenImageUrl) && this.feeTokenDecimalNum == ceDefiGasResp.feeTokenDecimalNum && this.feeTokenDisplayPrecision == ceDefiGasResp.feeTokenDisplayPrecision && this.feeTokenStableCoin == ceDefiGasResp.feeTokenStableCoin && Intrinsics.EZpvd((Object) this.nativeTokenCoinTypeNo, (Object) ceDefiGasResp.nativeTokenCoinTypeNo) && this.nativeTokenDecimal == ceDefiGasResp.nativeTokenDecimal && this.paymasterName == ceDefiGasResp.paymasterName && Intrinsics.EZpvd((Object) this.feeTokenBalance, (Object) ceDefiGasResp.feeTokenBalance) && Intrinsics.EZpvd((Object) this.feeTokenPrice, (Object) ceDefiGasResp.feeTokenPrice) && Intrinsics.EZpvd((Object) this.nativeTokenPrice, (Object) ceDefiGasResp.nativeTokenPrice) && Intrinsics.EZpvd(this.gasLimit, ceDefiGasResp.gasLimit) && Intrinsics.EZpvd(this.gasPrice, ceDefiGasResp.gasPrice) && Intrinsics.EZpvd(this.gasFeeInfo, ceDefiGasResp.gasFeeInfo) && Intrinsics.EZpvd((Object) this.minTransferAmount, (Object) ceDefiGasResp.minTransferAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenAddress() {
        return this.feeTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenBalance() {
        return this.feeTokenBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenCoinTypeNo() {
        return this.feeTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFeeTokenDecimal() {
        return this.feeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFeeTokenDecimalNum() {
        return this.feeTokenDecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFeeTokenDisplayPrecision() {
        return this.feeTokenDisplayPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenImageUrl() {
        return this.feeTokenImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenPrice() {
        return this.feeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFeeTokenStableCoin() {
        return this.feeTokenStableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenSymbol() {
        return this.feeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiSolGas getGasFeeInfo() {
        return this.gasFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiEvmGasLimit getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGasPayType() {
        return this.gasPayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiEvmGasPrice getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinTransferAmount() {
        return this.minTransferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenCoinTypeNo() {
        return this.nativeTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNativeTokenDecimal() {
        return this.nativeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenPrice() {
        return this.nativeTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPaymasterName() {
        return this.paymasterName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.gasPayType);
        int iHashCode2 = this.feeTokenAddress.hashCode();
        int iHashCode3 = this.feeTokenSymbol.hashCode();
        int iHashCode4 = Integer.hashCode(this.feeTokenDecimal);
        int iHashCode5 = this.feeTokenCoinTypeNo.hashCode();
        int iHashCode6 = this.feeTokenImageUrl.hashCode();
        int iHashCode7 = Integer.hashCode(this.feeTokenDecimalNum);
        int iHashCode8 = Integer.hashCode(this.feeTokenDisplayPrecision);
        int iHashCode9 = Boolean.hashCode(this.feeTokenStableCoin);
        int iHashCode10 = this.nativeTokenCoinTypeNo.hashCode();
        int iHashCode11 = Integer.hashCode(this.nativeTokenDecimal);
        int iHashCode12 = Integer.hashCode(this.paymasterName);
        int iHashCode13 = this.feeTokenBalance.hashCode();
        int iHashCode14 = this.feeTokenPrice.hashCode();
        int iHashCode15 = this.nativeTokenPrice.hashCode();
        CeDefiEvmGasLimit ceDefiEvmGasLimit = this.gasLimit;
        int iHashCode16 = ceDefiEvmGasLimit == null ? 0 : ceDefiEvmGasLimit.hashCode();
        CeDefiEvmGasPrice ceDefiEvmGasPrice = this.gasPrice;
        int iHashCode17 = ceDefiEvmGasPrice == null ? 0 : ceDefiEvmGasPrice.hashCode();
        CeDefiSolGas ceDefiSolGas = this.gasFeeInfo;
        int iHashCode18 = ceDefiSolGas == null ? 0 : ceDefiSolGas.hashCode();
        String str = this.minTransferAmount;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeTokenBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeTokenBalance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CeDefiGasResp(gasPayType=" + this.gasPayType + ", feeTokenAddress=" + this.feeTokenAddress + ", feeTokenSymbol=" + this.feeTokenSymbol + ", feeTokenDecimal=" + this.feeTokenDecimal + ", feeTokenCoinTypeNo=" + this.feeTokenCoinTypeNo + ", feeTokenImageUrl=" + this.feeTokenImageUrl + ", feeTokenDecimalNum=" + this.feeTokenDecimalNum + ", feeTokenDisplayPrecision=" + this.feeTokenDisplayPrecision + ", feeTokenStableCoin=" + this.feeTokenStableCoin + ", nativeTokenCoinTypeNo=" + this.nativeTokenCoinTypeNo + ", nativeTokenDecimal=" + this.nativeTokenDecimal + ", paymasterName=" + this.paymasterName + ", feeTokenBalance=" + this.feeTokenBalance + ", feeTokenPrice=" + this.feeTokenPrice + ", nativeTokenPrice=" + this.nativeTokenPrice + ", gasLimit=" + this.gasLimit + ", gasPrice=" + this.gasPrice + ", gasFeeInfo=" + this.gasFeeInfo + ", minTransferAmount=" + this.minTransferAmount + ")";
    }

    public /* synthetic */ CeDefiGasResp(int i, int i2, String str, String str2, int i3, String str3, String str4, int i4, int i5, boolean z, String str5, int i6, int i7, String str6, String str7, String str8, CeDefiEvmGasLimit ceDefiEvmGasLimit, CeDefiEvmGasPrice ceDefiEvmGasPrice, CeDefiSolGas ceDefiSolGas, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (262143 != (i & 262143)) {
            PluginExceptionsKt.throwMissingFieldException(i, 262143, CeDefiGasResp$$serializer.INSTANCE.getDescriptor());
        }
        this.gasPayType = i2;
        this.feeTokenAddress = str;
        this.feeTokenSymbol = str2;
        this.feeTokenDecimal = i3;
        this.feeTokenCoinTypeNo = str3;
        this.feeTokenImageUrl = str4;
        this.feeTokenDecimalNum = i4;
        this.feeTokenDisplayPrecision = i5;
        this.feeTokenStableCoin = z;
        this.nativeTokenCoinTypeNo = str5;
        this.nativeTokenDecimal = i6;
        this.paymasterName = i7;
        this.feeTokenBalance = str6;
        this.feeTokenPrice = str7;
        this.nativeTokenPrice = str8;
        this.gasLimit = ceDefiEvmGasLimit;
        this.gasPrice = ceDefiEvmGasPrice;
        this.gasFeeInfo = ceDefiSolGas;
        this.minTransferAmount = (i & 262144) == 0 ? null : str9;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CeDefiGasResp ceDefiGasResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, ceDefiGasResp.gasPayType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, ceDefiGasResp.feeTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, ceDefiGasResp.feeTokenSymbol);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, ceDefiGasResp.feeTokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, ceDefiGasResp.feeTokenCoinTypeNo);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, ceDefiGasResp.feeTokenImageUrl);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, ceDefiGasResp.feeTokenDecimalNum);
        compositeEncoder.encodeIntElement(serialDescriptor, 7, ceDefiGasResp.feeTokenDisplayPrecision);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 8, ceDefiGasResp.feeTokenStableCoin);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, ceDefiGasResp.nativeTokenCoinTypeNo);
        compositeEncoder.encodeIntElement(serialDescriptor, 10, ceDefiGasResp.nativeTokenDecimal);
        compositeEncoder.encodeIntElement(serialDescriptor, 11, ceDefiGasResp.paymasterName);
        compositeEncoder.encodeStringElement(serialDescriptor, 12, ceDefiGasResp.feeTokenBalance);
        compositeEncoder.encodeStringElement(serialDescriptor, 13, ceDefiGasResp.feeTokenPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 14, ceDefiGasResp.nativeTokenPrice);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, CeDefiEvmGasLimit$$serializer.INSTANCE, ceDefiGasResp.gasLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, CeDefiEvmGasPrice$$serializer.INSTANCE, ceDefiGasResp.gasPrice);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, CeDefiSolGas$$serializer.INSTANCE, ceDefiGasResp.gasFeeInfo);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && ceDefiGasResp.minTransferAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, ceDefiGasResp.minTransferAmount);
    }

    public CeDefiGasResp(int i, @NotNull String str, @NotNull String str2, int i2, @NotNull String str3, @NotNull String str4, int i3, int i4, boolean z, @NotNull String str5, int i5, int i6, @NotNull String str6, @NotNull String str7, @NotNull String str8, CeDefiEvmGasLimit ceDefiEvmGasLimit, CeDefiEvmGasPrice ceDefiEvmGasPrice, CeDefiSolGas ceDefiSolGas, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.gasPayType = i;
        this.feeTokenAddress = str;
        this.feeTokenSymbol = str2;
        this.feeTokenDecimal = i2;
        this.feeTokenCoinTypeNo = str3;
        this.feeTokenImageUrl = str4;
        this.feeTokenDecimalNum = i3;
        this.feeTokenDisplayPrecision = i4;
        this.feeTokenStableCoin = z;
        this.nativeTokenCoinTypeNo = str5;
        this.nativeTokenDecimal = i5;
        this.paymasterName = i6;
        this.feeTokenBalance = str6;
        this.feeTokenPrice = str7;
        this.nativeTokenPrice = str8;
        this.gasLimit = ceDefiEvmGasLimit;
        this.gasPrice = ceDefiEvmGasPrice;
        this.gasFeeInfo = ceDefiSolGas;
        this.minTransferAmount = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (r22v0 int)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 int)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 int)
  (r29v0 int)
  (r30v0 boolean)
  (r31v0 java.lang.String)
  (r32v0 int)
  (r33v0 int)
  (r34v0 java.lang.String)
  (r35v0 java.lang.String)
  (r36v0 java.lang.String)
  (r37v0 com.okinc.business.defi.biz.net.bean.CeDefiEvmGasLimit)
  (r38v0 com.okinc.business.defi.biz.net.bean.CeDefiEvmGasPrice)
  (r39v0 com.okinc.business.defi.biz.net.bean.CeDefiSolGas)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r41v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, int, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.CeDefiEvmGasLimit, com.okinc.business.defi.biz.net.bean.CeDefiEvmGasPrice, com.okinc.business.defi.biz.net.bean.CeDefiSolGas, java.lang.String):void (m)] (LINE:2162) call: com.okinc.business.defi.biz.net.bean.CeDefiGasResp.<init>(int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, int, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.CeDefiEvmGasLimit, com.okinc.business.defi.biz.net.bean.CeDefiEvmGasPrice, com.okinc.business.defi.biz.net.bean.CeDefiSolGas, java.lang.String):void type: THIS */
    public /* synthetic */ CeDefiGasResp(int i, String str, String str2, int i2, String str3, String str4, int i3, int i4, boolean z, String str5, int i5, int i6, String str6, String str7, String str8, CeDefiEvmGasLimit ceDefiEvmGasLimit, CeDefiEvmGasPrice ceDefiEvmGasPrice, CeDefiSolGas ceDefiSolGas, String str9, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, i2, str3, str4, i3, i4, z, str5, i5, i6, str6, str7, str8, ceDefiEvmGasLimit, ceDefiEvmGasPrice, ceDefiSolGas, (i7 & 262144) != 0 ? null : str9);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CeDefiGasResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CeDefiGasResp> serializer() {
            return CeDefiGasResp$$serializer.INSTANCE;
        }
    }
}
