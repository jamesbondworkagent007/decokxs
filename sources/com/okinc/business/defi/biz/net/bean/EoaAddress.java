package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.wallet.api.bean.AddressType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class EoaAddress implements Parcelable {
    public static final int $stable = 0;
    private final int addressType;
    private final long chainId;
    private final String eoaAddress;
    private final String publicKey;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EoaAddress> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EoaAddress> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EoaAddress createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EoaAddress(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EoaAddress[] newArray(int i) {
            return new EoaAddress[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EoaAddress copy$default(EoaAddress eoaAddress, String str, long j, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eoaAddress.eoaAddress;
        }
        if ((i2 & 2) != 0) {
            j = eoaAddress.chainId;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            str2 = eoaAddress.publicKey;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            i = eoaAddress.addressType;
        }
        return eoaAddress.copy(str, j2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.eoaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EoaAddress copy(@NotNull String str, long j, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new EoaAddress(str, j, str2, i);
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
        if (!(obj instanceof EoaAddress)) {
            return false;
        }
        EoaAddress eoaAddress = (EoaAddress) obj;
        return Intrinsics.EZpvd((Object) this.eoaAddress, (Object) eoaAddress.eoaAddress) && this.chainId == eoaAddress.chainId && Intrinsics.EZpvd((Object) this.publicKey, (Object) eoaAddress.publicKey) && this.addressType == eoaAddress.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEoaAddress() {
        return this.eoaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.eoaAddress.hashCode() * 31) + Long.hashCode(this.chainId)) * 31) + this.publicKey.hashCode()) * 31) + Integer.hashCode(this.addressType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EoaAddress(eoaAddress=" + this.eoaAddress + ", chainId=" + this.chainId + ", publicKey=" + this.publicKey + ", addressType=" + this.addressType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.eoaAddress);
        parcel.writeLong(this.chainId);
        parcel.writeString(this.publicKey);
        parcel.writeInt(this.addressType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EoaAddress.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EoaAddress> serializer() {
            return EoaAddress$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EoaAddress(int i, String str, long j, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, EoaAddress$$serializer.INSTANCE.getDescriptor());
        }
        this.eoaAddress = str;
        this.chainId = j;
        this.publicKey = str2;
        if ((i & 8) == 0) {
            this.addressType = AddressType.Legacy.getValue();
        } else {
            this.addressType = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EoaAddress eoaAddress, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eoaAddress.eoaAddress);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, eoaAddress.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, eoaAddress.publicKey);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && eoaAddress.addressType == AddressType.Legacy.getValue()) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, eoaAddress.addressType);
    }

    public EoaAddress(@NotNull String str, long j, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.eoaAddress = str;
        this.chainId = j;
        this.publicKey = str2;
        this.addressType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 long)
  (r10v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0006: INVOKE 
  (wrap:com.okinc.wallet.api.bean.AddressType:0x0004: SGET  A[WRAPPED] (LINE:1251) com.okinc.wallet.api.bean.AddressType.Legacy com.okinc.wallet.api.bean.AddressType)
 VIRTUAL call: com.okinc.wallet.api.bean.AddressType.getValue():int A[MD:():int (m), WRAPPED] (LINE:1251)) : (r11v0 int))
 A[MD:(java.lang.String, long, java.lang.String, int):void (m)] (LINE:1247) call: com.okinc.business.defi.biz.net.bean.EoaAddress.<init>(java.lang.String, long, java.lang.String, int):void type: THIS */
    public /* synthetic */ EoaAddress(String str, long j, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, (i2 & 8) != 0 ? AddressType.Legacy.getValue() : i);
    }
}
