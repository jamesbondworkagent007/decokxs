package com.okinc.business.web3pay.lib.features.asset.model;

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
public final class ConvertUnsupportedTokenData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean cefiSupport;
    private final String chainIndex;
    private final String chainLogo;
    private final String chainName;
    private final String deficitAmount;
    private final String masterCurrencyId;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final int tokenDecimal;
    private final String tokenLogo;
    private final String tokenName;
    private final String tokenPrice;
    private final String tokenSymbolTicker;
    private final String usdAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.deficitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.cefiSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertUnsupportedTokenData copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull String str7, boolean z, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new ConvertUnsupportedTokenData(str, i, str2, str3, str4, str5, str6, str7, z, str8, str9, str10, str11, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConvertUnsupportedTokenData)) {
            return false;
        }
        ConvertUnsupportedTokenData convertUnsupportedTokenData = (ConvertUnsupportedTokenData) obj;
        return Intrinsics.EZpvd((Object) this.tokenSymbolTicker, (Object) convertUnsupportedTokenData.tokenSymbolTicker) && this.tokenDecimal == convertUnsupportedTokenData.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenName, (Object) convertUnsupportedTokenData.tokenName) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) convertUnsupportedTokenData.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) convertUnsupportedTokenData.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) convertUnsupportedTokenData.usdAmount) && Intrinsics.EZpvd((Object) this.masterCurrencyId, (Object) convertUnsupportedTokenData.masterCurrencyId) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) convertUnsupportedTokenData.tokenCoinTypeNo) && this.cefiSupport == convertUnsupportedTokenData.cefiSupport && Intrinsics.EZpvd((Object) this.chainLogo, (Object) convertUnsupportedTokenData.chainLogo) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) convertUnsupportedTokenData.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) convertUnsupportedTokenData.chainName) && Intrinsics.EZpvd((Object) this.tokenPrice, (Object) convertUnsupportedTokenData.tokenPrice) && Intrinsics.EZpvd((Object) this.deficitAmount, (Object) convertUnsupportedTokenData.deficitAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCefiSupport() {
        return this.cefiSupport;
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
    public final String getDeficitAmount() {
        return this.deficitAmount;
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
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPrice() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbolTicker() {
        return this.tokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tokenSymbolTicker.hashCode();
        int iHashCode2 = Integer.hashCode(this.tokenDecimal);
        int iHashCode3 = this.tokenName.hashCode();
        int iHashCode4 = this.tokenLogo.hashCode();
        int iHashCode5 = this.tokenAmount.hashCode();
        int iHashCode6 = this.usdAmount.hashCode();
        String str = this.masterCurrencyId;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        int iHashCode8 = this.tokenCoinTypeNo.hashCode();
        int iHashCode9 = Boolean.hashCode(this.cefiSupport);
        int iHashCode10 = this.chainLogo.hashCode();
        int iHashCode11 = this.chainIndex.hashCode();
        int iHashCode12 = this.chainName.hashCode();
        String str2 = this.tokenPrice;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.deficitAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConvertUnsupportedTokenData(tokenSymbolTicker=" + this.tokenSymbolTicker + ", tokenDecimal=" + this.tokenDecimal + ", tokenName=" + this.tokenName + ", tokenLogo=" + this.tokenLogo + ", tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", masterCurrencyId=" + this.masterCurrencyId + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", cefiSupport=" + this.cefiSupport + ", chainLogo=" + this.chainLogo + ", chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", tokenPrice=" + this.tokenPrice + ", deficitAmount=" + this.deficitAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.asset.model.ConvertUnsupportedTokenData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConvertUnsupportedTokenData> serializer() {
            return ConvertUnsupportedTokenData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConvertUnsupportedTokenData(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if (8191 != (i & 8191)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8191, ConvertUnsupportedTokenData$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenSymbolTicker = str;
        this.tokenDecimal = i2;
        this.tokenName = str2;
        this.tokenLogo = str3;
        this.tokenAmount = str4;
        this.usdAmount = str5;
        this.masterCurrencyId = str6;
        this.tokenCoinTypeNo = str7;
        this.cefiSupport = z;
        this.chainLogo = str8;
        this.chainIndex = str9;
        this.chainName = str10;
        this.tokenPrice = str11;
        this.deficitAmount = (i & 8192) == 0 ? "0" : str12;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(ConvertUnsupportedTokenData convertUnsupportedTokenData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, convertUnsupportedTokenData.tokenSymbolTicker);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, convertUnsupportedTokenData.tokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, convertUnsupportedTokenData.tokenName);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, convertUnsupportedTokenData.tokenLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, convertUnsupportedTokenData.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, convertUnsupportedTokenData.usdAmount);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, convertUnsupportedTokenData.masterCurrencyId);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, convertUnsupportedTokenData.tokenCoinTypeNo);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 8, convertUnsupportedTokenData.cefiSupport);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, convertUnsupportedTokenData.chainLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, convertUnsupportedTokenData.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 11, convertUnsupportedTokenData.chainName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, convertUnsupportedTokenData.tokenPrice);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) convertUnsupportedTokenData.deficitAmount, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, convertUnsupportedTokenData.deficitAmount);
    }

    public ConvertUnsupportedTokenData(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull String str7, boolean z, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.tokenSymbolTicker = str;
        this.tokenDecimal = i;
        this.tokenName = str2;
        this.tokenLogo = str3;
        this.tokenAmount = str4;
        this.usdAmount = str5;
        this.masterCurrencyId = str6;
        this.tokenCoinTypeNo = str7;
        this.cefiSupport = z;
        this.chainLogo = str8;
        this.chainIndex = str9;
        this.chainName = str10;
        this.tokenPrice = str11;
        this.deficitAmount = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (r17v0 java.lang.String)
  (r18v0 int)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 boolean)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("0") : (r30v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:30) call: com.okinc.business.web3pay.lib.features.asset.model.ConvertUnsupportedTokenData.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ConvertUnsupportedTokenData(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, str4, str5, str6, str7, z, str8, str9, str10, str11, (i2 & 8192) != 0 ? "0" : str12);
    }
}
