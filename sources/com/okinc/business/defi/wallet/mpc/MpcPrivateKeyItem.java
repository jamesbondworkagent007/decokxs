package com.okinc.business.defi.wallet.mpc;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class MpcPrivateKeyItem implements Parcelable {
    private final String address;
    private final long chainId;
    private String chainName;
    private String imageUrl;
    private final String privateKey;
    private boolean privateKeyContainerIsOpen;
    private boolean privateKeyIsEye;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MpcPrivateKeyItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MpcPrivateKeyItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpcPrivateKeyItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MpcPrivateKeyItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpcPrivateKeyItem[] newArray(int i) {
            return new MpcPrivateKeyItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.privateKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.privateKeyContainerIsOpen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.privateKeyIsEye;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcPrivateKeyItem copy(long j, @NotNull String str, @NotNull String str2, boolean z, boolean z2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new MpcPrivateKeyItem(j, str, str2, z, z2, str3, str4);
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
        if (!(obj instanceof MpcPrivateKeyItem)) {
            return false;
        }
        MpcPrivateKeyItem mpcPrivateKeyItem = (MpcPrivateKeyItem) obj;
        return this.chainId == mpcPrivateKeyItem.chainId && Intrinsics.EZpvd((Object) this.privateKey, (Object) mpcPrivateKeyItem.privateKey) && Intrinsics.EZpvd((Object) this.address, (Object) mpcPrivateKeyItem.address) && this.privateKeyContainerIsOpen == mpcPrivateKeyItem.privateKeyContainerIsOpen && this.privateKeyIsEye == mpcPrivateKeyItem.privateKeyIsEye && Intrinsics.EZpvd((Object) this.chainName, (Object) mpcPrivateKeyItem.chainName) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) mpcPrivateKeyItem.imageUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrivateKey() {
        return this.privateKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPrivateKeyContainerIsOpen() {
        return this.privateKeyContainerIsOpen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPrivateKeyIsEye() {
        return this.privateKeyIsEye;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Long.hashCode(this.chainId) * 31) + this.privateKey.hashCode()) * 31) + this.address.hashCode()) * 31) + Boolean.hashCode(this.privateKeyContainerIsOpen)) * 31) + Boolean.hashCode(this.privateKeyIsEye)) * 31) + this.chainName.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrivateKeyContainerIsOpen(boolean z) {
        this.privateKeyContainerIsOpen = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrivateKeyIsEye(boolean z) {
        this.privateKeyIsEye = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MpcPrivateKeyItem(chainId=" + this.chainId + ", privateKey=" + this.privateKey + ", address=" + this.address + ", privateKeyContainerIsOpen=" + this.privateKeyContainerIsOpen + ", privateKeyIsEye=" + this.privateKeyIsEye + ", chainName=" + this.chainName + ", imageUrl=" + this.imageUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        parcel.writeString(this.privateKey);
        parcel.writeString(this.address);
        parcel.writeInt(this.privateKeyContainerIsOpen ? 1 : 0);
        parcel.writeInt(this.privateKeyIsEye ? 1 : 0);
        parcel.writeString(this.chainName);
        parcel.writeString(this.imageUrl);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mpc.MpcPrivateKeyItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MpcPrivateKeyItem> serializer() {
            return MpcPrivateKeyItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MpcPrivateKeyItem(int i, long j, String str, String str2, boolean z, boolean z2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (103 != (i & 103)) {
            PluginExceptionsKt.throwMissingFieldException(i, 103, MpcPrivateKeyItem$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = j;
        this.privateKey = str;
        this.address = str2;
        if ((i & 8) == 0) {
            this.privateKeyContainerIsOpen = false;
        } else {
            this.privateKeyContainerIsOpen = z;
        }
        if ((i & 16) == 0) {
            this.privateKeyIsEye = false;
        } else {
            this.privateKeyIsEye = z2;
        }
        this.chainName = str3;
        this.imageUrl = str4;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(MpcPrivateKeyItem mpcPrivateKeyItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, mpcPrivateKeyItem.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, mpcPrivateKeyItem.privateKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, mpcPrivateKeyItem.address);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || mpcPrivateKeyItem.privateKeyContainerIsOpen) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, mpcPrivateKeyItem.privateKeyContainerIsOpen);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || mpcPrivateKeyItem.privateKeyIsEye) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, mpcPrivateKeyItem.privateKeyIsEye);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, mpcPrivateKeyItem.chainName);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, mpcPrivateKeyItem.imageUrl);
    }

    public MpcPrivateKeyItem(long j, @NotNull String str, @NotNull String str2, boolean z, boolean z2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.chainId = j;
        this.privateKey = str;
        this.address = str2;
        this.privateKeyContainerIsOpen = z;
        this.privateKeyIsEye = z2;
        this.chainName = str3;
        this.imageUrl = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r12v0 long)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
 A[MD:(long, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.defi.wallet.mpc.MpcPrivateKeyItem.<init>(long, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MpcPrivateKeyItem(long j, String str, String str2, boolean z, boolean z2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, str3, str4);
    }
}
