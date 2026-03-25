package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TokenAsset implements Parcelable {
    private String address;
    private int addressType;
    private String coinAmount;
    private String coinAmountDec;
    private long coinId;
    private String currencyAmount;
    private String holdAvgPrice;
    private String platformName;
    private String spotBalance;
    private String unPnl;
    private String unPnlYield;
    private boolean voucherToken;
    private String walletInvestmentType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TokenAsset> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TokenAsset> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenAsset createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenAsset(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenAsset[] newArray(int i) {
            return new TokenAsset[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenAsset() {
        this(0L, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    @SerialName("addr")
    public static /* synthetic */ void getAddress$annotations() {
    }

    @SerialName("addrT")
    public static /* synthetic */ void getAddressType$annotations() {
    }

    @SerialName("amt")
    public static /* synthetic */ void getCoinAmount$annotations() {
    }

    @SerialName("amtD")
    public static /* synthetic */ void getCoinAmountDec$annotations() {
    }

    @SerialName("cid")
    public static /* synthetic */ void getCoinId$annotations() {
    }

    @SerialName("camt")
    public static /* synthetic */ void getCurrencyAmount$annotations() {
    }

    @SerialName("hap")
    public static /* synthetic */ void getHoldAvgPrice$annotations() {
    }

    @SerialName("pnam")
    public static /* synthetic */ void getPlatformName$annotations() {
    }

    @SerialName("sb")
    public static /* synthetic */ void getSpotBalance$annotations() {
    }

    @SerialName("upnl")
    public static /* synthetic */ void getUnPnl$annotations() {
    }

    @SerialName("uy")
    public static /* synthetic */ void getUnPnlYield$annotations() {
    }

    @SerialName("vtk")
    public static /* synthetic */ void getVoucherToken$annotations() {
    }

    @SerialName("witp")
    public static /* synthetic */ void getWalletInvestmentType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.walletInvestmentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.spotBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.holdAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.coinAmountDec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.voucherToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.unPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.unPnlYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAsset copy(long j, @NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, String str5, String str6, @NotNull String str7, @NotNull String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new TokenAsset(j, str, i, str2, str3, str4, z, str5, str6, str7, str8, str9, str10);
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
        if (!(obj instanceof TokenAsset)) {
            return false;
        }
        TokenAsset tokenAsset = (TokenAsset) obj;
        return this.coinId == tokenAsset.coinId && Intrinsics.EZpvd((Object) this.address, (Object) tokenAsset.address) && this.addressType == tokenAsset.addressType && Intrinsics.EZpvd((Object) this.coinAmount, (Object) tokenAsset.coinAmount) && Intrinsics.EZpvd((Object) this.coinAmountDec, (Object) tokenAsset.coinAmountDec) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) tokenAsset.currencyAmount) && this.voucherToken == tokenAsset.voucherToken && Intrinsics.EZpvd((Object) this.unPnl, (Object) tokenAsset.unPnl) && Intrinsics.EZpvd((Object) this.unPnlYield, (Object) tokenAsset.unPnlYield) && Intrinsics.EZpvd((Object) this.platformName, (Object) tokenAsset.platformName) && Intrinsics.EZpvd((Object) this.walletInvestmentType, (Object) tokenAsset.walletInvestmentType) && Intrinsics.EZpvd((Object) this.spotBalance, (Object) tokenAsset.spotBalance) && Intrinsics.EZpvd((Object) this.holdAvgPrice, (Object) tokenAsset.holdAvgPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmountDec() {
        return this.coinAmountDec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldAvgPrice() {
        return this.holdAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotBalance() {
        return this.spotBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnPnl() {
        return this.unPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnPnlYield() {
        return this.unPnlYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getVoucherToken() {
        return this.voucherToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletInvestmentType() {
        return this.walletInvestmentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.coinId);
        int iHashCode2 = this.address.hashCode();
        int iHashCode3 = Integer.hashCode(this.addressType);
        int iHashCode4 = this.coinAmount.hashCode();
        int iHashCode5 = this.coinAmountDec.hashCode();
        int iHashCode6 = this.currencyAmount.hashCode();
        int iHashCode7 = Boolean.hashCode(this.voucherToken);
        String str = this.unPnl;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.unPnlYield;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        int iHashCode10 = this.platformName.hashCode();
        int iHashCode11 = this.walletInvestmentType.hashCode();
        String str3 = this.spotBalance;
        int iHashCode12 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.holdAvgPrice;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressType(int i) {
        this.addressType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmountDec(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinAmountDec = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoldAvgPrice(String str) {
        this.holdAvgPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlatformName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.platformName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotBalance(String str) {
        this.spotBalance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnPnl(String str) {
        this.unPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnPnlYield(String str) {
        this.unPnlYield = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVoucherToken(boolean z) {
        this.voucherToken = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletInvestmentType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletInvestmentType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenAsset(coinId=" + this.coinId + ", address=" + this.address + ", addressType=" + this.addressType + ", coinAmount=" + this.coinAmount + ", coinAmountDec=" + this.coinAmountDec + ", currencyAmount=" + this.currencyAmount + ", voucherToken=" + this.voucherToken + ", unPnl=" + this.unPnl + ", unPnlYield=" + this.unPnlYield + ", platformName=" + this.platformName + ", walletInvestmentType=" + this.walletInvestmentType + ", spotBalance=" + this.spotBalance + ", holdAvgPrice=" + this.holdAvgPrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.coinId);
        parcel.writeString(this.address);
        parcel.writeInt(this.addressType);
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.coinAmountDec);
        parcel.writeString(this.currencyAmount);
        parcel.writeInt(this.voucherToken ? 1 : 0);
        parcel.writeString(this.unPnl);
        parcel.writeString(this.unPnlYield);
        parcel.writeString(this.platformName);
        parcel.writeString(this.walletInvestmentType);
        parcel.writeString(this.spotBalance);
        parcel.writeString(this.holdAvgPrice);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.TokenAsset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenAsset> serializer() {
            return TokenAsset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenAsset(int i, long j, String str, int i2, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        this.coinId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
        this.addressType = (i & 4) == 0 ? 1 : i2;
        if ((i & 8) == 0) {
            this.coinAmount = "";
        } else {
            this.coinAmount = str2;
        }
        if ((i & 16) == 0) {
            this.coinAmountDec = "";
        } else {
            this.coinAmountDec = str3;
        }
        this.currencyAmount = (i & 32) == 0 ? "0" : str4;
        this.voucherToken = (i & 64) == 0 ? false : z;
        if ((i & 128) == 0) {
            this.unPnl = null;
        } else {
            this.unPnl = str5;
        }
        if ((i & 256) == 0) {
            this.unPnlYield = null;
        } else {
            this.unPnlYield = str6;
        }
        if ((i & 512) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str7;
        }
        if ((i & 1024) == 0) {
            this.walletInvestmentType = "";
        } else {
            this.walletInvestmentType = str8;
        }
        if ((i & 2048) == 0) {
            this.spotBalance = "";
        } else {
            this.spotBalance = str9;
        }
        if ((i & 4096) == 0) {
            this.holdAvgPrice = "";
        } else {
            this.holdAvgPrice = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TokenAsset tokenAsset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tokenAsset.coinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, tokenAsset.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tokenAsset.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenAsset.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tokenAsset.addressType != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, tokenAsset.addressType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tokenAsset.coinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenAsset.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tokenAsset.coinAmountDec, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenAsset.coinAmountDec);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tokenAsset.currencyAmount, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tokenAsset.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tokenAsset.voucherToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, tokenAsset.voucherToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || tokenAsset.unPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, tokenAsset.unPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tokenAsset.unPnlYield != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, tokenAsset.unPnlYield);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tokenAsset.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tokenAsset.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tokenAsset.walletInvestmentType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tokenAsset.walletInvestmentType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tokenAsset.spotBalance, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, tokenAsset.spotBalance);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd((Object) tokenAsset.holdAvgPrice, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, tokenAsset.holdAvgPrice);
    }

    public TokenAsset(long j, @NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, String str5, String str6, @NotNull String str7, @NotNull String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.coinId = j;
        this.address = str;
        this.addressType = i;
        this.coinAmount = str2;
        this.coinAmountDec = str3;
        this.currencyAmount = str4;
        this.voucherToken = z;
        this.unPnl = str5;
        this.unPnlYield = str6;
        this.platformName = str7;
        this.walletInvestmentType = str8;
        this.spotBalance = str9;
        this.holdAvgPrice = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0089: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r19v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("0") : (r22v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r30v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
 A[MD:(long, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:328) call: com.okinc.business.defi.biz.net.bean.TokenAsset.<init>(long, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenAsset(long j, String str, int i, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "0" : str4, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? null : str5, (i2 & 256) == 0 ? str6 : null, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? "" : str8, (i2 & 2048) != 0 ? "" : str9, (i2 & 4096) == 0 ? str10 : "");
    }

    public final TokenAsset copy() {
        return new TokenAsset(this.coinId, this.address, this.addressType, this.coinAmount, this.coinAmountDec, this.currencyAmount, this.voucherToken, this.unPnl, this.unPnlYield, this.platformName, this.walletInvestmentType, this.spotBalance, this.holdAvgPrice);
    }
}
