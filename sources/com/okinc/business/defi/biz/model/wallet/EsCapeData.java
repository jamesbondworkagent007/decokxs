package com.okinc.business.defi.biz.model.wallet;

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

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class EsCapeData implements Parcelable {
    private String accountName;
    private String address;
    private int addressIndex;
    private boolean isCopied;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EsCapeData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<EsCapeData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EsCapeData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EsCapeData(parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EsCapeData[] newArray(int i) {
            return new EsCapeData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EsCapeData copy$default(EsCapeData esCapeData, String str, int i, boolean z, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = esCapeData.address;
        }
        if ((i2 & 2) != 0) {
            i = esCapeData.addressIndex;
        }
        if ((i2 & 4) != 0) {
            z = esCapeData.isCopied;
        }
        if ((i2 & 8) != 0) {
            str2 = esCapeData.accountName;
        }
        return esCapeData.copy(str, i, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isCopied;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EsCapeData copy(@NotNull String str, int i, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new EsCapeData(str, i, z, str2);
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
        if (!(obj instanceof EsCapeData)) {
            return false;
        }
        EsCapeData esCapeData = (EsCapeData) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) esCapeData.address) && this.addressIndex == esCapeData.addressIndex && this.isCopied == esCapeData.isCopied && Intrinsics.EZpvd((Object) this.accountName, (Object) esCapeData.accountName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressIndex() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.address.hashCode() * 31) + Integer.hashCode(this.addressIndex)) * 31) + Boolean.hashCode(this.isCopied)) * 31) + this.accountName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCopied() {
        return this.isCopied;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressIndex(int i) {
        this.addressIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCopied(boolean z) {
        this.isCopied = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EsCapeData(address=" + this.address + ", addressIndex=" + this.addressIndex + ", isCopied=" + this.isCopied + ", accountName=" + this.accountName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeInt(this.addressIndex);
        parcel.writeInt(this.isCopied ? 1 : 0);
        parcel.writeString(this.accountName);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.model.wallet.EsCapeData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EsCapeData> serializer() {
            return EsCapeData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EsCapeData(int i, String str, int i2, boolean z, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EsCapeData$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        this.addressIndex = i2;
        if ((i & 4) == 0) {
            this.isCopied = false;
        } else {
            this.isCopied = z;
        }
        if ((i & 8) == 0) {
            this.accountName = "";
        } else {
            this.accountName = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EsCapeData esCapeData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, esCapeData.address);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, esCapeData.addressIndex);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || esCapeData.isCopied) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, esCapeData.isCopied);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) esCapeData.accountName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, esCapeData.accountName);
    }

    public EsCapeData(@NotNull String str, int i, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.address = str;
        this.addressIndex = i;
        this.isCopied = z;
        this.accountName = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, int, boolean, java.lang.String):void (m)] (LINE:98) call: com.okinc.business.defi.biz.model.wallet.EsCapeData.<init>(java.lang.String, int, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ EsCapeData(String str, int i, boolean z, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str2);
    }
}
