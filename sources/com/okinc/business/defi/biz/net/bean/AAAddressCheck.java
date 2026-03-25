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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class AAAddressCheck implements Parcelable {
    public String address;
    public boolean isSmartContract;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AAAddressCheck> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AAAddressCheck> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AAAddressCheck createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AAAddressCheck(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AAAddressCheck[] newArray(int i) {
            return new AAAddressCheck[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AAAddressCheck() {
        this((String) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AAAddressCheck copy$default(AAAddressCheck aAAddressCheck, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aAAddressCheck.address;
        }
        if ((i & 2) != 0) {
            z = aAAddressCheck.isSmartContract;
        }
        return aAAddressCheck.OLrzqt(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAAddressCheck OLrzqt(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AAAddressCheck(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.isSmartContract;
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
        if (!(obj instanceof AAAddressCheck)) {
            return false;
        }
        AAAddressCheck aAAddressCheck = (AAAddressCheck) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) aAAddressCheck.address) && this.isSmartContract == aAAddressCheck.isSmartContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.address.hashCode() * 31) + Boolean.hashCode(this.isSmartContract);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AAAddressCheck(address=" + this.address + ", isSmartContract=" + this.isSmartContract + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeInt(this.isSmartContract ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AAAddressCheck.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AAAddressCheck> serializer() {
            return AAAddressCheck$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AAAddressCheck(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.address = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.isSmartContract = false;
        } else {
            this.isSmartContract = z;
        }
    }

    public static final /* synthetic */ void KWHzl(AAAddressCheck aAAddressCheck, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) aAAddressCheck.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, aAAddressCheck.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || aAAddressCheck.isSmartContract) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, aAAddressCheck.isSmartContract);
        }
    }

    public AAAddressCheck(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
        this.isSmartContract = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:663) call: com.okinc.business.defi.biz.net.bean.AAAddressCheck.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ AAAddressCheck(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}
