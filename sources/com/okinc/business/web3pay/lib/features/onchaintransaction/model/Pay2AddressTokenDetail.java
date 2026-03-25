package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class Pay2AddressTokenDetail {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Boolean cefiAllowed;
    private final String chainIndex;
    private final String chainLogo;
    private final String chainName;
    private final String masterCurrencyId;
    private final String maxTokenAmount;
    private final String minTokenAmount;
    private final String toTokenCoinTypeNo;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final int tokenDecimal;
    private final String tokenLogo;
    private final String tokenPrice;
    private final String tokenSymbolTicker;
    private final String usdAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.toTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.cefiAllowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.minTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.maxTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pay2AddressTokenDetail copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9, @NotNull String str10, String str11, Boolean bool, String str12, String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new Pay2AddressTokenDetail(str, str2, str3, str4, i, str5, str6, str7, str8, str9, str10, str11, bool, str12, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pay2AddressTokenDetail)) {
            return false;
        }
        Pay2AddressTokenDetail pay2AddressTokenDetail = (Pay2AddressTokenDetail) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) pay2AddressTokenDetail.chainIndex) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) pay2AddressTokenDetail.chainLogo) && Intrinsics.EZpvd((Object) this.chainName, (Object) pay2AddressTokenDetail.chainName) && Intrinsics.EZpvd((Object) this.tokenSymbolTicker, (Object) pay2AddressTokenDetail.tokenSymbolTicker) && this.tokenDecimal == pay2AddressTokenDetail.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) pay2AddressTokenDetail.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) pay2AddressTokenDetail.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) pay2AddressTokenDetail.usdAmount) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) pay2AddressTokenDetail.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.masterCurrencyId, (Object) pay2AddressTokenDetail.masterCurrencyId) && Intrinsics.EZpvd((Object) this.tokenPrice, (Object) pay2AddressTokenDetail.tokenPrice) && Intrinsics.EZpvd((Object) this.toTokenCoinTypeNo, (Object) pay2AddressTokenDetail.toTokenCoinTypeNo) && Intrinsics.EZpvd(this.cefiAllowed, pay2AddressTokenDetail.cefiAllowed) && Intrinsics.EZpvd((Object) this.minTokenAmount, (Object) pay2AddressTokenDetail.minTokenAmount) && Intrinsics.EZpvd((Object) this.maxTokenAmount, (Object) pay2AddressTokenDetail.maxTokenAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCefiAllowed() {
        return this.cefiAllowed;
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
    public final String getMasterCurrencyId() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxTokenAmount() {
        return this.maxTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinTokenAmount() {
        return this.minTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenCoinTypeNo() {
        return this.toTokenCoinTypeNo;
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
    public final String getTokenSymbolTicker() {
        return this.tokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = this.chainLogo.hashCode();
        int iHashCode3 = this.chainName.hashCode();
        int iHashCode4 = this.tokenSymbolTicker.hashCode();
        int iHashCode5 = Integer.hashCode(this.tokenDecimal);
        int iHashCode6 = this.tokenLogo.hashCode();
        int iHashCode7 = this.tokenAmount.hashCode();
        int iHashCode8 = this.usdAmount.hashCode();
        int iHashCode9 = this.tokenCoinTypeNo.hashCode();
        String str = this.masterCurrencyId;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        int iHashCode11 = this.tokenPrice.hashCode();
        String str2 = this.toTokenCoinTypeNo;
        int iHashCode12 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.cefiAllowed;
        int iHashCode13 = bool == null ? 0 : bool.hashCode();
        String str3 = this.minTokenAmount;
        int iHashCode14 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.maxTokenAmount;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str4 == null ? 0 : str4.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Pay2AddressTokenDetail(chainIndex=" + this.chainIndex + ", chainLogo=" + this.chainLogo + ", chainName=" + this.chainName + ", tokenSymbolTicker=" + this.tokenSymbolTicker + ", tokenDecimal=" + this.tokenDecimal + ", tokenLogo=" + this.tokenLogo + ", tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", masterCurrencyId=" + this.masterCurrencyId + ", tokenPrice=" + this.tokenPrice + ", toTokenCoinTypeNo=" + this.toTokenCoinTypeNo + ", cefiAllowed=" + this.cefiAllowed + ", minTokenAmount=" + this.minTokenAmount + ", maxTokenAmount=" + this.maxTokenAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.Pay2AddressTokenDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Pay2AddressTokenDetail> serializer() {
            return Pay2AddressTokenDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Pay2AddressTokenDetail(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if (1535 != (i & 1535)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1535, Pay2AddressTokenDetail$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.chainLogo = str2;
        this.chainName = str3;
        this.tokenSymbolTicker = str4;
        this.tokenDecimal = i2;
        this.tokenLogo = str5;
        this.tokenAmount = str6;
        this.usdAmount = str7;
        this.tokenCoinTypeNo = str8;
        if ((i & 512) == 0) {
            this.masterCurrencyId = "";
        } else {
            this.masterCurrencyId = str9;
        }
        this.tokenPrice = str10;
        if ((i & 2048) == 0) {
            this.toTokenCoinTypeNo = "";
        } else {
            this.toTokenCoinTypeNo = str11;
        }
        this.cefiAllowed = (i & 4096) == 0 ? Boolean.FALSE : bool;
        if ((i & 8192) == 0) {
            this.minTokenAmount = null;
        } else {
            this.minTokenAmount = str12;
        }
        if ((i & 16384) == 0) {
            this.maxTokenAmount = null;
        } else {
            this.maxTokenAmount = str13;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(Pay2AddressTokenDetail pay2AddressTokenDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pay2AddressTokenDetail.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, pay2AddressTokenDetail.chainLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, pay2AddressTokenDetail.chainName);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, pay2AddressTokenDetail.tokenSymbolTicker);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, pay2AddressTokenDetail.tokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, pay2AddressTokenDetail.tokenLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, pay2AddressTokenDetail.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, pay2AddressTokenDetail.usdAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, pay2AddressTokenDetail.tokenCoinTypeNo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) pay2AddressTokenDetail.masterCurrencyId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, pay2AddressTokenDetail.masterCurrencyId);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, pay2AddressTokenDetail.tokenPrice);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) pay2AddressTokenDetail.toTokenCoinTypeNo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, pay2AddressTokenDetail.toTokenCoinTypeNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(pay2AddressTokenDetail.cefiAllowed, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, pay2AddressTokenDetail.cefiAllowed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || pay2AddressTokenDetail.minTokenAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, pay2AddressTokenDetail.minTokenAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && pay2AddressTokenDetail.maxTokenAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, pay2AddressTokenDetail.maxTokenAmount);
    }

    public Pay2AddressTokenDetail(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9, @NotNull String str10, String str11, Boolean bool, String str12, String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.chainIndex = str;
        this.chainLogo = str2;
        this.chainName = str3;
        this.tokenSymbolTicker = str4;
        this.tokenDecimal = i;
        this.tokenLogo = str5;
        this.tokenAmount = str6;
        this.usdAmount = str7;
        this.tokenCoinTypeNo = str8;
        this.masterCurrencyId = str9;
        this.tokenPrice = str10;
        this.toTokenCoinTypeNo = str11;
        this.cefiAllowed = bool;
        this.minTokenAmount = str12;
        this.maxTokenAmount = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 int)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (r30v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r32v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r35v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.Pay2AddressTokenDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ Pay2AddressTokenDetail(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, String str12, String str13, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, str5, str6, str7, str8, (i2 & 512) != 0 ? "" : str9, str10, (i2 & 2048) != 0 ? "" : str11, (i2 & 4096) != 0 ? Boolean.FALSE : bool, (i2 & 8192) != 0 ? null : str12, (i2 & 16384) != 0 ? null : str13);
    }
}
