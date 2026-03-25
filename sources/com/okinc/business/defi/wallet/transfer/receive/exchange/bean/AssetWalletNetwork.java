package com.okinc.business.defi.wallet.transfer.receive.exchange.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class AssetWalletNetwork implements Parcelable {
    public static final int $stable = 0;
    private final String assetAccountWalletCurrencies;
    private final Integer estimatedArrivalTime;
    private final String gasFee;
    private final String gasFeeSymbol;
    private final String networkName;
    private final Integer subCurrencyId;
    private final String usdGasFee;
    private final String usdGasFeeSymbol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AssetWalletNetwork> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<AssetWalletNetwork> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetWalletNetwork createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AssetWalletNetwork(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetWalletNetwork[] newArray(int i) {
            return new AssetWalletNetwork[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.gasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.gasFeeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.usdGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.estimatedArrivalTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.usdGasFeeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.assetAccountWalletCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetWalletNetwork copy(@NotNull String str, @NotNull String str2, @NotNull String str3, Integer num, Integer num2, @NotNull String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AssetWalletNetwork(str, str2, str3, num, num2, str4, str5, str6);
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
        if (!(obj instanceof AssetWalletNetwork)) {
            return false;
        }
        AssetWalletNetwork assetWalletNetwork = (AssetWalletNetwork) obj;
        return Intrinsics.EZpvd((Object) this.gasFee, (Object) assetWalletNetwork.gasFee) && Intrinsics.EZpvd((Object) this.gasFeeSymbol, (Object) assetWalletNetwork.gasFeeSymbol) && Intrinsics.EZpvd((Object) this.usdGasFee, (Object) assetWalletNetwork.usdGasFee) && Intrinsics.EZpvd(this.estimatedArrivalTime, assetWalletNetwork.estimatedArrivalTime) && Intrinsics.EZpvd(this.subCurrencyId, assetWalletNetwork.subCurrencyId) && Intrinsics.EZpvd((Object) this.usdGasFeeSymbol, (Object) assetWalletNetwork.usdGasFeeSymbol) && Intrinsics.EZpvd((Object) this.networkName, (Object) assetWalletNetwork.networkName) && Intrinsics.EZpvd((Object) this.assetAccountWalletCurrencies, (Object) assetWalletNetwork.assetAccountWalletCurrencies);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetAccountWalletCurrencies() {
        return this.assetAccountWalletCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEstimatedArrivalTime() {
        return this.estimatedArrivalTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasFee() {
        return this.gasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasFeeSymbol() {
        return this.gasFeeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkName() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdGasFee() {
        return this.usdGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdGasFeeSymbol() {
        return this.usdGasFeeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gasFee.hashCode();
        int iHashCode2 = this.gasFeeSymbol.hashCode();
        int iHashCode3 = this.usdGasFee.hashCode();
        Integer num = this.estimatedArrivalTime;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Integer num2 = this.subCurrencyId;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        int iHashCode6 = this.usdGasFeeSymbol.hashCode();
        String str = this.networkName;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.assetAccountWalletCurrencies;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetWalletNetwork(gasFee=" + this.gasFee + ", gasFeeSymbol=" + this.gasFeeSymbol + ", usdGasFee=" + this.usdGasFee + ", estimatedArrivalTime=" + this.estimatedArrivalTime + ", subCurrencyId=" + this.subCurrencyId + ", usdGasFeeSymbol=" + this.usdGasFeeSymbol + ", networkName=" + this.networkName + ", assetAccountWalletCurrencies=" + this.assetAccountWalletCurrencies + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.gasFee);
        parcel.writeString(this.gasFeeSymbol);
        parcel.writeString(this.usdGasFee);
        Integer num = this.estimatedArrivalTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.subCurrencyId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.usdGasFeeSymbol);
        parcel.writeString(this.networkName);
        parcel.writeString(this.assetAccountWalletCurrencies);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.transfer.receive.exchange.bean.AssetWalletNetwork.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetWalletNetwork> serializer() {
            return AssetWalletNetwork$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetWalletNetwork(int i, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (24 != (i & 24)) {
            PluginExceptionsKt.throwMissingFieldException(i, 24, AssetWalletNetwork$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.gasFee = "";
        } else {
            this.gasFee = str;
        }
        if ((i & 2) == 0) {
            this.gasFeeSymbol = "";
        } else {
            this.gasFeeSymbol = str2;
        }
        if ((i & 4) == 0) {
            this.usdGasFee = "";
        } else {
            this.usdGasFee = str3;
        }
        this.estimatedArrivalTime = num;
        this.subCurrencyId = num2;
        if ((i & 32) == 0) {
            this.usdGasFeeSymbol = "";
        } else {
            this.usdGasFeeSymbol = str4;
        }
        if ((i & 64) == 0) {
            this.networkName = "";
        } else {
            this.networkName = str5;
        }
        if ((i & 128) == 0) {
            this.assetAccountWalletCurrencies = "";
        } else {
            this.assetAccountWalletCurrencies = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AssetWalletNetwork assetWalletNetwork, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) assetWalletNetwork.gasFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, assetWalletNetwork.gasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) assetWalletNetwork.gasFeeSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, assetWalletNetwork.gasFeeSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) assetWalletNetwork.usdGasFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, assetWalletNetwork.usdGasFee);
        }
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, intSerializer, assetWalletNetwork.estimatedArrivalTime);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, intSerializer, assetWalletNetwork.subCurrencyId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) assetWalletNetwork.usdGasFeeSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, assetWalletNetwork.usdGasFeeSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) assetWalletNetwork.networkName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, assetWalletNetwork.networkName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) assetWalletNetwork.assetAccountWalletCurrencies, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, assetWalletNetwork.assetAccountWalletCurrencies);
    }

    public AssetWalletNetwork(@NotNull String str, @NotNull String str2, @NotNull String str3, Integer num, Integer num2, @NotNull String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.gasFee = str;
        this.gasFeeSymbol = str2;
        this.usdGasFee = str3;
        this.estimatedArrivalTime = num;
        this.subCurrencyId = num2;
        this.usdGasFeeSymbol = str4;
        this.networkName = str5;
        this.assetAccountWalletCurrencies = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (r16v0 java.lang.Integer)
  (r17v0 java.lang.Integer)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:71) call: com.okinc.business.defi.wallet.transfer.receive.exchange.bean.AssetWalletNetwork.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AssetWalletNetwork(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, num, num2, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6);
    }
}
