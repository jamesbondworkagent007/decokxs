package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TxDetailApproveInfo implements Parcelable {
    private String nftCollectionAddress;
    private String nftCollectionIcon;
    private String nftCollectionName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TxDetailApproveInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TxDetailApproveInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxDetailApproveInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TxDetailApproveInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxDetailApproveInfo[] newArray(int i) {
            return new TxDetailApproveInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TxDetailApproveInfo() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TxDetailApproveInfo copy$default(TxDetailApproveInfo txDetailApproveInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = txDetailApproveInfo.nftCollectionAddress;
        }
        if ((i & 2) != 0) {
            str2 = txDetailApproveInfo.nftCollectionIcon;
        }
        if ((i & 4) != 0) {
            str3 = txDetailApproveInfo.nftCollectionName;
        }
        return txDetailApproveInfo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nftCollectionAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nftCollectionIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nftCollectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxDetailApproveInfo copy(String str, String str2, String str3) {
        return new TxDetailApproveInfo(str, str2, str3);
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
        if (!(obj instanceof TxDetailApproveInfo)) {
            return false;
        }
        TxDetailApproveInfo txDetailApproveInfo = (TxDetailApproveInfo) obj;
        return Intrinsics.EZpvd((Object) this.nftCollectionAddress, (Object) txDetailApproveInfo.nftCollectionAddress) && Intrinsics.EZpvd((Object) this.nftCollectionIcon, (Object) txDetailApproveInfo.nftCollectionIcon) && Intrinsics.EZpvd((Object) this.nftCollectionName, (Object) txDetailApproveInfo.nftCollectionName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftCollectionAddress() {
        return this.nftCollectionAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftCollectionIcon() {
        return this.nftCollectionIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftCollectionName() {
        return this.nftCollectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nftCollectionAddress;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.nftCollectionIcon;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nftCollectionName;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftCollectionAddress(String str) {
        this.nftCollectionAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftCollectionIcon(String str) {
        this.nftCollectionIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftCollectionName(String str) {
        this.nftCollectionName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxDetailApproveInfo(nftCollectionAddress=" + this.nftCollectionAddress + ", nftCollectionIcon=" + this.nftCollectionIcon + ", nftCollectionName=" + this.nftCollectionName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.nftCollectionAddress);
        parcel.writeString(this.nftCollectionIcon);
        parcel.writeString(this.nftCollectionName);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.TxDetailApproveInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TxDetailApproveInfo> serializer() {
            return TxDetailApproveInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TxDetailApproveInfo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nftCollectionAddress = null;
        } else {
            this.nftCollectionAddress = str;
        }
        if ((i & 2) == 0) {
            this.nftCollectionIcon = null;
        } else {
            this.nftCollectionIcon = str2;
        }
        if ((i & 4) == 0) {
            this.nftCollectionName = null;
        } else {
            this.nftCollectionName = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TxDetailApproveInfo txDetailApproveInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || txDetailApproveInfo.nftCollectionAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, txDetailApproveInfo.nftCollectionAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || txDetailApproveInfo.nftCollectionIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, txDetailApproveInfo.nftCollectionIcon);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && txDetailApproveInfo.nftCollectionName == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, txDetailApproveInfo.nftCollectionName);
    }

    public TxDetailApproveInfo(String str, String str2, String str3) {
        this.nftCollectionAddress = str;
        this.nftCollectionIcon = str2;
        this.nftCollectionName = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:332) call: com.okinc.business.defi.biz.net.bean.TxDetailApproveInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TxDetailApproveInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
