package com.okinc.business.web3pay.lib.features.asset.model;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class TokenDetail implements Parcelable {
    public static final int $stable = 0;
    private final boolean cefiSupport;
    private final String chainIndex;
    private final String chainLogo;
    private final String chainName;
    private final String deficitAmount;
    private final String masterCurrencyId;
    private final boolean pay;
    private final boolean sendSupport;
    private final String tokenAddress;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final int tokenDecimal;
    private final String tokenLogo;
    private final String tokenName;
    private final String tokenPrice;
    private final String tokenSymbolTicker;
    private final String usdAmount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TokenDetail> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TokenDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenDetail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenDetail[] newArray(int i) {
            return new TokenDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.pay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.cefiSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.sendSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.deficitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenDetail copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9, boolean z, String str10, @NotNull String str11, String str12, boolean z2, boolean z3, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new TokenDetail(str, str2, str3, str4, str5, i, str6, str7, str8, str9, z, str10, str11, str12, z2, z3, str13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenDetail)) {
            return false;
        }
        TokenDetail tokenDetail = (TokenDetail) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) tokenDetail.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) tokenDetail.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) tokenDetail.chainLogo) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) tokenDetail.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenSymbolTicker, (Object) tokenDetail.tokenSymbolTicker) && this.tokenDecimal == tokenDetail.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenDetail.tokenName) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) tokenDetail.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) tokenDetail.tokenAmount) && Intrinsics.EZpvd((Object) this.tokenPrice, (Object) tokenDetail.tokenPrice) && this.pay == tokenDetail.pay && Intrinsics.EZpvd((Object) this.usdAmount, (Object) tokenDetail.usdAmount) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) tokenDetail.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.masterCurrencyId, (Object) tokenDetail.masterCurrencyId) && this.cefiSupport == tokenDetail.cefiSupport && this.sendSupport == tokenDetail.sendSupport && Intrinsics.EZpvd((Object) this.deficitAmount, (Object) tokenDetail.deficitAmount);
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
    public final boolean getPay() {
        return this.pay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSendSupport() {
        return this.sendSupport;
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
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = this.chainName.hashCode();
        int iHashCode3 = this.chainLogo.hashCode();
        String str = this.tokenAddress;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.tokenSymbolTicker.hashCode();
        int iHashCode6 = Integer.hashCode(this.tokenDecimal);
        int iHashCode7 = this.tokenName.hashCode();
        int iHashCode8 = this.tokenLogo.hashCode();
        int iHashCode9 = this.tokenAmount.hashCode();
        String str2 = this.tokenPrice;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        int iHashCode11 = Boolean.hashCode(this.pay);
        String str3 = this.usdAmount;
        int iHashCode12 = str3 == null ? 0 : str3.hashCode();
        int iHashCode13 = this.tokenCoinTypeNo.hashCode();
        String str4 = this.masterCurrencyId;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.cefiSupport)) * 31) + Boolean.hashCode(this.sendSupport)) * 31) + this.deficitAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenDetail(chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", tokenAddress=" + this.tokenAddress + ", tokenSymbolTicker=" + this.tokenSymbolTicker + ", tokenDecimal=" + this.tokenDecimal + ", tokenName=" + this.tokenName + ", tokenLogo=" + this.tokenLogo + ", tokenAmount=" + this.tokenAmount + ", tokenPrice=" + this.tokenPrice + ", pay=" + this.pay + ", usdAmount=" + this.usdAmount + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", masterCurrencyId=" + this.masterCurrencyId + ", cefiSupport=" + this.cefiSupport + ", sendSupport=" + this.sendSupport + ", deficitAmount=" + this.deficitAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.chainName);
        parcel.writeString(this.chainLogo);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tokenSymbolTicker);
        parcel.writeInt(this.tokenDecimal);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenLogo);
        parcel.writeString(this.tokenAmount);
        parcel.writeString(this.tokenPrice);
        parcel.writeInt(this.pay ? 1 : 0);
        parcel.writeString(this.usdAmount);
        parcel.writeString(this.tokenCoinTypeNo);
        parcel.writeString(this.masterCurrencyId);
        parcel.writeInt(this.cefiSupport ? 1 : 0);
        parcel.writeInt(this.sendSupport ? 1 : 0);
        parcel.writeString(this.deficitAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.asset.model.TokenDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenDetail> serializer() {
            return TokenDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenDetail(int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, String str8, String str9, boolean z, String str10, String str11, String str12, boolean z2, boolean z3, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if (55287 != (i & 55287)) {
            PluginExceptionsKt.throwMissingFieldException(i, 55287, TokenDetail$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.chainName = str2;
        this.chainLogo = str3;
        if ((i & 8) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str4;
        }
        this.tokenSymbolTicker = str5;
        this.tokenDecimal = i2;
        this.tokenName = str6;
        this.tokenLogo = str7;
        this.tokenAmount = str8;
        this.tokenPrice = str9;
        this.pay = z;
        if ((i & 2048) == 0) {
            this.usdAmount = null;
        } else {
            this.usdAmount = str10;
        }
        this.tokenCoinTypeNo = str11;
        if ((i & 8192) == 0) {
            this.masterCurrencyId = null;
        } else {
            this.masterCurrencyId = str12;
        }
        this.cefiSupport = z2;
        this.sendSupport = z3;
        this.deficitAmount = (i & 65536) == 0 ? "0" : str13;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(TokenDetail tokenDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenDetail.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenDetail.chainName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenDetail.chainLogo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tokenDetail.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tokenDetail.tokenAddress);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenDetail.tokenSymbolTicker);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, tokenDetail.tokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, tokenDetail.tokenName);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, tokenDetail.tokenLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, tokenDetail.tokenAmount);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, tokenDetail.tokenPrice);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 10, tokenDetail.pay);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || tokenDetail.usdAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, tokenDetail.usdAmount);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, tokenDetail.tokenCoinTypeNo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || tokenDetail.masterCurrencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, tokenDetail.masterCurrencyId);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 14, tokenDetail.cefiSupport);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 15, tokenDetail.sendSupport);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) tokenDetail.deficitAmount, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, tokenDetail.deficitAmount);
    }

    public TokenDetail(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7, @NotNull String str8, String str9, boolean z, String str10, @NotNull String str11, String str12, boolean z2, boolean z3, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.chainIndex = str;
        this.chainName = str2;
        this.chainLogo = str3;
        this.tokenAddress = str4;
        this.tokenSymbolTicker = str5;
        this.tokenDecimal = i;
        this.tokenName = str6;
        this.tokenLogo = str7;
        this.tokenAmount = str8;
        this.tokenPrice = str9;
        this.pay = z;
        this.usdAmount = str10;
        this.tokenCoinTypeNo = str11;
        this.masterCurrencyId = str12;
        this.cefiSupport = z2;
        this.sendSupport = z3;
        this.deficitAmount = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0044: CONSTRUCTOR 
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r39v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (r26v0 java.lang.String)
  (r27v0 int)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (r32v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r39v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (r34v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r39v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (r36v0 boolean)
  (r37v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r39v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("0") : (r38v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void (m)] (LINE:39) call: com.okinc.business.web3pay.lib.features.asset.model.TokenDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ TokenDetail(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, boolean z, String str10, String str11, String str12, boolean z2, boolean z3, String str13, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? null : str4, str5, i, str6, str7, str8, str9, z, (i2 & 2048) != 0 ? null : str10, str11, (i2 & 8192) != 0 ? null : str12, z2, z3, (i2 & 65536) != 0 ? "0" : str13);
    }
}
