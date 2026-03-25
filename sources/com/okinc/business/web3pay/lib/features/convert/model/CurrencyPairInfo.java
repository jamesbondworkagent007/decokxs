package com.okinc.business.web3pay.lib.features.convert.model;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CurrencyPairInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final ConvertConstraints convertConstraints;
    private final String estimatedSlippage;
    private final From from;
    private final boolean isSameCoin;
    private final boolean otcMaintaining;
    private final To to;
    private final String toAmountWarningRatio;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CurrencyPairInfo copy$default(CurrencyPairInfo currencyPairInfo, From from, To to, ConvertConstraints convertConstraints, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            from = currencyPairInfo.from;
        }
        if ((i & 2) != 0) {
            to = currencyPairInfo.to;
        }
        To to2 = to;
        if ((i & 4) != 0) {
            convertConstraints = currencyPairInfo.convertConstraints;
        }
        ConvertConstraints convertConstraints2 = convertConstraints;
        if ((i & 8) != 0) {
            z = currencyPairInfo.isSameCoin;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = currencyPairInfo.otcMaintaining;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            str = currencyPairInfo.toAmountWarningRatio;
        }
        String str3 = str;
        if ((i & 64) != 0) {
            str2 = currencyPairInfo.estimatedSlippage;
        }
        return currencyPairInfo.copy(from, to2, convertConstraints2, z3, z4, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final From component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final To component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertConstraints component3() {
        return this.convertConstraints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isSameCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.otcMaintaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.toAmountWarningRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.estimatedSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyPairInfo copy(@NotNull From from, @NotNull To to, @NotNull ConvertConstraints convertConstraints, boolean z, boolean z2, String str, String str2) {
        Intrinsics.checkNotNullParameter(from, "");
        Intrinsics.checkNotNullParameter(to, "");
        Intrinsics.checkNotNullParameter(convertConstraints, "");
        return new CurrencyPairInfo(from, to, convertConstraints, z, z2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyPairInfo)) {
            return false;
        }
        CurrencyPairInfo currencyPairInfo = (CurrencyPairInfo) obj;
        return Intrinsics.EZpvd(this.from, currencyPairInfo.from) && Intrinsics.EZpvd(this.to, currencyPairInfo.to) && Intrinsics.EZpvd(this.convertConstraints, currencyPairInfo.convertConstraints) && this.isSameCoin == currencyPairInfo.isSameCoin && this.otcMaintaining == currencyPairInfo.otcMaintaining && Intrinsics.EZpvd((Object) this.toAmountWarningRatio, (Object) currencyPairInfo.toAmountWarningRatio) && Intrinsics.EZpvd((Object) this.estimatedSlippage, (Object) currencyPairInfo.estimatedSlippage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertConstraints getConvertConstraints() {
        return this.convertConstraints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedSlippage() {
        return this.estimatedSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final From getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOtcMaintaining() {
        return this.otcMaintaining;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final To getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmountWarningRatio() {
        return this.toAmountWarningRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.from.hashCode();
        int iHashCode2 = this.to.hashCode();
        int iHashCode3 = this.convertConstraints.hashCode();
        int iHashCode4 = Boolean.hashCode(this.isSameCoin);
        int iHashCode5 = Boolean.hashCode(this.otcMaintaining);
        String str = this.toAmountWarningRatio;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.estimatedSlippage;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSameCoin() {
        return this.isSameCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrencyPairInfo(from=" + this.from + ", to=" + this.to + ", convertConstraints=" + this.convertConstraints + ", isSameCoin=" + this.isSameCoin + ", otcMaintaining=" + this.otcMaintaining + ", toAmountWarningRatio=" + this.toAmountWarningRatio + ", estimatedSlippage=" + this.estimatedSlippage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CurrencyPairInfo> serializer() {
            return CurrencyPairInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CurrencyPairInfo(int i, From from, To to, ConvertConstraints convertConstraints, boolean z, boolean z2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, CurrencyPairInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.from = from;
        this.to = to;
        this.convertConstraints = convertConstraints;
        this.isSameCoin = z;
        this.otcMaintaining = z2;
        if ((i & 32) == 0) {
            this.toAmountWarningRatio = "0.3";
        } else {
            this.toAmountWarningRatio = str;
        }
        if ((i & 64) == 0) {
            this.estimatedSlippage = "0.05";
        } else {
            this.estimatedSlippage = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CurrencyPairInfo currencyPairInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, CurrencyPairInfo$From$$serializer.INSTANCE, currencyPairInfo.from);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, CurrencyPairInfo$To$$serializer.INSTANCE, currencyPairInfo.to);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, CurrencyPairInfo$ConvertConstraints$$serializer.INSTANCE, currencyPairInfo.convertConstraints);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, currencyPairInfo.isSameCoin);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, currencyPairInfo.otcMaintaining);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) currencyPairInfo.toAmountWarningRatio, (Object) "0.3")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, currencyPairInfo.toAmountWarningRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) currencyPairInfo.estimatedSlippage, (Object) "0.05")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, currencyPairInfo.estimatedSlippage);
    }

    public CurrencyPairInfo(@NotNull From from, @NotNull To to, @NotNull ConvertConstraints convertConstraints, boolean z, boolean z2, String str, String str2) {
        Intrinsics.checkNotNullParameter(from, "");
        Intrinsics.checkNotNullParameter(to, "");
        Intrinsics.checkNotNullParameter(convertConstraints, "");
        this.from = from;
        this.to = to;
        this.convertConstraints = convertConstraints;
        this.isSameCoin = z;
        this.otcMaintaining = z2;
        this.toAmountWarningRatio = str;
        this.estimatedSlippage = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r10v0 com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo$From)
  (r11v0 com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo$To)
  (r12v0 com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo$ConvertConstraints)
  (r13v0 boolean)
  (r14v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("0.3") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("0.05") : (r16v0 java.lang.String))
 A[MD:(com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo$From, com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo$To, com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo$ConvertConstraints, boolean, boolean, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo.<init>(com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo$From, com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo$To, com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo$ConvertConstraints, boolean, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CurrencyPairInfo(From from, To to, ConvertConstraints convertConstraints, boolean z, boolean z2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(from, to, convertConstraints, z, z2, (i & 32) != 0 ? "0.3" : str, (i & 64) != 0 ? "0.05" : str2);
    }

    @Serializable
    public static final class From {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String chainIndex;
        private final String chainLogo;
        private final String chainName;
        private final String tokenAddress;
        private final String tokenAmount;
        private final String tokenCoinTypeNo;
        private final int tokenDecimal;
        private final String tokenLogo;
        private final String tokenPrice;
        private final String tokenSymbol;
        private final String usdAmount;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.tokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.tokenCoinTypeNo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.tokenDecimal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.tokenLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.tokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.usdAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.tokenPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.chainLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.chainName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final From copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
            return new From(str, i, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof From)) {
                return false;
            }
            From from = (From) obj;
            return Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) from.tokenSymbol) && this.tokenDecimal == from.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) from.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) from.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) from.usdAmount) && Intrinsics.EZpvd((Object) this.tokenPrice, (Object) from.tokenPrice) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) from.chainLogo) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) from.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) from.chainName) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) from.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) from.tokenAddress);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainIndex() {
            return this.chainIndex;
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
        public final String getTokenAddress() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenAmount() {
            return this.tokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenCoinTypeNo() {
            return this.tokenCoinTypeNo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTokenDecimal() {
            return this.tokenDecimal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenLogo() {
            return this.tokenLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenPrice() {
            return this.tokenPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenSymbol() {
            return this.tokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUsdAmount() {
            return this.usdAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((this.tokenSymbol.hashCode() * 31) + Integer.hashCode(this.tokenDecimal)) * 31) + this.tokenLogo.hashCode()) * 31) + this.tokenAmount.hashCode()) * 31) + this.usdAmount.hashCode()) * 31) + this.tokenPrice.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.chainIndex.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.tokenCoinTypeNo.hashCode()) * 31) + this.tokenAddress.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "From(tokenSymbol=" + this.tokenSymbol + ", tokenDecimal=" + this.tokenDecimal + ", tokenLogo=" + this.tokenLogo + ", tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", tokenPrice=" + this.tokenPrice + ", chainLogo=" + this.chainLogo + ", chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", tokenAddress=" + this.tokenAddress + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo.From.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<From> serializer() {
                return CurrencyPairInfo$From$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ From(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
            if (2047 != (i & 2047)) {
                PluginExceptionsKt.throwMissingFieldException(i, 2047, CurrencyPairInfo$From$$serializer.INSTANCE.getDescriptor());
            }
            this.tokenSymbol = str;
            this.tokenDecimal = i2;
            this.tokenLogo = str2;
            this.tokenAmount = str3;
            this.usdAmount = str4;
            this.tokenPrice = str5;
            this.chainLogo = str6;
            this.chainIndex = str7;
            this.chainName = str8;
            this.tokenCoinTypeNo = str9;
            this.tokenAddress = str10;
        }

        public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(From from, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, from.tokenSymbol);
            compositeEncoder.encodeIntElement(serialDescriptor, 1, from.tokenDecimal);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, from.tokenLogo);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, from.tokenAmount);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, from.usdAmount);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, from.tokenPrice);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, from.chainLogo);
            compositeEncoder.encodeStringElement(serialDescriptor, 7, from.chainIndex);
            compositeEncoder.encodeStringElement(serialDescriptor, 8, from.chainName);
            compositeEncoder.encodeStringElement(serialDescriptor, 9, from.tokenCoinTypeNo);
            compositeEncoder.encodeStringElement(serialDescriptor, 10, from.tokenAddress);
        }

        public From(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
            this.tokenSymbol = str;
            this.tokenDecimal = i;
            this.tokenLogo = str2;
            this.tokenAmount = str3;
            this.usdAmount = str4;
            this.tokenPrice = str5;
            this.chainLogo = str6;
            this.chainIndex = str7;
            this.chainName = str8;
            this.tokenCoinTypeNo = str9;
            this.tokenAddress = str10;
        }
    }

    @Serializable
    public static final class To {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String chainIndex;
        private final String chainLogo;
        private final String chainName;
        private final String tokenAddress;
        private final String tokenCoinTypeNo;
        private final int tokenDecimal;
        private final String tokenLogo;
        private final String tokenSymbol;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.tokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.tokenDecimal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.tokenLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.chainLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.chainName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.tokenCoinTypeNo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final To copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return new To(str, i, str2, str3, str4, str5, str6, str7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof To)) {
                return false;
            }
            To to = (To) obj;
            return Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) to.tokenSymbol) && this.tokenDecimal == to.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) to.tokenLogo) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) to.chainLogo) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) to.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) to.chainName) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) to.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) to.tokenAddress);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainIndex() {
            return this.chainIndex;
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
        public final String getTokenAddress() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenCoinTypeNo() {
            return this.tokenCoinTypeNo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTokenDecimal() {
            return this.tokenDecimal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenLogo() {
            return this.tokenLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenSymbol() {
            return this.tokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((this.tokenSymbol.hashCode() * 31) + Integer.hashCode(this.tokenDecimal)) * 31) + this.tokenLogo.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.chainIndex.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.tokenCoinTypeNo.hashCode()) * 31) + this.tokenAddress.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "To(tokenSymbol=" + this.tokenSymbol + ", tokenDecimal=" + this.tokenDecimal + ", tokenLogo=" + this.tokenLogo + ", chainLogo=" + this.chainLogo + ", chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", tokenAddress=" + this.tokenAddress + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo.To.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<To> serializer() {
                return CurrencyPairInfo$To$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ To(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
            if (255 != (i & 255)) {
                PluginExceptionsKt.throwMissingFieldException(i, 255, CurrencyPairInfo$To$$serializer.INSTANCE.getDescriptor());
            }
            this.tokenSymbol = str;
            this.tokenDecimal = i2;
            this.tokenLogo = str2;
            this.chainLogo = str3;
            this.chainIndex = str4;
            this.chainName = str5;
            this.tokenCoinTypeNo = str6;
            this.tokenAddress = str7;
        }

        public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(To to, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, to.tokenSymbol);
            compositeEncoder.encodeIntElement(serialDescriptor, 1, to.tokenDecimal);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, to.tokenLogo);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, to.chainLogo);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, to.chainIndex);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, to.chainName);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, to.tokenCoinTypeNo);
            compositeEncoder.encodeStringElement(serialDescriptor, 7, to.tokenAddress);
        }

        public To(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.tokenSymbol = str;
            this.tokenDecimal = i;
            this.tokenLogo = str2;
            this.chainLogo = str3;
            this.chainIndex = str4;
            this.chainName = str5;
            this.tokenCoinTypeNo = str6;
            this.tokenAddress = str7;
        }
    }

    @Serializable
    public static final class ConvertConstraints {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String l2MaxTokenAmount;
        private final String l2UsedTokenAmount;
        private final String maxFromTokenAmount;
        private final String maxToTokenAmount;
        private final String minFromTokenAmount;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ConvertConstraints copy$default(ConvertConstraints convertConstraints, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = convertConstraints.minFromTokenAmount;
            }
            if ((i & 2) != 0) {
                str2 = convertConstraints.maxFromTokenAmount;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = convertConstraints.maxToTokenAmount;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = convertConstraints.l2MaxTokenAmount;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = convertConstraints.l2UsedTokenAmount;
            }
            return convertConstraints.copy(str, str6, str7, str8, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.minFromTokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.maxFromTokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.maxToTokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.l2MaxTokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.l2UsedTokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConvertConstraints copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new ConvertConstraints(str, str2, str3, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConvertConstraints)) {
                return false;
            }
            ConvertConstraints convertConstraints = (ConvertConstraints) obj;
            return Intrinsics.EZpvd((Object) this.minFromTokenAmount, (Object) convertConstraints.minFromTokenAmount) && Intrinsics.EZpvd((Object) this.maxFromTokenAmount, (Object) convertConstraints.maxFromTokenAmount) && Intrinsics.EZpvd((Object) this.maxToTokenAmount, (Object) convertConstraints.maxToTokenAmount) && Intrinsics.EZpvd((Object) this.l2MaxTokenAmount, (Object) convertConstraints.l2MaxTokenAmount) && Intrinsics.EZpvd((Object) this.l2UsedTokenAmount, (Object) convertConstraints.l2UsedTokenAmount);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getL2MaxTokenAmount() {
            return this.l2MaxTokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getL2UsedTokenAmount() {
            return this.l2UsedTokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaxFromTokenAmount() {
            return this.maxFromTokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaxToTokenAmount() {
            return this.maxToTokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMinFromTokenAmount() {
            return this.minFromTokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.minFromTokenAmount.hashCode();
            int iHashCode2 = this.maxFromTokenAmount.hashCode();
            int iHashCode3 = this.maxToTokenAmount.hashCode();
            String str = this.l2MaxTokenAmount;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            String str2 = this.l2UsedTokenAmount;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ConvertConstraints(minFromTokenAmount=" + this.minFromTokenAmount + ", maxFromTokenAmount=" + this.maxFromTokenAmount + ", maxToTokenAmount=" + this.maxToTokenAmount + ", l2MaxTokenAmount=" + this.l2MaxTokenAmount + ", l2UsedTokenAmount=" + this.l2UsedTokenAmount + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo.ConvertConstraints.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ConvertConstraints> serializer() {
                return CurrencyPairInfo$ConvertConstraints$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ConvertConstraints(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, CurrencyPairInfo$ConvertConstraints$$serializer.INSTANCE.getDescriptor());
            }
            this.minFromTokenAmount = str;
            this.maxFromTokenAmount = str2;
            this.maxToTokenAmount = str3;
            if ((i & 8) == 0) {
                this.l2MaxTokenAmount = null;
            } else {
                this.l2MaxTokenAmount = str4;
            }
            if ((i & 16) == 0) {
                this.l2UsedTokenAmount = null;
            } else {
                this.l2UsedTokenAmount = str5;
            }
        }

        public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(ConvertConstraints convertConstraints, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, convertConstraints.minFromTokenAmount);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, convertConstraints.maxFromTokenAmount);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, convertConstraints.maxToTokenAmount);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || convertConstraints.l2MaxTokenAmount != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, convertConstraints.l2MaxTokenAmount);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && convertConstraints.l2UsedTokenAmount == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, convertConstraints.l2UsedTokenAmount);
        }

        public ConvertConstraints(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.minFromTokenAmount = str;
            this.maxFromTokenAmount = str2;
            this.maxToTokenAmount = str3;
            this.l2MaxTokenAmount = str4;
            this.l2UsedTokenAmount = str5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:48) call: com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo.ConvertConstraints.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ ConvertConstraints(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }
    }
}
