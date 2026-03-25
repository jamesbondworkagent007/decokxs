package com.okinc.assets.backend.api.model;

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

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class PasskeyStatus implements Parcelable {
    public static final int $stable = 0;
    private final boolean enabled;
    private final boolean exceededLimit;
    private final boolean forceUsingPasskey;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PasskeyStatus> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PasskeyStatus> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyStatus createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PasskeyStatus(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyStatus[] newArray(int i) {
            return new PasskeyStatus[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PasskeyStatus() {
        this(false, false, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyStatus copy$default(PasskeyStatus passkeyStatus, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = passkeyStatus.enabled;
        }
        if ((i & 2) != 0) {
            z2 = passkeyStatus.exceededLimit;
        }
        if ((i & 4) != 0) {
            z3 = passkeyStatus.forceUsingPasskey;
        }
        return passkeyStatus.copy(z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.exceededLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.forceUsingPasskey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyStatus copy(boolean z, boolean z2, boolean z3) {
        return new PasskeyStatus(z, z2, z3);
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
        if (!(obj instanceof PasskeyStatus)) {
            return false;
        }
        PasskeyStatus passkeyStatus = (PasskeyStatus) obj;
        return this.enabled == passkeyStatus.enabled && this.exceededLimit == passkeyStatus.exceededLimit && this.forceUsingPasskey == passkeyStatus.forceUsingPasskey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getExceededLimit() {
        return this.exceededLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getForceUsingPasskey() {
        return this.forceUsingPasskey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.enabled) * 31) + Boolean.hashCode(this.exceededLimit)) * 31) + Boolean.hashCode(this.forceUsingPasskey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyStatus(enabled=" + this.enabled + ", exceededLimit=" + this.exceededLimit + ", forceUsingPasskey=" + this.forceUsingPasskey + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeInt(this.exceededLimit ? 1 : 0);
        parcel.writeInt(this.forceUsingPasskey ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.PasskeyStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyStatus> serializer() {
            return PasskeyStatus$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyStatus(int i, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.enabled = false;
        } else {
            this.enabled = z;
        }
        if ((i & 2) == 0) {
            this.exceededLimit = false;
        } else {
            this.exceededLimit = z2;
        }
        if ((i & 4) == 0) {
            this.forceUsingPasskey = false;
        } else {
            this.forceUsingPasskey = z3;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(PasskeyStatus passkeyStatus, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || passkeyStatus.enabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, passkeyStatus.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || passkeyStatus.exceededLimit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, passkeyStatus.exceededLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || passkeyStatus.forceUsingPasskey) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, passkeyStatus.forceUsingPasskey);
        }
    }

    public PasskeyStatus(boolean z, boolean z2, boolean z3) {
        this.enabled = z;
        this.exceededLimit = z2;
        this.forceUsingPasskey = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(boolean, boolean, boolean):void (m)] (LINE:112) call: com.okinc.assets.backend.api.model.PasskeyStatus.<init>(boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ PasskeyStatus(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
