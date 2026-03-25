package com.okinc.business.web3pay.lib.features.convert.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CurrencyList {
    private final List<Currency> currencyList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(CurrencyList$Currency$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.convert.model.CurrencyList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurrencyList copy$default(CurrencyList currencyList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = currencyList.currencyList;
        }
        return currencyList.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Currency> component1() {
        return this.currencyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyList copy(@NotNull List<Currency> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new CurrencyList(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CurrencyList) && Intrinsics.EZpvd(this.currencyList, ((CurrencyList) obj).currencyList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Currency> getCurrencyList() {
        return this.currencyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.currencyList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrencyList(currencyList=" + this.currencyList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.convert.model.CurrencyList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CurrencyList> serializer() {
            return CurrencyList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CurrencyList(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CurrencyList$$serializer.INSTANCE.getDescriptor());
        }
        this.currencyList = list;
    }

    @Serializable
    public static final class Currency {
        private final List<Chain> chains;
        private final String masterCurrencyId;
        private final String tokenAmount;
        private final int tokenDecimal;
        private final String tokenLogo;
        private final String tokenPrice;
        private final String tokenSymbol;
        private final boolean underMaintenance;
        private final String usdAmount;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(CurrencyList$Chain$$serializer.INSTANCE)};

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
            return this.tokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.usdAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.masterCurrencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.tokenPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component8() {
            return this.underMaintenance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Chain> component9() {
            return this.chains;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Currency copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, boolean z, @NotNull List<Chain> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Currency(str, i, str2, str3, str4, str5, str6, z, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Currency)) {
                return false;
            }
            Currency currency = (Currency) obj;
            return Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) currency.tokenSymbol) && this.tokenDecimal == currency.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) currency.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) currency.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) currency.usdAmount) && Intrinsics.EZpvd((Object) this.masterCurrencyId, (Object) currency.masterCurrencyId) && Intrinsics.EZpvd((Object) this.tokenPrice, (Object) currency.tokenPrice) && this.underMaintenance == currency.underMaintenance && Intrinsics.EZpvd(this.chains, currency.chains);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Chain> getChains() {
            return this.chains;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMasterCurrencyId() {
            return this.masterCurrencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenAmount() {
            return this.tokenAmount;
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
        public final boolean getUnderMaintenance() {
            return this.underMaintenance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUsdAmount() {
            return this.usdAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.tokenSymbol.hashCode();
            int iHashCode2 = Integer.hashCode(this.tokenDecimal);
            int iHashCode3 = this.tokenLogo.hashCode();
            int iHashCode4 = this.tokenAmount.hashCode();
            int iHashCode5 = this.usdAmount.hashCode();
            String str = this.masterCurrencyId;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.tokenPrice.hashCode()) * 31) + Boolean.hashCode(this.underMaintenance)) * 31) + this.chains.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Currency(tokenSymbol=" + this.tokenSymbol + ", tokenDecimal=" + this.tokenDecimal + ", tokenLogo=" + this.tokenLogo + ", tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", masterCurrencyId=" + this.masterCurrencyId + ", tokenPrice=" + this.tokenPrice + ", underMaintenance=" + this.underMaintenance + ", chains=" + this.chains + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.convert.model.CurrencyList.Currency.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Currency> serializer() {
                return CurrencyList$Currency$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Currency(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if (479 != (i & 479)) {
                PluginExceptionsKt.throwMissingFieldException(i, 479, CurrencyList$Currency$$serializer.INSTANCE.getDescriptor());
            }
            this.tokenSymbol = str;
            this.tokenDecimal = i2;
            this.tokenLogo = str2;
            this.tokenAmount = str3;
            this.usdAmount = str4;
            if ((i & 32) == 0) {
                this.masterCurrencyId = null;
            } else {
                this.masterCurrencyId = str5;
            }
            this.tokenPrice = str6;
            this.underMaintenance = z;
            this.chains = list;
        }

        public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(Currency currency, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 0, currency.tokenSymbol);
            compositeEncoder.encodeIntElement(serialDescriptor, 1, currency.tokenDecimal);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, currency.tokenLogo);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, currency.tokenAmount);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, currency.usdAmount);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || currency.masterCurrencyId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, currency.masterCurrencyId);
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 6, currency.tokenPrice);
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, currency.underMaintenance);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], currency.chains);
        }

        public Currency(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, boolean z, @NotNull List<Chain> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.tokenSymbol = str;
            this.tokenDecimal = i;
            this.tokenLogo = str2;
            this.tokenAmount = str3;
            this.usdAmount = str4;
            this.masterCurrencyId = str5;
            this.tokenPrice = str6;
            this.underMaintenance = z;
            this.chains = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 int)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (r18v0 java.lang.String)
  (r19v0 boolean)
  (r20v0 java.util.List)
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.business.web3pay.lib.features.convert.model.CurrencyList$Chain>):void (m)] (LINE:11) call: com.okinc.business.web3pay.lib.features.convert.model.CurrencyList.Currency.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List):void type: THIS */
        public /* synthetic */ Currency(String str, int i, String str2, String str3, String str4, String str5, String str6, boolean z, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, str3, str4, (i2 & 32) != 0 ? null : str5, str6, z, list);
        }
    }

    public CurrencyList(@NotNull List<Currency> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.currencyList = list;
    }

    @Serializable
    public static final class Chain {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String chainIndex;
        private final String chainLogo;
        private final String chainName;
        private final boolean pay;
        private final String tokenAddress;
        private final String tokenAmount;
        private final String tokenCoinTypeNo;
        private final int tokenDecimal;
        private final String tokenSymbol;
        private final boolean underMaintenance;
        private final String usdAmount;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component1() {
            return this.underMaintenance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.usdAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.tokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.chainLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.chainName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.tokenCoinTypeNo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component7() {
            return this.pay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component8() {
            return this.tokenDecimal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.tokenAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Chain copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z2, int i, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            return new Chain(z, str, str2, str3, str4, str5, z2, i, str6, str7, str8);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Chain)) {
                return false;
            }
            Chain chain = (Chain) obj;
            return this.underMaintenance == chain.underMaintenance && Intrinsics.EZpvd((Object) this.chainLogo, (Object) chain.chainLogo) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) chain.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) chain.chainName) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) chain.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) chain.tokenAddress) && this.pay == chain.pay && this.tokenDecimal == chain.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) chain.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) chain.usdAmount) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) chain.tokenSymbol);
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
        public final boolean getPay() {
            return this.pay;
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
        public final String getTokenSymbol() {
            return this.tokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getUnderMaintenance() {
            return this.underMaintenance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUsdAmount() {
            return this.usdAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((Boolean.hashCode(this.underMaintenance) * 31) + this.chainLogo.hashCode()) * 31) + this.chainIndex.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.tokenCoinTypeNo.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + Boolean.hashCode(this.pay)) * 31) + Integer.hashCode(this.tokenDecimal)) * 31) + this.tokenAmount.hashCode()) * 31) + this.usdAmount.hashCode()) * 31) + this.tokenSymbol.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Chain(underMaintenance=" + this.underMaintenance + ", chainLogo=" + this.chainLogo + ", chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", tokenAddress=" + this.tokenAddress + ", pay=" + this.pay + ", tokenDecimal=" + this.tokenDecimal + ", tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", tokenSymbol=" + this.tokenSymbol + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.convert.model.CurrencyList.Chain.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Chain> serializer() {
                return CurrencyList$Chain$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Chain(int i, boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, int i2, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
            if (2047 != (i & 2047)) {
                PluginExceptionsKt.throwMissingFieldException(i, 2047, CurrencyList$Chain$$serializer.INSTANCE.getDescriptor());
            }
            this.underMaintenance = z;
            this.chainLogo = str;
            this.chainIndex = str2;
            this.chainName = str3;
            this.tokenCoinTypeNo = str4;
            this.tokenAddress = str5;
            this.pay = z2;
            this.tokenDecimal = i2;
            this.tokenAmount = str6;
            this.usdAmount = str7;
            this.tokenSymbol = str8;
        }

        public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(Chain chain, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, chain.underMaintenance);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, chain.chainLogo);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, chain.chainIndex);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, chain.chainName);
            compositeEncoder.encodeStringElement(serialDescriptor, 4, chain.tokenCoinTypeNo);
            compositeEncoder.encodeStringElement(serialDescriptor, 5, chain.tokenAddress);
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, chain.pay);
            compositeEncoder.encodeIntElement(serialDescriptor, 7, chain.tokenDecimal);
            compositeEncoder.encodeStringElement(serialDescriptor, 8, chain.tokenAmount);
            compositeEncoder.encodeStringElement(serialDescriptor, 9, chain.usdAmount);
            compositeEncoder.encodeStringElement(serialDescriptor, 10, chain.tokenSymbol);
        }

        public Chain(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z2, int i, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            this.underMaintenance = z;
            this.chainLogo = str;
            this.chainIndex = str2;
            this.chainName = str3;
            this.tokenCoinTypeNo = str4;
            this.tokenAddress = str5;
            this.pay = z2;
            this.tokenDecimal = i;
            this.tokenAmount = str6;
            this.usdAmount = str7;
            this.tokenSymbol = str8;
        }
    }
}
