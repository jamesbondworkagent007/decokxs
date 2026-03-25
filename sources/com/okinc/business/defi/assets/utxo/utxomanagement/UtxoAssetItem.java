package com.okinc.business.defi.assets.utxo.utxomanagement;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class UtxoAssetItem implements Parcelable {
    public static final int $stable = 0;
    public final int assetType;
    public final String collectionName;
    public final String fiatAmount;
    public final String nftId;
    public final int protocolId;
    public final String protocolName;
    public final String tokenAmount;
    public final String tokenLogo;
    public final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UtxoAssetItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UtxoAssetItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoAssetItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UtxoAssetItem(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoAssetItem[] newArray(int i) {
            return new UtxoAssetItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UtxoAssetItem() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.assetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.collectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoAssetItem OLrzqt(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new UtxoAssetItem(i, str, str2, str3, str4, str5, str6, str7, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.fiatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.protocolName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtxoAssetItem)) {
            return false;
        }
        UtxoAssetItem utxoAssetItem = (UtxoAssetItem) obj;
        return this.protocolId == utxoAssetItem.protocolId && Intrinsics.EZpvd((Object) this.protocolName, (Object) utxoAssetItem.protocolName) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) utxoAssetItem.tokenLogo) && Intrinsics.EZpvd((Object) this.collectionName, (Object) utxoAssetItem.collectionName) && Intrinsics.EZpvd((Object) this.nftId, (Object) utxoAssetItem.nftId) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) utxoAssetItem.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) utxoAssetItem.tokenAmount) && Intrinsics.EZpvd((Object) this.fiatAmount, (Object) utxoAssetItem.fiatAmount) && this.assetType == utxoAssetItem.assetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.protocolId) * 31) + this.protocolName.hashCode()) * 31) + this.tokenLogo.hashCode()) * 31) + this.collectionName.hashCode()) * 31) + this.nftId.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenAmount.hashCode()) * 31) + this.fiatAmount.hashCode()) * 31) + Integer.hashCode(this.assetType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoAssetItem(protocolId=" + this.protocolId + ", protocolName=" + this.protocolName + ", tokenLogo=" + this.tokenLogo + ", collectionName=" + this.collectionName + ", nftId=" + this.nftId + ", tokenSymbol=" + this.tokenSymbol + ", tokenAmount=" + this.tokenAmount + ", fiatAmount=" + this.fiatAmount + ", assetType=" + this.assetType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.protocolId);
        parcel.writeString(this.protocolName);
        parcel.writeString(this.tokenLogo);
        parcel.writeString(this.collectionName);
        parcel.writeString(this.nftId);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenAmount);
        parcel.writeString(this.fiatAmount);
        parcel.writeInt(this.assetType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoAssetItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UtxoAssetItem> serializer() {
            return UtxoAssetItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UtxoAssetItem(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        this.protocolId = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.protocolName = "";
        } else {
            this.protocolName = str;
        }
        if ((i & 4) == 0) {
            this.tokenLogo = "";
        } else {
            this.tokenLogo = str2;
        }
        if ((i & 8) == 0) {
            this.collectionName = "";
        } else {
            this.collectionName = str3;
        }
        if ((i & 16) == 0) {
            this.nftId = "";
        } else {
            this.nftId = str4;
        }
        if ((i & 32) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str5;
        }
        if ((i & 64) == 0) {
            this.tokenAmount = "";
        } else {
            this.tokenAmount = str6;
        }
        if ((i & 128) == 0) {
            this.fiatAmount = "";
        } else {
            this.fiatAmount = str7;
        }
        if ((i & 256) == 0) {
            this.assetType = -1;
        } else {
            this.assetType = i3;
        }
    }

    public static final /* synthetic */ void EZpvd(UtxoAssetItem utxoAssetItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || utxoAssetItem.protocolId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, utxoAssetItem.protocolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) utxoAssetItem.protocolName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, utxoAssetItem.protocolName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) utxoAssetItem.tokenLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, utxoAssetItem.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) utxoAssetItem.collectionName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, utxoAssetItem.collectionName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) utxoAssetItem.nftId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, utxoAssetItem.nftId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) utxoAssetItem.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, utxoAssetItem.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) utxoAssetItem.tokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, utxoAssetItem.tokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) utxoAssetItem.fiatAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, utxoAssetItem.fiatAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && utxoAssetItem.assetType == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 8, utxoAssetItem.assetType);
    }

    public UtxoAssetItem(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.protocolId = i;
        this.protocolName = str;
        this.tokenLogo = str2;
        this.collectionName = str3;
        this.nftId = str4;
        this.tokenSymbol = str5;
        this.tokenAmount = str6;
        this.fiatAmount = str7;
        this.assetType = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r19v0 int))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:119) call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoAssetItem.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ UtxoAssetItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) == 0 ? str7 : "", (i3 & 256) != 0 ? -1 : i2);
    }
}
