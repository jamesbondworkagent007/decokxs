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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class BeforeAndAfterPermission implements Parcelable {
    private final Permission after;
    private final Permission before;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BeforeAndAfterPermission> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BeforeAndAfterPermission> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BeforeAndAfterPermission createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BeforeAndAfterPermission(parcel.readInt() == 0 ? null : Permission.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Permission.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BeforeAndAfterPermission[] newArray(int i) {
            return new BeforeAndAfterPermission[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BeforeAndAfterPermission() {
        this((Permission) null, (Permission) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BeforeAndAfterPermission copy$default(BeforeAndAfterPermission beforeAndAfterPermission, Permission permission, Permission permission2, int i, Object obj) {
        if ((i & 1) != 0) {
            permission = beforeAndAfterPermission.before;
        }
        if ((i & 2) != 0) {
            permission2 = beforeAndAfterPermission.after;
        }
        return beforeAndAfterPermission.copy(permission, permission2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Permission component1() {
        return this.before;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Permission component2() {
        return this.after;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BeforeAndAfterPermission copy(Permission permission, Permission permission2) {
        return new BeforeAndAfterPermission(permission, permission2);
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
        if (!(obj instanceof BeforeAndAfterPermission)) {
            return false;
        }
        BeforeAndAfterPermission beforeAndAfterPermission = (BeforeAndAfterPermission) obj;
        return Intrinsics.EZpvd(this.before, beforeAndAfterPermission.before) && Intrinsics.EZpvd(this.after, beforeAndAfterPermission.after);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Permission getAfter() {
        return this.after;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Permission getBefore() {
        return this.before;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Permission permission = this.before;
        int iHashCode = permission == null ? 0 : permission.hashCode();
        Permission permission2 = this.after;
        return (iHashCode * 31) + (permission2 != null ? permission2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BeforeAndAfterPermission(before=" + this.before + ", after=" + this.after + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Permission permission = this.before;
        if (permission == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            permission.writeToParcel(parcel, i);
        }
        Permission permission2 = this.after;
        if (permission2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            permission2.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.BeforeAndAfterPermission.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BeforeAndAfterPermission> serializer() {
            return BeforeAndAfterPermission$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BeforeAndAfterPermission(int i, Permission permission, Permission permission2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.before = null;
        } else {
            this.before = permission;
        }
        if ((i & 2) == 0) {
            this.after = null;
        } else {
            this.after = permission2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(BeforeAndAfterPermission beforeAndAfterPermission, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || beforeAndAfterPermission.before != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, Permission$$serializer.INSTANCE, beforeAndAfterPermission.before);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && beforeAndAfterPermission.after == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, Permission$$serializer.INSTANCE, beforeAndAfterPermission.after);
    }

    public BeforeAndAfterPermission(Permission permission, Permission permission2) {
        this.before = permission;
        this.after = permission2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.biz.net.bean.Permission:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.Permission) : (r2v0 com.okinc.business.defi.biz.net.bean.Permission))
  (wrap:com.okinc.business.defi.biz.net.bean.Permission:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.Permission) : (r3v0 com.okinc.business.defi.biz.net.bean.Permission))
 A[MD:(com.okinc.business.defi.biz.net.bean.Permission, com.okinc.business.defi.biz.net.bean.Permission):void (m)] (LINE:99) call: com.okinc.business.defi.biz.net.bean.BeforeAndAfterPermission.<init>(com.okinc.business.defi.biz.net.bean.Permission, com.okinc.business.defi.biz.net.bean.Permission):void type: THIS */
    public /* synthetic */ BeforeAndAfterPermission(Permission permission, Permission permission2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : permission, (i & 2) != 0 ? null : permission2);
    }
}
