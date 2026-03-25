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
public final class ConvertPayTokenAsset implements Parcelable {
    public static final int $stable = 0;
    private final String masterCurrencyId;
    private final String toMasterCurrencyId;
    private final String toTokenAddress;
    private final String toTokenCoinTypeNo;
    private final int toTokenDecimal;
    private final String toTokenLogo;
    private final String toTokenName;
    private final String toTokenSymbolTicker;
    private final String tokenAddress;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final int tokenDecimal;
    private final String tokenLogo;
    private final String tokenName;
    private final String tokenSymbolTicker;
    private final String usdAmount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ConvertPayTokenAsset> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ConvertPayTokenAsset> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertPayTokenAsset createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ConvertPayTokenAsset(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertPayTokenAsset[] newArray(int i) {
            return new ConvertPayTokenAsset[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.toTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.toTokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.toTokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.toTokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.toMasterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertPayTokenAsset copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i2, @NotNull String str12, @NotNull String str13, String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new ConvertPayTokenAsset(str, str2, i, str3, str4, str5, str6, str7, str8, str9, str10, str11, i2, str12, str13, str14);
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
        if (!(obj instanceof ConvertPayTokenAsset)) {
            return false;
        }
        ConvertPayTokenAsset convertPayTokenAsset = (ConvertPayTokenAsset) obj;
        return Intrinsics.EZpvd((Object) this.tokenAddress, (Object) convertPayTokenAsset.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenSymbolTicker, (Object) convertPayTokenAsset.tokenSymbolTicker) && this.tokenDecimal == convertPayTokenAsset.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenName, (Object) convertPayTokenAsset.tokenName) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) convertPayTokenAsset.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) convertPayTokenAsset.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) convertPayTokenAsset.usdAmount) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) convertPayTokenAsset.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.masterCurrencyId, (Object) convertPayTokenAsset.masterCurrencyId) && Intrinsics.EZpvd((Object) this.toTokenCoinTypeNo, (Object) convertPayTokenAsset.toTokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) convertPayTokenAsset.toTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenSymbolTicker, (Object) convertPayTokenAsset.toTokenSymbolTicker) && this.toTokenDecimal == convertPayTokenAsset.toTokenDecimal && Intrinsics.EZpvd((Object) this.toTokenName, (Object) convertPayTokenAsset.toTokenName) && Intrinsics.EZpvd((Object) this.toTokenLogo, (Object) convertPayTokenAsset.toTokenLogo) && Intrinsics.EZpvd((Object) this.toMasterCurrencyId, (Object) convertPayTokenAsset.toMasterCurrencyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterCurrencyId() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToMasterCurrencyId() {
        return this.toMasterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenCoinTypeNo() {
        return this.toTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getToTokenDecimal() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenLogo() {
        return this.toTokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenName() {
        return this.toTokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenSymbolTicker() {
        return this.toTokenSymbolTicker;
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
    public final String getTokenSymbolTicker() {
        return this.tokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tokenAddress.hashCode();
        int iHashCode2 = this.tokenSymbolTicker.hashCode();
        int iHashCode3 = Integer.hashCode(this.tokenDecimal);
        int iHashCode4 = this.tokenName.hashCode();
        int iHashCode5 = this.tokenLogo.hashCode();
        int iHashCode6 = this.tokenAmount.hashCode();
        int iHashCode7 = this.usdAmount.hashCode();
        int iHashCode8 = this.tokenCoinTypeNo.hashCode();
        String str = this.masterCurrencyId;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        int iHashCode10 = this.toTokenCoinTypeNo.hashCode();
        int iHashCode11 = this.toTokenAddress.hashCode();
        int iHashCode12 = this.toTokenSymbolTicker.hashCode();
        int iHashCode13 = Integer.hashCode(this.toTokenDecimal);
        int iHashCode14 = this.toTokenName.hashCode();
        int iHashCode15 = this.toTokenLogo.hashCode();
        String str2 = this.toMasterCurrencyId;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str2 == null ? 0 : str2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConvertPayTokenAsset(tokenAddress=" + this.tokenAddress + ", tokenSymbolTicker=" + this.tokenSymbolTicker + ", tokenDecimal=" + this.tokenDecimal + ", tokenName=" + this.tokenName + ", tokenLogo=" + this.tokenLogo + ", tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", masterCurrencyId=" + this.masterCurrencyId + ", toTokenCoinTypeNo=" + this.toTokenCoinTypeNo + ", toTokenAddress=" + this.toTokenAddress + ", toTokenSymbolTicker=" + this.toTokenSymbolTicker + ", toTokenDecimal=" + this.toTokenDecimal + ", toTokenName=" + this.toTokenName + ", toTokenLogo=" + this.toTokenLogo + ", toMasterCurrencyId=" + this.toMasterCurrencyId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tokenSymbolTicker);
        parcel.writeInt(this.tokenDecimal);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenLogo);
        parcel.writeString(this.tokenAmount);
        parcel.writeString(this.usdAmount);
        parcel.writeString(this.tokenCoinTypeNo);
        parcel.writeString(this.masterCurrencyId);
        parcel.writeString(this.toTokenCoinTypeNo);
        parcel.writeString(this.toTokenAddress);
        parcel.writeString(this.toTokenSymbolTicker);
        parcel.writeInt(this.toTokenDecimal);
        parcel.writeString(this.toTokenName);
        parcel.writeString(this.toTokenLogo);
        parcel.writeString(this.toMasterCurrencyId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.asset.model.ConvertPayTokenAsset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConvertPayTokenAsset> serializer() {
            return ConvertPayTokenAsset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConvertPayTokenAsset(int i, String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i3, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        if (32511 != (i & 32511)) {
            PluginExceptionsKt.throwMissingFieldException(i, 32511, ConvertPayTokenAsset$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenAddress = str;
        this.tokenSymbolTicker = str2;
        this.tokenDecimal = i2;
        this.tokenName = str3;
        this.tokenLogo = str4;
        this.tokenAmount = str5;
        this.usdAmount = str6;
        this.tokenCoinTypeNo = str7;
        if ((i & 256) == 0) {
            this.masterCurrencyId = null;
        } else {
            this.masterCurrencyId = str8;
        }
        this.toTokenCoinTypeNo = str9;
        this.toTokenAddress = str10;
        this.toTokenSymbolTicker = str11;
        this.toTokenDecimal = i3;
        this.toTokenName = str12;
        this.toTokenLogo = str13;
        if ((i & 32768) == 0) {
            this.toMasterCurrencyId = null;
        } else {
            this.toMasterCurrencyId = str14;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(ConvertPayTokenAsset convertPayTokenAsset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, convertPayTokenAsset.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, convertPayTokenAsset.tokenSymbolTicker);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, convertPayTokenAsset.tokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, convertPayTokenAsset.tokenName);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, convertPayTokenAsset.tokenLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, convertPayTokenAsset.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, convertPayTokenAsset.usdAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, convertPayTokenAsset.tokenCoinTypeNo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || convertPayTokenAsset.masterCurrencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, convertPayTokenAsset.masterCurrencyId);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, convertPayTokenAsset.toTokenCoinTypeNo);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, convertPayTokenAsset.toTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 11, convertPayTokenAsset.toTokenSymbolTicker);
        compositeEncoder.encodeIntElement(serialDescriptor, 12, convertPayTokenAsset.toTokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 13, convertPayTokenAsset.toTokenName);
        compositeEncoder.encodeStringElement(serialDescriptor, 14, convertPayTokenAsset.toTokenLogo);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && convertPayTokenAsset.toMasterCurrencyId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, convertPayTokenAsset.toMasterCurrencyId);
    }

    public ConvertPayTokenAsset(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i2, @NotNull String str12, @NotNull String str13, String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.tokenAddress = str;
        this.tokenSymbolTicker = str2;
        this.tokenDecimal = i;
        this.tokenName = str3;
        this.tokenLogo = str4;
        this.tokenAmount = str5;
        this.usdAmount = str6;
        this.tokenCoinTypeNo = str7;
        this.masterCurrencyId = str8;
        this.toTokenCoinTypeNo = str9;
        this.toTokenAddress = str10;
        this.toTokenSymbolTicker = str11;
        this.toTokenDecimal = i2;
        this.toTokenName = str12;
        this.toTokenLogo = str13;
        this.toMasterCurrencyId = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 int)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 int)
  (r34v0 java.lang.String)
  (r35v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r37v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:80) call: com.okinc.business.web3pay.lib.features.asset.model.ConvertPayTokenAsset.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ConvertPayTokenAsset(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i2, String str12, String str13, String str14, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, str4, str5, str6, str7, (i3 & 256) != 0 ? null : str8, str9, str10, str11, i2, str12, str13, (i3 & 32768) != 0 ? null : str14);
    }
}
