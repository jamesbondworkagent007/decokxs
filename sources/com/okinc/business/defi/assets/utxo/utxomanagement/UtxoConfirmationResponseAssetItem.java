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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C10345bmh;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class UtxoConfirmationResponseAssetItem implements Parcelable {
    public static final int $stable = 0;
    public final String collectionName;
    public final String inscriptionNumber;
    public final String nftId;
    public final Integer protocolId;
    public final String protocolName;
    public final String tokenAmount;
    public final String tokenId;
    public final String tokenSymbol;
    public final String usdAmount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UtxoConfirmationResponseAssetItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UtxoConfirmationResponseAssetItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoConfirmationResponseAssetItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UtxoConfirmationResponseAssetItem(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoConfirmationResponseAssetItem[] newArray(int i) {
            return new UtxoConfirmationResponseAssetItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UtxoConfirmationResponseAssetItem() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.collectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.inscriptionNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.protocolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoConfirmationResponseAssetItem OLrzqt(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new UtxoConfirmationResponseAssetItem(num, str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.nftId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtxoConfirmationResponseAssetItem)) {
            return false;
        }
        UtxoConfirmationResponseAssetItem utxoConfirmationResponseAssetItem = (UtxoConfirmationResponseAssetItem) obj;
        return Intrinsics.EZpvd(this.protocolId, utxoConfirmationResponseAssetItem.protocolId) && Intrinsics.EZpvd((Object) this.protocolName, (Object) utxoConfirmationResponseAssetItem.protocolName) && Intrinsics.EZpvd((Object) this.collectionName, (Object) utxoConfirmationResponseAssetItem.collectionName) && Intrinsics.EZpvd((Object) this.nftId, (Object) utxoConfirmationResponseAssetItem.nftId) && Intrinsics.EZpvd((Object) this.inscriptionNumber, (Object) utxoConfirmationResponseAssetItem.inscriptionNumber) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) utxoConfirmationResponseAssetItem.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) utxoConfirmationResponseAssetItem.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) utxoConfirmationResponseAssetItem.usdAmount) && Intrinsics.EZpvd((Object) this.tokenId, (Object) utxoConfirmationResponseAssetItem.tokenId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.protocolId;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.protocolName;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.collectionName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nftId;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.inscriptionNumber;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenSymbol;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tokenAmount;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.usdAmount;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.tokenId;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoConfirmationResponseAssetItem(protocolId=" + this.protocolId + ", protocolName=" + this.protocolName + ", collectionName=" + this.collectionName + ", nftId=" + this.nftId + ", inscriptionNumber=" + this.inscriptionNumber + ", tokenSymbol=" + this.tokenSymbol + ", tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", tokenId=" + this.tokenId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.protocolId;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.protocolName);
        parcel.writeString(this.collectionName);
        parcel.writeString(this.nftId);
        parcel.writeString(this.inscriptionNumber);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenAmount);
        parcel.writeString(this.usdAmount);
        parcel.writeString(this.tokenId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponseAssetItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UtxoConfirmationResponseAssetItem> serializer() {
            return UtxoConfirmationResponseAssetItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UtxoConfirmationResponseAssetItem(int i, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.protocolId = null;
        } else {
            this.protocolId = num;
        }
        if ((i & 2) == 0) {
            this.protocolName = null;
        } else {
            this.protocolName = str;
        }
        if ((i & 4) == 0) {
            this.collectionName = null;
        } else {
            this.collectionName = str2;
        }
        if ((i & 8) == 0) {
            this.nftId = null;
        } else {
            this.nftId = str3;
        }
        if ((i & 16) == 0) {
            this.inscriptionNumber = null;
        } else {
            this.inscriptionNumber = str4;
        }
        if ((i & 32) == 0) {
            this.tokenSymbol = null;
        } else {
            this.tokenSymbol = str5;
        }
        if ((i & 64) == 0) {
            this.tokenAmount = null;
        } else {
            this.tokenAmount = str6;
        }
        if ((i & 128) == 0) {
            this.usdAmount = null;
        } else {
            this.usdAmount = str7;
        }
        if ((i & 256) == 0) {
            this.tokenId = null;
        } else {
            this.tokenId = str8;
        }
    }

    public static final /* synthetic */ void OLrzqt(UtxoConfirmationResponseAssetItem utxoConfirmationResponseAssetItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || utxoConfirmationResponseAssetItem.protocolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, utxoConfirmationResponseAssetItem.protocolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || utxoConfirmationResponseAssetItem.protocolName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, utxoConfirmationResponseAssetItem.protocolName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || utxoConfirmationResponseAssetItem.collectionName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, utxoConfirmationResponseAssetItem.collectionName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || utxoConfirmationResponseAssetItem.nftId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, utxoConfirmationResponseAssetItem.nftId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || utxoConfirmationResponseAssetItem.inscriptionNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, utxoConfirmationResponseAssetItem.inscriptionNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || utxoConfirmationResponseAssetItem.tokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, utxoConfirmationResponseAssetItem.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || utxoConfirmationResponseAssetItem.tokenAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, utxoConfirmationResponseAssetItem.tokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || utxoConfirmationResponseAssetItem.usdAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, utxoConfirmationResponseAssetItem.usdAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && utxoConfirmationResponseAssetItem.tokenId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, utxoConfirmationResponseAssetItem.tokenId);
    }

    public UtxoConfirmationResponseAssetItem(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.protocolId = num;
        this.protocolName = str;
        this.collectionName = str2;
        this.nftId = str3;
        this.inscriptionNumber = str4;
        this.tokenSymbol = str5;
        this.tokenAmount = str6;
        this.usdAmount = str7;
        this.tokenId = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:95) call: com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponseAssetItem.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UtxoConfirmationResponseAssetItem(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) == 0 ? str8 : null);
    }

    public final C10345bmh valueOf() {
        if (C33129mqd.OLrzqt((CharSequence) this.tokenSymbol)) {
            String str = this.tokenAmount;
            if (str == null) {
                str = "";
            }
            String str2 = this.tokenSymbol;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.usdAmount;
            return new C10345bmh(str, str2, str3 != null ? str3 : "");
        }
        if (C33129mqd.OLrzqt((CharSequence) this.collectionName) && C33129mqd.OLrzqt((CharSequence) this.inscriptionNumber)) {
            String str4 = this.collectionName + " " + this.inscriptionNumber;
            String str5 = this.usdAmount;
            if (str5 == null) {
                str5 = "";
            }
            return new C10345bmh("", str4, str5);
        }
        String strValueOf = String.valueOf(this.nftId);
        String str6 = this.usdAmount;
        if (str6 == null) {
            str6 = "";
        }
        return new C10345bmh("", strValueOf, str6);
    }
}
