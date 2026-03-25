package com.okinc.business.web3pay.lib.features.asset.model;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class PayTokenAsset implements Parcelable {
    public static final int $stable = 0;
    private final Boolean cefiSupport;
    private final String masterCurrencyId;
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
    public static final Parcelable.Creator<PayTokenAsset> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PayTokenAsset> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayTokenAsset createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PayTokenAsset(string, string2, i, string3, string4, string5, string6, string7, boolValueOf, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayTokenAsset[] newArray(int i) {
            return new PayTokenAsset[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.masterCurrencyId;
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
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.cefiSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PayTokenAsset copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, Boolean bool, @NotNull String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new PayTokenAsset(str, str2, i, str3, str4, str5, str6, str7, bool, str8, str9);
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
        if (!(obj instanceof PayTokenAsset)) {
            return false;
        }
        PayTokenAsset payTokenAsset = (PayTokenAsset) obj;
        return Intrinsics.EZpvd((Object) this.tokenAddress, (Object) payTokenAsset.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenSymbolTicker, (Object) payTokenAsset.tokenSymbolTicker) && this.tokenDecimal == payTokenAsset.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenName, (Object) payTokenAsset.tokenName) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) payTokenAsset.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) payTokenAsset.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) payTokenAsset.usdAmount) && Intrinsics.EZpvd((Object) this.tokenPrice, (Object) payTokenAsset.tokenPrice) && Intrinsics.EZpvd(this.cefiSupport, payTokenAsset.cefiSupport) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) payTokenAsset.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.masterCurrencyId, (Object) payTokenAsset.masterCurrencyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCefiSupport() {
        return this.cefiSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterCurrencyId() {
        return this.masterCurrencyId;
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
        int iHashCode = this.tokenAddress.hashCode();
        int iHashCode2 = this.tokenSymbolTicker.hashCode();
        int iHashCode3 = Integer.hashCode(this.tokenDecimal);
        int iHashCode4 = this.tokenName.hashCode();
        int iHashCode5 = this.tokenLogo.hashCode();
        int iHashCode6 = this.tokenAmount.hashCode();
        int iHashCode7 = this.usdAmount.hashCode();
        String str = this.tokenPrice;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        Boolean bool = this.cefiSupport;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        int iHashCode10 = this.tokenCoinTypeNo.hashCode();
        String str2 = this.masterCurrencyId;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PayTokenAsset(tokenAddress=" + this.tokenAddress + ", tokenSymbolTicker=" + this.tokenSymbolTicker + ", tokenDecimal=" + this.tokenDecimal + ", tokenName=" + this.tokenName + ", tokenLogo=" + this.tokenLogo + ", tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", tokenPrice=" + this.tokenPrice + ", cefiSupport=" + this.cefiSupport + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", masterCurrencyId=" + this.masterCurrencyId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tokenSymbolTicker);
        parcel.writeInt(this.tokenDecimal);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenLogo);
        parcel.writeString(this.tokenAmount);
        parcel.writeString(this.usdAmount);
        parcel.writeString(this.tokenPrice);
        Boolean bool = this.cefiSupport;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.tokenCoinTypeNo);
        parcel.writeString(this.masterCurrencyId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.asset.model.PayTokenAsset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PayTokenAsset> serializer() {
            return PayTokenAsset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PayTokenAsset(int i, String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (767 != (i & 767)) {
            PluginExceptionsKt.throwMissingFieldException(i, 767, PayTokenAsset$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenAddress = str;
        this.tokenSymbolTicker = str2;
        this.tokenDecimal = i2;
        this.tokenName = str3;
        this.tokenLogo = str4;
        this.tokenAmount = str5;
        this.usdAmount = str6;
        this.tokenPrice = str7;
        if ((i & 256) == 0) {
            this.cefiSupport = Boolean.TRUE;
        } else {
            this.cefiSupport = bool;
        }
        this.tokenCoinTypeNo = str8;
        if ((i & 1024) == 0) {
            this.masterCurrencyId = null;
        } else {
            this.masterCurrencyId = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(PayTokenAsset payTokenAsset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, payTokenAsset.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, payTokenAsset.tokenSymbolTicker);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, payTokenAsset.tokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, payTokenAsset.tokenName);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, payTokenAsset.tokenLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, payTokenAsset.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, payTokenAsset.usdAmount);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, payTokenAsset.tokenPrice);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(payTokenAsset.cefiSupport, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, payTokenAsset.cefiSupport);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, payTokenAsset.tokenCoinTypeNo);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && payTokenAsset.masterCurrencyId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, payTokenAsset.masterCurrencyId);
    }

    public PayTokenAsset(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, Boolean bool, @NotNull String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.tokenAddress = str;
        this.tokenSymbolTicker = str2;
        this.tokenDecimal = i;
        this.tokenName = str3;
        this.tokenLogo = str4;
        this.tokenAmount = str5;
        this.usdAmount = str6;
        this.tokenPrice = str7;
        this.cefiSupport = bool;
        this.tokenCoinTypeNo = str8;
        this.masterCurrencyId = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 int)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (r24v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:102) call: com.okinc.business.web3pay.lib.features.asset.model.PayTokenAsset.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PayTokenAsset(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, str4, str5, str6, str7, (i2 & 256) != 0 ? Boolean.TRUE : bool, str8, (i2 & 1024) != 0 ? null : str9);
    }
}
