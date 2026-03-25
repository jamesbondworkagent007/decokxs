package com.okinc.business.defi.biz.net.bean;

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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CheckAaAddressResponse implements Parcelable {
    public static final int $stable = 0;
    private final String aaAddress;
    private final long chainId;
    private final String eoaAddress;
    private final boolean hasAaAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CheckAaAddressResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CheckAaAddressResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckAaAddressResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CheckAaAddressResponse(parcel.readString(), parcel.readLong(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckAaAddressResponse[] newArray(int i) {
            return new CheckAaAddressResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckAaAddressResponse copy$default(CheckAaAddressResponse checkAaAddressResponse, String str, long j, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkAaAddressResponse.eoaAddress;
        }
        if ((i & 2) != 0) {
            j = checkAaAddressResponse.chainId;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z = checkAaAddressResponse.hasAaAddress;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str2 = checkAaAddressResponse.aaAddress;
        }
        return checkAaAddressResponse.copy(str, j2, z2, str2);
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
    public final boolean component3() {
        return this.hasAaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.aaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckAaAddressResponse copy(@NotNull String str, long j, boolean z, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CheckAaAddressResponse(str, j, z, str2);
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
        if (!(obj instanceof CheckAaAddressResponse)) {
            return false;
        }
        CheckAaAddressResponse checkAaAddressResponse = (CheckAaAddressResponse) obj;
        return Intrinsics.EZpvd((Object) this.eoaAddress, (Object) checkAaAddressResponse.eoaAddress) && this.chainId == checkAaAddressResponse.chainId && this.hasAaAddress == checkAaAddressResponse.hasAaAddress && Intrinsics.EZpvd((Object) this.aaAddress, (Object) checkAaAddressResponse.aaAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAaAddress() {
        return this.aaAddress;
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
    public final boolean getHasAaAddress() {
        return this.hasAaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.eoaAddress.hashCode();
        int iHashCode2 = Long.hashCode(this.chainId);
        int iHashCode3 = Boolean.hashCode(this.hasAaAddress);
        String str = this.aaAddress;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckAaAddressResponse(eoaAddress=" + this.eoaAddress + ", chainId=" + this.chainId + ", hasAaAddress=" + this.hasAaAddress + ", aaAddress=" + this.aaAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.eoaAddress);
        parcel.writeLong(this.chainId);
        parcel.writeInt(this.hasAaAddress ? 1 : 0);
        parcel.writeString(this.aaAddress);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CheckAaAddressResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckAaAddressResponse> serializer() {
            return CheckAaAddressResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckAaAddressResponse(int i, String str, long j, boolean z, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CheckAaAddressResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.eoaAddress = str;
        this.chainId = j;
        this.hasAaAddress = z;
        if ((i & 8) == 0) {
            this.aaAddress = null;
        } else {
            this.aaAddress = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CheckAaAddressResponse checkAaAddressResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, checkAaAddressResponse.eoaAddress);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, checkAaAddressResponse.chainId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, checkAaAddressResponse.hasAaAddress);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && checkAaAddressResponse.aaAddress == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, checkAaAddressResponse.aaAddress);
    }

    public CheckAaAddressResponse(@NotNull String str, long j, boolean z, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eoaAddress = str;
        this.chainId = j;
        this.hasAaAddress = z;
        this.aaAddress = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 long)
  (r10v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, long, boolean, java.lang.String):void (m)] (LINE:1216) call: com.okinc.business.defi.biz.net.bean.CheckAaAddressResponse.<init>(java.lang.String, long, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ CheckAaAddressResponse(String str, long j, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, z, (i & 8) != 0 ? null : str2);
    }
}
